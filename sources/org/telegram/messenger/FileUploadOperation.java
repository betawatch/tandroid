package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.WriteToSocketDelegate;

/* loaded from: classes3.dex */
public class FileUploadOperation {
    private static final int initialRequestsCount = 8;
    private static final int initialRequestsSlowNetworkCount = 1;
    private static final int maxUploadingKBytes = 2048;
    private static final int maxUploadingSlowNetworkKBytes = 32;
    private static final int minUploadChunkSize = 128;
    private static final int minUploadChunkSlowNetworkSize = 32;
    private long availableSize;
    public volatile boolean caughtPremiumFloodWait;
    private int currentAccount;
    private long currentFileId;
    private int currentPartNum;
    private int currentType;
    private int currentUploadRequetsCount;
    private FileUploadOperationDelegate delegate;
    private long estimatedSize;
    private String fileKey;
    private int fingerprint;
    private boolean forceSmallFile;
    private ArrayList<byte[]> freeRequestIvs;
    private boolean isBigFile;
    private boolean isEncrypted;
    private boolean isLastPart;
    private byte[] iv;
    private byte[] ivChange;
    private byte[] key;
    protected long lastProgressUpdateTime;
    private int lastSavedPartNum;
    private int maxRequestsCount;
    private boolean nextPartFirst;
    private int operationGuid;
    private SharedPreferences preferences;
    private byte[] readBuffer;
    private long readBytesCount;
    private int requestNum;
    private int saveInfoTimes;
    private boolean slowNetwork;
    private boolean started;
    private int state;
    private RandomAccessFile stream;
    private long totalFileSize;
    private int totalPartsCount;
    private boolean uploadFirstPartLater;
    private int uploadStartTime;
    private long uploadedBytesCount;
    private String uploadingFilePath;
    private int uploadChunkSize = 65536;
    public final SparseIntArray requestTokens = new SparseIntArray();
    public final ArrayList<Integer> uiRequestTokens = new ArrayList<>();
    private SparseArray<UploadCachedResult> cachedResults = new SparseArray<>();
    private boolean[] recalculatedEstimatedSize = {false, false};

    public interface FileUploadOperationDelegate {
        void didChangedUploadProgress(FileUploadOperation fileUploadOperation, long j, long j2);

        void didFailedUploadingFile(FileUploadOperation fileUploadOperation);

        void didFinishUploadingFile(FileUploadOperation fileUploadOperation, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2);
    }

    private static class UploadCachedResult {
        private long bytesOffset;
        private byte[] iv;

        private UploadCachedResult() {
        }
    }

    public FileUploadOperation(int i, String str, boolean z, long j, int i2) {
        boolean z2 = false;
        this.currentAccount = i;
        this.uploadingFilePath = str;
        this.isEncrypted = z;
        this.estimatedSize = j;
        this.currentType = i2;
        if (j != 0 && !z) {
            z2 = true;
        }
        this.uploadFirstPartLater = z2;
    }

    public long getTotalFileSize() {
        return this.totalFileSize;
    }

    public void setDelegate(FileUploadOperationDelegate fileUploadOperationDelegate) {
        this.delegate = fileUploadOperationDelegate;
    }

    public void start() {
        if (this.state != 0) {
            return;
        }
        this.state = 1;
        AutoDeleteMediaTask.lockFile(this.uploadingFilePath);
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                FileUploadOperation.this.lambda$start$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("uploadinfo", 0);
        this.slowNetwork = ApplicationLoader.isConnectionSlow();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload on slow network = " + this.slowNetwork);
        }
        int i = this.slowNetwork ? 1 : 8;
        for (int i2 = 0; i2 < i; i2++) {
            startUploadRequest();
        }
    }

    protected void onNetworkChanged(final boolean z) {
        if (this.state != 1) {
            return;
        }
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                FileUploadOperation.this.lambda$onNetworkChanged$1(z);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                FileUploadOperation.this.lambda$onNetworkChanged$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNetworkChanged$1(boolean z) {
        if (this.slowNetwork != z) {
            this.slowNetwork = z;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("network changed to slow = " + this.slowNetwork);
            }
            int i = 0;
            while (true) {
                if (i >= this.requestTokens.size()) {
                    break;
                }
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestTokens.valueAt(i), true);
                i++;
            }
            this.requestTokens.clear();
            cleanup();
            this.isLastPart = false;
            this.nextPartFirst = false;
            this.requestNum = 0;
            this.currentPartNum = 0;
            this.readBytesCount = 0L;
            this.uploadedBytesCount = 0L;
            this.saveInfoTimes = 0;
            this.key = null;
            this.iv = null;
            this.ivChange = null;
            this.currentUploadRequetsCount = 0;
            this.lastSavedPartNum = 0;
            this.uploadFirstPartLater = false;
            this.cachedResults.clear();
            this.operationGuid++;
            int i2 = this.slowNetwork ? 1 : 8;
            for (int i3 = 0; i3 < i2; i3++) {
                startUploadRequest();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNetworkChanged$2() {
        this.uiRequestTokens.clear();
    }

    public void cancel() {
        if (this.state == 3) {
            return;
        }
        this.state = 2;
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                FileUploadOperation.this.lambda$cancel$3();
            }
        });
        AutoDeleteMediaTask.unlockFile(this.uploadingFilePath);
        this.delegate.didFailedUploadingFile(this);
        cleanup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancel$3() {
        for (int i = 0; i < this.requestTokens.size(); i++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestTokens.valueAt(i), true);
        }
    }

    private void cleanup() {
        if (this.preferences == null) {
            this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("uploadinfo", 0);
        }
        this.preferences.edit().remove(this.fileKey + "_time").remove(this.fileKey + "_size").remove(this.fileKey + "_uploaded").remove(this.fileKey + "_id").remove(this.fileKey + "_iv").remove(this.fileKey + "_key").remove(this.fileKey + "_ivc").commit();
        try {
            RandomAccessFile randomAccessFile = this.stream;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.stream = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AutoDeleteMediaTask.unlockFile(this.uploadingFilePath);
    }

    protected void checkNewDataAvailable(final long j, final long j2, final Float f) {
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FileUploadOperation.this.lambda$checkNewDataAvailable$4(f, j2, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$checkNewDataAvailable$4(Float f, long j, long j2) {
        if (f != null && this.estimatedSize != 0 && j == 0) {
            boolean z = false;
            boolean z2 = true;
            if (f.floatValue() > 0.75f) {
                boolean[] zArr = this.recalculatedEstimatedSize;
                if (!zArr[0]) {
                    zArr[0] = true;
                    z = true;
                }
            }
            if (f.floatValue() > 0.95f) {
                boolean[] zArr2 = this.recalculatedEstimatedSize;
                if (!zArr2[1]) {
                    zArr2[1] = true;
                    if (z2) {
                        this.estimatedSize = (long) (j2 / f.floatValue());
                    }
                }
            }
            z2 = z;
            if (z2) {
            }
        }
        if (this.estimatedSize != 0 && j != 0) {
            this.estimatedSize = 0L;
            this.totalFileSize = j;
            calcTotalPartsCount();
            if (!this.uploadFirstPartLater && this.started) {
                storeFileUploadInfo();
            }
        }
        if (j <= 0) {
            j = j2;
        }
        this.availableSize = j;
        if (this.currentUploadRequetsCount < this.maxRequestsCount) {
            startUploadRequest();
        }
    }

    private void storeFileUploadInfo() {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putInt(this.fileKey + "_time", this.uploadStartTime);
        edit.putLong(this.fileKey + "_size", this.totalFileSize);
        edit.putLong(this.fileKey + "_id", this.currentFileId);
        edit.remove(this.fileKey + "_uploaded");
        if (this.isEncrypted) {
            edit.putString(this.fileKey + "_iv", Utilities.bytesToHex(this.iv));
            edit.putString(this.fileKey + "_ivc", Utilities.bytesToHex(this.ivChange));
            edit.putString(this.fileKey + "_key", Utilities.bytesToHex(this.key));
        }
        edit.commit();
    }

    private void calcTotalPartsCount() {
        if (this.uploadFirstPartLater) {
            if (this.isBigFile) {
                long j = this.totalFileSize;
                long j2 = this.uploadChunkSize;
                this.totalPartsCount = ((int) ((((j - j2) + j2) - 1) / j2)) + 1;
                return;
            } else {
                long j3 = this.totalFileSize - 1024;
                long j4 = this.uploadChunkSize;
                this.totalPartsCount = ((int) (((j3 + j4) - 1) / j4)) + 1;
                return;
            }
        }
        long j5 = this.totalFileSize;
        long j6 = this.uploadChunkSize;
        this.totalPartsCount = (int) (((j5 + j6) - 1) / j6);
    }

    public void setForceSmallFile() {
        this.forceSmallFile = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x022b, code lost:
    
        if (r0 < (r29.uploadStartTime - 5400.0f)) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f4 A[Catch: Exception -> 0x0053, TryCatch #2 {Exception -> 0x0053, blocks: (B:6:0x0008, B:8:0x0015, B:12:0x004a, B:14:0x0050, B:15:0x005c, B:17:0x0060, B:19:0x0069, B:20:0x006b, B:22:0x0084, B:24:0x008d, B:25:0x0096, B:28:0x009f, B:31:0x00ba, B:33:0x00be, B:35:0x00c1, B:36:0x00c3, B:39:0x00cc, B:41:0x00d9, B:42:0x00e3, B:44:0x00e7, B:46:0x00f1, B:49:0x0113, B:51:0x0149, B:53:0x014d, B:55:0x0155, B:57:0x015b, B:59:0x01b1, B:62:0x01e9, B:65:0x01fb, B:67:0x01fe, B:69:0x0201, B:73:0x0211, B:75:0x0215, B:82:0x0236, B:85:0x0243, B:87:0x024e, B:89:0x025a, B:91:0x025e, B:92:0x0264, B:94:0x026f, B:96:0x0278, B:100:0x0285, B:102:0x028c, B:104:0x02a3, B:106:0x0276, B:109:0x02af, B:111:0x02b8, B:113:0x02d4, B:115:0x02dc, B:118:0x02f4, B:120:0x02f8, B:121:0x0318, B:123:0x0324, B:125:0x0328, B:127:0x0330, B:128:0x0333, B:130:0x036a, B:132:0x0376, B:134:0x037a, B:135:0x0391, B:136:0x0388, B:146:0x0367, B:147:0x02df, B:149:0x02e8, B:152:0x0220, B:159:0x0056, B:160:0x0394, B:161:0x039c, B:164:0x0044, B:165:0x039d, B:167:0x03a5, B:170:0x03b2, B:172:0x03b6, B:174:0x03c1, B:175:0x03d6, B:180:0x03e7, B:182:0x03eb, B:184:0x03ef, B:185:0x03f5, B:187:0x0400, B:189:0x0404, B:191:0x040c, B:193:0x041f, B:197:0x042c, B:199:0x0433, B:200:0x0460, B:202:0x0464, B:204:0x0479, B:205:0x0480, B:207:0x0496, B:209:0x049a, B:211:0x049e, B:212:0x04ad, B:226:0x047c, B:227:0x0486, B:229:0x0413, B:231:0x0417, B:232:0x041d, B:234:0x03cb, B:235:0x03da, B:10:0x0026, B:138:0x0337, B:141:0x0352), top: B:5:0x0008, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0376 A[Catch: Exception -> 0x0053, TryCatch #2 {Exception -> 0x0053, blocks: (B:6:0x0008, B:8:0x0015, B:12:0x004a, B:14:0x0050, B:15:0x005c, B:17:0x0060, B:19:0x0069, B:20:0x006b, B:22:0x0084, B:24:0x008d, B:25:0x0096, B:28:0x009f, B:31:0x00ba, B:33:0x00be, B:35:0x00c1, B:36:0x00c3, B:39:0x00cc, B:41:0x00d9, B:42:0x00e3, B:44:0x00e7, B:46:0x00f1, B:49:0x0113, B:51:0x0149, B:53:0x014d, B:55:0x0155, B:57:0x015b, B:59:0x01b1, B:62:0x01e9, B:65:0x01fb, B:67:0x01fe, B:69:0x0201, B:73:0x0211, B:75:0x0215, B:82:0x0236, B:85:0x0243, B:87:0x024e, B:89:0x025a, B:91:0x025e, B:92:0x0264, B:94:0x026f, B:96:0x0278, B:100:0x0285, B:102:0x028c, B:104:0x02a3, B:106:0x0276, B:109:0x02af, B:111:0x02b8, B:113:0x02d4, B:115:0x02dc, B:118:0x02f4, B:120:0x02f8, B:121:0x0318, B:123:0x0324, B:125:0x0328, B:127:0x0330, B:128:0x0333, B:130:0x036a, B:132:0x0376, B:134:0x037a, B:135:0x0391, B:136:0x0388, B:146:0x0367, B:147:0x02df, B:149:0x02e8, B:152:0x0220, B:159:0x0056, B:160:0x0394, B:161:0x039c, B:164:0x0044, B:165:0x039d, B:167:0x03a5, B:170:0x03b2, B:172:0x03b6, B:174:0x03c1, B:175:0x03d6, B:180:0x03e7, B:182:0x03eb, B:184:0x03ef, B:185:0x03f5, B:187:0x0400, B:189:0x0404, B:191:0x040c, B:193:0x041f, B:197:0x042c, B:199:0x0433, B:200:0x0460, B:202:0x0464, B:204:0x0479, B:205:0x0480, B:207:0x0496, B:209:0x049a, B:211:0x049e, B:212:0x04ad, B:226:0x047c, B:227:0x0486, B:229:0x0413, B:231:0x0417, B:232:0x041d, B:234:0x03cb, B:235:0x03da, B:10:0x0026, B:138:0x0337, B:141:0x0352), top: B:5:0x0008, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0337 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0220 A[Catch: Exception -> 0x0053, TryCatch #2 {Exception -> 0x0053, blocks: (B:6:0x0008, B:8:0x0015, B:12:0x004a, B:14:0x0050, B:15:0x005c, B:17:0x0060, B:19:0x0069, B:20:0x006b, B:22:0x0084, B:24:0x008d, B:25:0x0096, B:28:0x009f, B:31:0x00ba, B:33:0x00be, B:35:0x00c1, B:36:0x00c3, B:39:0x00cc, B:41:0x00d9, B:42:0x00e3, B:44:0x00e7, B:46:0x00f1, B:49:0x0113, B:51:0x0149, B:53:0x014d, B:55:0x0155, B:57:0x015b, B:59:0x01b1, B:62:0x01e9, B:65:0x01fb, B:67:0x01fe, B:69:0x0201, B:73:0x0211, B:75:0x0215, B:82:0x0236, B:85:0x0243, B:87:0x024e, B:89:0x025a, B:91:0x025e, B:92:0x0264, B:94:0x026f, B:96:0x0278, B:100:0x0285, B:102:0x028c, B:104:0x02a3, B:106:0x0276, B:109:0x02af, B:111:0x02b8, B:113:0x02d4, B:115:0x02dc, B:118:0x02f4, B:120:0x02f8, B:121:0x0318, B:123:0x0324, B:125:0x0328, B:127:0x0330, B:128:0x0333, B:130:0x036a, B:132:0x0376, B:134:0x037a, B:135:0x0391, B:136:0x0388, B:146:0x0367, B:147:0x02df, B:149:0x02e8, B:152:0x0220, B:159:0x0056, B:160:0x0394, B:161:0x039c, B:164:0x0044, B:165:0x039d, B:167:0x03a5, B:170:0x03b2, B:172:0x03b6, B:174:0x03c1, B:175:0x03d6, B:180:0x03e7, B:182:0x03eb, B:184:0x03ef, B:185:0x03f5, B:187:0x0400, B:189:0x0404, B:191:0x040c, B:193:0x041f, B:197:0x042c, B:199:0x0433, B:200:0x0460, B:202:0x0464, B:204:0x0479, B:205:0x0480, B:207:0x0496, B:209:0x049a, B:211:0x049e, B:212:0x04ad, B:226:0x047c, B:227:0x0486, B:229:0x0413, B:231:0x0417, B:232:0x041d, B:234:0x03cb, B:235:0x03da, B:10:0x0026, B:138:0x0337, B:141:0x0352), top: B:5:0x0008, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0215 A[Catch: Exception -> 0x0053, TryCatch #2 {Exception -> 0x0053, blocks: (B:6:0x0008, B:8:0x0015, B:12:0x004a, B:14:0x0050, B:15:0x005c, B:17:0x0060, B:19:0x0069, B:20:0x006b, B:22:0x0084, B:24:0x008d, B:25:0x0096, B:28:0x009f, B:31:0x00ba, B:33:0x00be, B:35:0x00c1, B:36:0x00c3, B:39:0x00cc, B:41:0x00d9, B:42:0x00e3, B:44:0x00e7, B:46:0x00f1, B:49:0x0113, B:51:0x0149, B:53:0x014d, B:55:0x0155, B:57:0x015b, B:59:0x01b1, B:62:0x01e9, B:65:0x01fb, B:67:0x01fe, B:69:0x0201, B:73:0x0211, B:75:0x0215, B:82:0x0236, B:85:0x0243, B:87:0x024e, B:89:0x025a, B:91:0x025e, B:92:0x0264, B:94:0x026f, B:96:0x0278, B:100:0x0285, B:102:0x028c, B:104:0x02a3, B:106:0x0276, B:109:0x02af, B:111:0x02b8, B:113:0x02d4, B:115:0x02dc, B:118:0x02f4, B:120:0x02f8, B:121:0x0318, B:123:0x0324, B:125:0x0328, B:127:0x0330, B:128:0x0333, B:130:0x036a, B:132:0x0376, B:134:0x037a, B:135:0x0391, B:136:0x0388, B:146:0x0367, B:147:0x02df, B:149:0x02e8, B:152:0x0220, B:159:0x0056, B:160:0x0394, B:161:0x039c, B:164:0x0044, B:165:0x039d, B:167:0x03a5, B:170:0x03b2, B:172:0x03b6, B:174:0x03c1, B:175:0x03d6, B:180:0x03e7, B:182:0x03eb, B:184:0x03ef, B:185:0x03f5, B:187:0x0400, B:189:0x0404, B:191:0x040c, B:193:0x041f, B:197:0x042c, B:199:0x0433, B:200:0x0460, B:202:0x0464, B:204:0x0479, B:205:0x0480, B:207:0x0496, B:209:0x049a, B:211:0x049e, B:212:0x04ad, B:226:0x047c, B:227:0x0486, B:229:0x0413, B:231:0x0417, B:232:0x041d, B:234:0x03cb, B:235:0x03da, B:10:0x0026, B:138:0x0337, B:141:0x0352), top: B:5:0x0008, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void startUploadRequest() {
        int read;
        final byte[] bArr;
        int i;
        TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.state != 1) {
            return;
        }
        try {
            this.started = true;
            byte[] bArr2 = null;
            if (this.stream == null) {
                File file = new File(this.uploadingFilePath);
                this.stream = new RandomAccessFile(file, "r");
                try {
                    z = AndroidUtilities.isInternalUri(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(this.stream.getFD(), null)).intValue());
                } catch (Throwable th) {
                    FileLog.e(th);
                    z = false;
                }
                if (z) {
                    throw new Exception("trying to upload internal file");
                }
                long j = this.estimatedSize;
                if (j != 0) {
                    this.totalFileSize = j;
                } else {
                    this.totalFileSize = file.length();
                }
                if (!this.forceSmallFile && this.totalFileSize > 10485760) {
                    this.isBigFile = true;
                }
                long j2 = MessagesController.getInstance(this.currentAccount).uploadMaxFileParts;
                if (AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium() && this.totalFileSize > FileLoader.DEFAULT_MAX_FILE_SIZE) {
                    j2 = MessagesController.getInstance(this.currentAccount).uploadMaxFilePartsPremium;
                }
                long j3 = j2 * 1024;
                int max = (int) Math.max(this.slowNetwork ? 32L : 128L, ((this.totalFileSize + j3) - 1) / j3);
                this.uploadChunkSize = max;
                if (1024 % max != 0) {
                    int i3 = 64;
                    while (this.uploadChunkSize > i3) {
                        i3 *= 2;
                    }
                    this.uploadChunkSize = i3;
                }
                this.maxRequestsCount = Math.max(1, (this.slowNetwork ? 32 : 2048) / this.uploadChunkSize);
                if (this.isEncrypted) {
                    this.freeRequestIvs = new ArrayList<>(this.maxRequestsCount);
                    for (int i4 = 0; i4 < this.maxRequestsCount; i4++) {
                        this.freeRequestIvs.add(new byte[32]);
                    }
                }
                this.uploadChunkSize *= 1024;
                calcTotalPartsCount();
                this.readBuffer = new byte[this.uploadChunkSize];
                StringBuilder sb = new StringBuilder();
                sb.append(this.uploadingFilePath);
                sb.append(this.isEncrypted ? "enc" : "");
                this.fileKey = Utilities.MD5(sb.toString());
                long j4 = this.preferences.getLong(this.fileKey + "_size", 0L);
                this.uploadStartTime = (int) (System.currentTimeMillis() / 1000);
                if (!this.uploadFirstPartLater && !this.nextPartFirst && this.estimatedSize == 0 && j4 == this.totalFileSize) {
                    this.currentFileId = this.preferences.getLong(this.fileKey + "_id", 0L);
                    int i5 = this.preferences.getInt(this.fileKey + "_time", 0);
                    long j5 = this.preferences.getLong(this.fileKey + "_uploaded", 0L);
                    if (this.isEncrypted) {
                        String string = this.preferences.getString(this.fileKey + "_iv", null);
                        String string2 = this.preferences.getString(this.fileKey + "_key", null);
                        if (string != null && string2 != null) {
                            this.key = Utilities.hexToBytes(string2);
                            byte[] hexToBytes = Utilities.hexToBytes(string);
                            this.iv = hexToBytes;
                            byte[] bArr3 = this.key;
                            if (bArr3 != null && hexToBytes != null && bArr3.length == 32 && hexToBytes.length == 32) {
                                byte[] bArr4 = new byte[32];
                                this.ivChange = bArr4;
                                System.arraycopy(hexToBytes, 0, bArr4, 0, 32);
                            }
                        }
                        z2 = true;
                        if (!z2 && i5 != 0) {
                            z3 = this.isBigFile;
                            if (z3) {
                                if (i5 < this.uploadStartTime - 86400) {
                                    i5 = 0;
                                    if (i5 != 0) {
                                        if (j5 > 0) {
                                            this.readBytesCount = j5;
                                            this.currentPartNum = (int) (j5 / this.uploadChunkSize);
                                            if (z3) {
                                                this.stream.seek(j5);
                                                if (this.isEncrypted) {
                                                    bArr2 = null;
                                                    String string3 = this.preferences.getString(this.fileKey + "_ivc", null);
                                                    if (string3 != null) {
                                                        byte[] hexToBytes2 = Utilities.hexToBytes(string3);
                                                        this.ivChange = hexToBytes2;
                                                        if (hexToBytes2 == null || hexToBytes2.length != 32) {
                                                            this.readBytesCount = 0L;
                                                            this.currentPartNum = 0;
                                                        }
                                                        if (z2) {
                                                            if (this.isEncrypted) {
                                                                byte[] bArr5 = new byte[32];
                                                                this.iv = bArr5;
                                                                this.key = new byte[32];
                                                                this.ivChange = new byte[32];
                                                                Utilities.random.nextBytes(bArr5);
                                                                Utilities.random.nextBytes(this.key);
                                                                System.arraycopy(this.iv, 0, this.ivChange, 0, 32);
                                                            }
                                                            this.currentFileId = Utilities.random.nextLong();
                                                            if (!this.nextPartFirst && !this.uploadFirstPartLater && this.estimatedSize == 0) {
                                                                storeFileUploadInfo();
                                                            }
                                                        }
                                                        if (this.isEncrypted) {
                                                            try {
                                                                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                                                                byte[] bArr6 = new byte[64];
                                                                System.arraycopy(this.key, 0, bArr6, 0, 32);
                                                                System.arraycopy(this.iv, 0, bArr6, 32, 32);
                                                                byte[] digest = messageDigest.digest(bArr6);
                                                                for (int i6 = 0; i6 < 4; i6++) {
                                                                    this.fingerprint |= ((digest[i6] ^ digest[i6 + 4]) & NotificationCenter.didReplacedPhotoInMemCache) << (i6 * 8);
                                                                }
                                                            } catch (Exception e) {
                                                                FileLog.e(e);
                                                            }
                                                        }
                                                        this.uploadedBytesCount = this.readBytesCount;
                                                        this.lastSavedPartNum = this.currentPartNum;
                                                        if (this.uploadFirstPartLater) {
                                                            if (this.isBigFile) {
                                                                this.stream.seek(this.uploadChunkSize);
                                                                this.readBytesCount = this.uploadChunkSize;
                                                            } else {
                                                                this.stream.seek(1024L);
                                                                this.readBytesCount = 1024L;
                                                            }
                                                            this.currentPartNum = 1;
                                                        }
                                                    } else {
                                                        this.readBytesCount = 0L;
                                                        this.currentPartNum = 0;
                                                    }
                                                    z2 = true;
                                                    if (z2) {
                                                    }
                                                    if (this.isEncrypted) {
                                                    }
                                                    this.uploadedBytesCount = this.readBytesCount;
                                                    this.lastSavedPartNum = this.currentPartNum;
                                                    if (this.uploadFirstPartLater) {
                                                    }
                                                }
                                            } else {
                                                for (int i7 = 0; i7 < this.readBytesCount / this.uploadChunkSize; i7++) {
                                                    int read2 = this.stream.read(this.readBuffer);
                                                    int i8 = (!this.isEncrypted || read2 % 16 == 0) ? 0 : 16 - (read2 % 16);
                                                    int i9 = read2 + i8;
                                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i9);
                                                    if (read2 != this.uploadChunkSize || this.totalPartsCount == this.currentPartNum + 1) {
                                                        this.isLastPart = true;
                                                    }
                                                    int i10 = 0;
                                                    nativeByteBuffer.writeBytes(this.readBuffer, 0, read2);
                                                    if (this.isEncrypted) {
                                                        int i11 = 0;
                                                        while (i11 < i8) {
                                                            nativeByteBuffer.writeByte(i10);
                                                            i11++;
                                                            i10 = 0;
                                                        }
                                                        Utilities.aesIgeEncryption(nativeByteBuffer.buffer, this.key, this.ivChange, true, true, 0, i9);
                                                    }
                                                    nativeByteBuffer.reuse();
                                                }
                                            }
                                        }
                                    }
                                    bArr2 = null;
                                    if (z2) {
                                    }
                                    if (this.isEncrypted) {
                                    }
                                    this.uploadedBytesCount = this.readBytesCount;
                                    this.lastSavedPartNum = this.currentPartNum;
                                    if (this.uploadFirstPartLater) {
                                    }
                                }
                            }
                            if (!z3) {
                            }
                            if (i5 != 0) {
                            }
                            bArr2 = null;
                            if (z2) {
                            }
                            if (this.isEncrypted) {
                            }
                            this.uploadedBytesCount = this.readBytesCount;
                            this.lastSavedPartNum = this.currentPartNum;
                            if (this.uploadFirstPartLater) {
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                        z3 = this.isBigFile;
                        if (z3) {
                        }
                        if (!z3) {
                        }
                        if (i5 != 0) {
                        }
                        bArr2 = null;
                        if (z2) {
                        }
                        if (this.isEncrypted) {
                        }
                        this.uploadedBytesCount = this.readBytesCount;
                        this.lastSavedPartNum = this.currentPartNum;
                        if (this.uploadFirstPartLater) {
                        }
                    }
                }
                bArr2 = null;
                z2 = true;
                if (z2) {
                }
                if (this.isEncrypted) {
                }
                this.uploadedBytesCount = this.readBytesCount;
                this.lastSavedPartNum = this.currentPartNum;
                if (this.uploadFirstPartLater) {
                }
            }
            if (this.estimatedSize == 0 || this.readBytesCount + this.uploadChunkSize <= this.availableSize) {
                if (this.nextPartFirst) {
                    this.stream.seek(0L);
                    if (this.isBigFile) {
                        read = this.stream.read(this.readBuffer);
                        i2 = 0;
                    } else {
                        i2 = 0;
                        read = this.stream.read(this.readBuffer, 0, 1024);
                    }
                    this.currentPartNum = i2;
                } else {
                    read = this.stream.read(this.readBuffer);
                }
                final int i12 = read;
                if (i12 == -1) {
                    return;
                }
                int i13 = (!this.isEncrypted || i12 % 16 == 0) ? 0 : 16 - (i12 % 16);
                int i14 = i12 + i13;
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i14);
                if (this.nextPartFirst || i12 != this.uploadChunkSize || (this.estimatedSize == 0 && this.totalPartsCount == this.currentPartNum + 1)) {
                    if (this.uploadFirstPartLater) {
                        this.nextPartFirst = true;
                        this.uploadFirstPartLater = false;
                    } else {
                        this.isLastPart = true;
                    }
                }
                int i15 = 0;
                nativeByteBuffer2.writeBytes(this.readBuffer, 0, i12);
                if (this.isEncrypted) {
                    int i16 = 0;
                    while (i16 < i13) {
                        nativeByteBuffer2.writeByte(i15);
                        i16++;
                        i15 = 0;
                    }
                    Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, this.key, this.ivChange, true, true, 0, i14);
                    byte[] bArr7 = this.freeRequestIvs.get(0);
                    System.arraycopy(this.ivChange, 0, bArr7, 0, 32);
                    this.freeRequestIvs.remove(0);
                    bArr = bArr7;
                } else {
                    bArr = bArr2;
                }
                if (this.isBigFile) {
                    TLRPC.TL_upload_saveBigFilePart tL_upload_saveBigFilePart = new TLRPC.TL_upload_saveBigFilePart();
                    i = this.currentPartNum;
                    tL_upload_saveBigFilePart.file_part = i;
                    tL_upload_saveBigFilePart.file_id = this.currentFileId;
                    if (this.estimatedSize != 0) {
                        tL_upload_saveBigFilePart.file_total_parts = -1;
                    } else {
                        tL_upload_saveBigFilePart.file_total_parts = this.totalPartsCount;
                    }
                    tL_upload_saveBigFilePart.bytes = nativeByteBuffer2;
                    tL_upload_saveFilePart = tL_upload_saveBigFilePart;
                } else {
                    TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart2 = new TLRPC.TL_upload_saveFilePart();
                    i = this.currentPartNum;
                    tL_upload_saveFilePart2.file_part = i;
                    tL_upload_saveFilePart2.file_id = this.currentFileId;
                    tL_upload_saveFilePart2.bytes = nativeByteBuffer2;
                    tL_upload_saveFilePart = tL_upload_saveFilePart2;
                }
                TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart3 = tL_upload_saveFilePart;
                final int i17 = i;
                if (this.isLastPart && this.nextPartFirst) {
                    this.nextPartFirst = false;
                    this.currentPartNum = this.totalPartsCount - 1;
                    this.stream.seek(this.totalFileSize);
                }
                this.readBytesCount += i12;
                this.currentPartNum++;
                this.currentUploadRequetsCount++;
                final int i18 = this.requestNum;
                this.requestNum = i18 + 1;
                final long j6 = i17 + i12;
                final int objectSize = tL_upload_saveFilePart3.getObjectSize() + 4;
                final int i19 = this.operationGuid;
                int i20 = this.slowNetwork ? 4 : ((i18 % 4) << 16) | 4;
                System.currentTimeMillis();
                final int[] iArr = new int[1];
                iArr[0] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_saveFilePart3, new RequestDelegate() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda5
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        FileUploadOperation.this.lambda$startUploadRequest$6(i19, iArr, objectSize, bArr, i18, i12, i17, j6, tLObject, tL_error);
                    }
                }, null, new WriteToSocketDelegate() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda6
                    @Override // org.telegram.tgnet.WriteToSocketDelegate
                    public final void run() {
                        FileUploadOperation.this.lambda$startUploadRequest$8();
                    }
                }, this.forceSmallFile ? 4 : 0, ConnectionsManager.DEFAULT_DATACENTER_ID, i20, true);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("debug_uploading:  send reqId " + iArr[0] + " " + this.uploadingFilePath + " file_part=" + i17 + " isBig=" + this.isBigFile + " file_id=" + this.currentFileId);
                }
                this.requestTokens.put(i18, iArr[0]);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileUploadOperation.this.lambda$startUploadRequest$9(iArr);
                    }
                });
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            this.state = 4;
            this.delegate.didFailedUploadingFile(this);
            cleanup();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$6(int i, final int[] iArr, int i2, byte[] bArr, int i3, int i4, int i5, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j2;
        TLRPC.InputEncryptedFile tL_inputEncryptedFileUploaded;
        TLRPC.InputFile tL_inputFile;
        byte[] bArr2 = bArr;
        if (i != this.operationGuid) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("debug_uploading:  response reqId " + iArr[0] + " time" + this.uploadingFilePath);
        }
        int currentNetworkType = tLObject != null ? tLObject.networkType : ApplicationLoader.getCurrentNetworkType();
        int i6 = this.currentType;
        if (i6 == 50331648) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 3, i2);
        } else if (i6 == 33554432) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 2, i2);
        } else if (i6 == 16777216) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 4, i2);
        } else if (i6 == 67108864) {
            String str = this.uploadingFilePath;
            if (str != null && (str.toLowerCase().endsWith("mp3") || this.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 7, i2);
            } else {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 5, i2);
            }
        }
        if (bArr2 != null) {
            this.freeRequestIvs.add(bArr2);
        }
        this.requestTokens.delete(i3);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                FileUploadOperation.this.lambda$startUploadRequest$5(iArr);
            }
        });
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            if (this.state != 1) {
                return;
            }
            this.uploadedBytesCount += i4;
            long j3 = this.estimatedSize;
            if (j3 != 0) {
                j2 = Math.max(this.availableSize, j3);
            } else {
                j2 = this.totalFileSize;
            }
            this.delegate.didChangedUploadProgress(this, this.uploadedBytesCount, j2);
            int i7 = this.currentUploadRequetsCount - 1;
            this.currentUploadRequetsCount = i7;
            if (this.isLastPart && i7 == 0 && this.state == 1) {
                this.state = 3;
                if (this.key == null) {
                    if (this.isBigFile) {
                        tL_inputFile = new TLRPC.TL_inputFileBig();
                    } else {
                        tL_inputFile = new TLRPC.TL_inputFile();
                        tL_inputFile.md5_checksum = "";
                    }
                    tL_inputFile.parts = this.currentPartNum;
                    tL_inputFile.id = this.currentFileId;
                    String str2 = this.uploadingFilePath;
                    tL_inputFile.name = str2.substring(str2.lastIndexOf("/") + 1);
                    this.delegate.didFinishUploadingFile(this, tL_inputFile, null, null, null);
                    cleanup();
                } else {
                    if (this.isBigFile) {
                        tL_inputEncryptedFileUploaded = new TLRPC.TL_inputEncryptedFileBigUploaded();
                    } else {
                        tL_inputEncryptedFileUploaded = new TLRPC.TL_inputEncryptedFileUploaded();
                        tL_inputEncryptedFileUploaded.md5_checksum = "";
                    }
                    tL_inputEncryptedFileUploaded.parts = this.currentPartNum;
                    tL_inputEncryptedFileUploaded.id = this.currentFileId;
                    tL_inputEncryptedFileUploaded.key_fingerprint = this.fingerprint;
                    this.delegate.didFinishUploadingFile(this, null, tL_inputEncryptedFileUploaded, this.key, this.iv);
                    cleanup();
                }
                int i8 = this.currentType;
                if (i8 == 50331648) {
                    StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
                    return;
                }
                if (i8 == 33554432) {
                    StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
                    return;
                }
                if (i8 == 16777216) {
                    StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
                    return;
                }
                if (i8 == 67108864) {
                    String str3 = this.uploadingFilePath;
                    if (str3 != null && (str3.toLowerCase().endsWith("mp3") || this.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                        StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
                        return;
                    } else {
                        StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
                        return;
                    }
                }
                return;
            }
            if (i7 < this.maxRequestsCount) {
                if (this.estimatedSize == 0 && !this.uploadFirstPartLater && !this.nextPartFirst) {
                    if (this.saveInfoTimes >= 4) {
                        this.saveInfoTimes = 0;
                    }
                    int i9 = this.lastSavedPartNum;
                    if (i5 == i9) {
                        this.lastSavedPartNum = i9 + 1;
                        long j4 = j;
                        while (true) {
                            UploadCachedResult uploadCachedResult = this.cachedResults.get(this.lastSavedPartNum);
                            if (uploadCachedResult == null) {
                                break;
                            }
                            j4 = uploadCachedResult.bytesOffset;
                            bArr2 = uploadCachedResult.iv;
                            this.cachedResults.remove(this.lastSavedPartNum);
                            this.lastSavedPartNum++;
                        }
                        boolean z = this.isBigFile;
                        if ((z && j4 % 1048576 == 0) || (!z && this.saveInfoTimes == 0)) {
                            SharedPreferences.Editor edit = this.preferences.edit();
                            edit.putLong(this.fileKey + "_uploaded", j4);
                            if (this.isEncrypted) {
                                edit.putString(this.fileKey + "_ivc", Utilities.bytesToHex(bArr2));
                            }
                            edit.commit();
                        }
                    } else {
                        UploadCachedResult uploadCachedResult2 = new UploadCachedResult();
                        uploadCachedResult2.bytesOffset = j;
                        if (bArr2 != null) {
                            uploadCachedResult2.iv = new byte[32];
                            System.arraycopy(bArr2, 0, uploadCachedResult2.iv, 0, 32);
                        }
                        this.cachedResults.put(i5, uploadCachedResult2);
                    }
                    this.saveInfoTimes++;
                }
                startUploadRequest();
                return;
            }
            return;
        }
        this.state = 4;
        this.delegate.didFailedUploadingFile(this);
        cleanup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$5(int[] iArr) {
        this.uiRequestTokens.remove(Integer.valueOf(iArr[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$8() {
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                FileUploadOperation.this.lambda$startUploadRequest$7();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$7() {
        if (this.currentUploadRequetsCount < this.maxRequestsCount) {
            startUploadRequest();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$9(int[] iArr) {
        this.uiRequestTokens.add(Integer.valueOf(iArr[0]));
    }
}
