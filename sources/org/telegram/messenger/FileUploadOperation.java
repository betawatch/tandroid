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

    /* JADX INFO: Access modifiers changed from: private */
    static class UploadCachedResult {
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
                FileUploadOperation.$r8$lambda$eeW7Dvkv2CBBBvtzoWGrj72C1rM(FileUploadOperation.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$eeW7Dvkv2CBBBvtzoWGrj72C1rM(FileUploadOperation fileUploadOperation) {
        fileUploadOperation.getClass();
        fileUploadOperation.preferences = ApplicationLoader.applicationContext.getSharedPreferences("uploadinfo", 0);
        fileUploadOperation.slowNetwork = ApplicationLoader.isConnectionSlow();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload on slow network = " + fileUploadOperation.slowNetwork);
        }
        int i = fileUploadOperation.slowNetwork ? 1 : 8;
        for (int i2 = 0; i2 < i; i2++) {
            fileUploadOperation.startUploadRequest();
        }
    }

    protected void onNetworkChanged(final boolean z) {
        if (this.state != 1) {
            return;
        }
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                FileUploadOperation.$r8$lambda$S095waSE5Ot8skHFp30eg5tstnk(FileUploadOperation.this, z);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                FileUploadOperation.this.uiRequestTokens.clear();
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$S095waSE5Ot8skHFp30eg5tstnk(FileUploadOperation fileUploadOperation, boolean z) {
        if (fileUploadOperation.slowNetwork != z) {
            fileUploadOperation.slowNetwork = z;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("network changed to slow = " + fileUploadOperation.slowNetwork);
            }
            int i = 0;
            while (true) {
                if (i >= fileUploadOperation.requestTokens.size()) {
                    break;
                }
                ConnectionsManager.getInstance(fileUploadOperation.currentAccount).cancelRequest(fileUploadOperation.requestTokens.valueAt(i), true);
                i++;
            }
            fileUploadOperation.requestTokens.clear();
            fileUploadOperation.cleanup();
            fileUploadOperation.isLastPart = false;
            fileUploadOperation.nextPartFirst = false;
            fileUploadOperation.requestNum = 0;
            fileUploadOperation.currentPartNum = 0;
            fileUploadOperation.readBytesCount = 0L;
            fileUploadOperation.uploadedBytesCount = 0L;
            fileUploadOperation.saveInfoTimes = 0;
            fileUploadOperation.key = null;
            fileUploadOperation.iv = null;
            fileUploadOperation.ivChange = null;
            fileUploadOperation.currentUploadRequetsCount = 0;
            fileUploadOperation.lastSavedPartNum = 0;
            fileUploadOperation.uploadFirstPartLater = false;
            fileUploadOperation.cachedResults.clear();
            fileUploadOperation.operationGuid++;
            int i2 = fileUploadOperation.slowNetwork ? 1 : 8;
            for (int i3 = 0; i3 < i2; i3++) {
                fileUploadOperation.startUploadRequest();
            }
        }
    }

    public void cancel() {
        if (this.state == 3) {
            return;
        }
        this.state = 2;
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                FileUploadOperation.$r8$lambda$XoSy-T1qMtr3FbhlkVj3o0rAPQ4(FileUploadOperation.this);
            }
        });
        AutoDeleteMediaTask.unlockFile(this.uploadingFilePath);
        this.delegate.didFailedUploadingFile(this);
        cleanup();
    }

    public static /* synthetic */ void $r8$lambda$XoSy-T1qMtr3FbhlkVj3o0rAPQ4(FileUploadOperation fileUploadOperation) {
        for (int i = 0; i < fileUploadOperation.requestTokens.size(); i++) {
            ConnectionsManager.getInstance(fileUploadOperation.currentAccount).cancelRequest(fileUploadOperation.requestTokens.valueAt(i), true);
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
                FileUploadOperation.$r8$lambda$s8gg8t7pdC21S8e3DGzmHN61ZH0(FileUploadOperation.this, f, j2, j);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$s8gg8t7pdC21S8e3DGzmHN61ZH0(FileUploadOperation fileUploadOperation, Float f, long j, long j2) {
        if (f != null && fileUploadOperation.estimatedSize != 0 && j == 0) {
            boolean z = false;
            boolean z2 = true;
            if (f.floatValue() > 0.75f) {
                boolean[] zArr = fileUploadOperation.recalculatedEstimatedSize;
                if (!zArr[0]) {
                    zArr[0] = true;
                    z = true;
                }
            }
            if (f.floatValue() > 0.95f) {
                boolean[] zArr2 = fileUploadOperation.recalculatedEstimatedSize;
                if (!zArr2[1]) {
                    zArr2[1] = true;
                    if (z2) {
                        fileUploadOperation.estimatedSize = (long) (j2 / f.floatValue());
                    }
                }
            }
            z2 = z;
            if (z2) {
            }
        }
        if (fileUploadOperation.estimatedSize != 0 && j != 0) {
            fileUploadOperation.estimatedSize = 0L;
            fileUploadOperation.totalFileSize = j;
            fileUploadOperation.calcTotalPartsCount();
            if (!fileUploadOperation.uploadFirstPartLater && fileUploadOperation.started) {
                fileUploadOperation.storeFileUploadInfo();
            }
        }
        if (j <= 0) {
            j = j2;
        }
        fileUploadOperation.availableSize = j;
        if (fileUploadOperation.currentUploadRequetsCount < fileUploadOperation.maxRequestsCount) {
            fileUploadOperation.startUploadRequest();
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

    /* JADX WARN: Code restructure failed: missing block: B:225:0x022c, code lost:
    
        if (r0 < (r28.uploadStartTime - 5400.0f)) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02fc A[Catch: Exception -> 0x0054, TryCatch #2 {Exception -> 0x0054, blocks: (B:4:0x0009, B:6:0x0016, B:10:0x004b, B:12:0x0051, B:13:0x005d, B:15:0x0061, B:17:0x006a, B:18:0x006c, B:20:0x0085, B:22:0x008e, B:23:0x0097, B:26:0x00a0, B:29:0x00bb, B:31:0x00bf, B:33:0x00c2, B:34:0x00c4, B:37:0x00cd, B:39:0x00da, B:40:0x00e4, B:42:0x00e8, B:44:0x00f2, B:47:0x0114, B:49:0x014a, B:51:0x014e, B:53:0x0156, B:55:0x015c, B:57:0x01b2, B:60:0x01ea, B:63:0x01fc, B:65:0x01ff, B:67:0x0202, B:71:0x0212, B:73:0x0216, B:80:0x0237, B:83:0x0244, B:85:0x0251, B:87:0x025d, B:89:0x0261, B:90:0x0267, B:92:0x0272, B:94:0x027b, B:98:0x0288, B:100:0x028f, B:102:0x02a6, B:104:0x0279, B:110:0x02fc, B:112:0x0300, B:113:0x0320, B:115:0x032c, B:117:0x0330, B:119:0x0338, B:120:0x033b, B:122:0x0372, B:124:0x037e, B:126:0x0382, B:127:0x0397, B:128:0x0390, B:129:0x03a4, B:131:0x03ac, B:136:0x03b9, B:138:0x03bd, B:140:0x03c8, B:141:0x03db, B:144:0x03ea, B:146:0x03ee, B:148:0x03f2, B:149:0x03f8, B:151:0x0403, B:153:0x0407, B:155:0x040f, B:157:0x0422, B:161:0x042f, B:163:0x0436, B:164:0x0462, B:166:0x0466, B:168:0x047b, B:169:0x0482, B:171:0x0498, B:173:0x049c, B:175:0x04a0, B:176:0x04af, B:190:0x047e, B:191:0x0488, B:193:0x0416, B:195:0x041a, B:196:0x0420, B:199:0x03d2, B:200:0x03de, B:210:0x036f, B:211:0x02b0, B:213:0x02bb, B:215:0x02d7, B:217:0x02df, B:219:0x02e2, B:221:0x02eb, B:224:0x0221, B:231:0x0057, B:232:0x039a, B:233:0x03a2, B:236:0x0045, B:202:0x033f, B:205:0x035a, B:8:0x0027), top: B:3:0x0009, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x037e A[Catch: Exception -> 0x0054, TryCatch #2 {Exception -> 0x0054, blocks: (B:4:0x0009, B:6:0x0016, B:10:0x004b, B:12:0x0051, B:13:0x005d, B:15:0x0061, B:17:0x006a, B:18:0x006c, B:20:0x0085, B:22:0x008e, B:23:0x0097, B:26:0x00a0, B:29:0x00bb, B:31:0x00bf, B:33:0x00c2, B:34:0x00c4, B:37:0x00cd, B:39:0x00da, B:40:0x00e4, B:42:0x00e8, B:44:0x00f2, B:47:0x0114, B:49:0x014a, B:51:0x014e, B:53:0x0156, B:55:0x015c, B:57:0x01b2, B:60:0x01ea, B:63:0x01fc, B:65:0x01ff, B:67:0x0202, B:71:0x0212, B:73:0x0216, B:80:0x0237, B:83:0x0244, B:85:0x0251, B:87:0x025d, B:89:0x0261, B:90:0x0267, B:92:0x0272, B:94:0x027b, B:98:0x0288, B:100:0x028f, B:102:0x02a6, B:104:0x0279, B:110:0x02fc, B:112:0x0300, B:113:0x0320, B:115:0x032c, B:117:0x0330, B:119:0x0338, B:120:0x033b, B:122:0x0372, B:124:0x037e, B:126:0x0382, B:127:0x0397, B:128:0x0390, B:129:0x03a4, B:131:0x03ac, B:136:0x03b9, B:138:0x03bd, B:140:0x03c8, B:141:0x03db, B:144:0x03ea, B:146:0x03ee, B:148:0x03f2, B:149:0x03f8, B:151:0x0403, B:153:0x0407, B:155:0x040f, B:157:0x0422, B:161:0x042f, B:163:0x0436, B:164:0x0462, B:166:0x0466, B:168:0x047b, B:169:0x0482, B:171:0x0498, B:173:0x049c, B:175:0x04a0, B:176:0x04af, B:190:0x047e, B:191:0x0488, B:193:0x0416, B:195:0x041a, B:196:0x0420, B:199:0x03d2, B:200:0x03de, B:210:0x036f, B:211:0x02b0, B:213:0x02bb, B:215:0x02d7, B:217:0x02df, B:219:0x02e2, B:221:0x02eb, B:224:0x0221, B:231:0x0057, B:232:0x039a, B:233:0x03a2, B:236:0x0045, B:202:0x033f, B:205:0x035a, B:8:0x0027), top: B:3:0x0009, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x033f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0221 A[Catch: Exception -> 0x0054, TryCatch #2 {Exception -> 0x0054, blocks: (B:4:0x0009, B:6:0x0016, B:10:0x004b, B:12:0x0051, B:13:0x005d, B:15:0x0061, B:17:0x006a, B:18:0x006c, B:20:0x0085, B:22:0x008e, B:23:0x0097, B:26:0x00a0, B:29:0x00bb, B:31:0x00bf, B:33:0x00c2, B:34:0x00c4, B:37:0x00cd, B:39:0x00da, B:40:0x00e4, B:42:0x00e8, B:44:0x00f2, B:47:0x0114, B:49:0x014a, B:51:0x014e, B:53:0x0156, B:55:0x015c, B:57:0x01b2, B:60:0x01ea, B:63:0x01fc, B:65:0x01ff, B:67:0x0202, B:71:0x0212, B:73:0x0216, B:80:0x0237, B:83:0x0244, B:85:0x0251, B:87:0x025d, B:89:0x0261, B:90:0x0267, B:92:0x0272, B:94:0x027b, B:98:0x0288, B:100:0x028f, B:102:0x02a6, B:104:0x0279, B:110:0x02fc, B:112:0x0300, B:113:0x0320, B:115:0x032c, B:117:0x0330, B:119:0x0338, B:120:0x033b, B:122:0x0372, B:124:0x037e, B:126:0x0382, B:127:0x0397, B:128:0x0390, B:129:0x03a4, B:131:0x03ac, B:136:0x03b9, B:138:0x03bd, B:140:0x03c8, B:141:0x03db, B:144:0x03ea, B:146:0x03ee, B:148:0x03f2, B:149:0x03f8, B:151:0x0403, B:153:0x0407, B:155:0x040f, B:157:0x0422, B:161:0x042f, B:163:0x0436, B:164:0x0462, B:166:0x0466, B:168:0x047b, B:169:0x0482, B:171:0x0498, B:173:0x049c, B:175:0x04a0, B:176:0x04af, B:190:0x047e, B:191:0x0488, B:193:0x0416, B:195:0x041a, B:196:0x0420, B:199:0x03d2, B:200:0x03de, B:210:0x036f, B:211:0x02b0, B:213:0x02bb, B:215:0x02d7, B:217:0x02df, B:219:0x02e2, B:221:0x02eb, B:224:0x0221, B:231:0x0057, B:232:0x039a, B:233:0x03a2, B:236:0x0045, B:202:0x033f, B:205:0x035a, B:8:0x0027), top: B:3:0x0009, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0216 A[Catch: Exception -> 0x0054, TryCatch #2 {Exception -> 0x0054, blocks: (B:4:0x0009, B:6:0x0016, B:10:0x004b, B:12:0x0051, B:13:0x005d, B:15:0x0061, B:17:0x006a, B:18:0x006c, B:20:0x0085, B:22:0x008e, B:23:0x0097, B:26:0x00a0, B:29:0x00bb, B:31:0x00bf, B:33:0x00c2, B:34:0x00c4, B:37:0x00cd, B:39:0x00da, B:40:0x00e4, B:42:0x00e8, B:44:0x00f2, B:47:0x0114, B:49:0x014a, B:51:0x014e, B:53:0x0156, B:55:0x015c, B:57:0x01b2, B:60:0x01ea, B:63:0x01fc, B:65:0x01ff, B:67:0x0202, B:71:0x0212, B:73:0x0216, B:80:0x0237, B:83:0x0244, B:85:0x0251, B:87:0x025d, B:89:0x0261, B:90:0x0267, B:92:0x0272, B:94:0x027b, B:98:0x0288, B:100:0x028f, B:102:0x02a6, B:104:0x0279, B:110:0x02fc, B:112:0x0300, B:113:0x0320, B:115:0x032c, B:117:0x0330, B:119:0x0338, B:120:0x033b, B:122:0x0372, B:124:0x037e, B:126:0x0382, B:127:0x0397, B:128:0x0390, B:129:0x03a4, B:131:0x03ac, B:136:0x03b9, B:138:0x03bd, B:140:0x03c8, B:141:0x03db, B:144:0x03ea, B:146:0x03ee, B:148:0x03f2, B:149:0x03f8, B:151:0x0403, B:153:0x0407, B:155:0x040f, B:157:0x0422, B:161:0x042f, B:163:0x0436, B:164:0x0462, B:166:0x0466, B:168:0x047b, B:169:0x0482, B:171:0x0498, B:173:0x049c, B:175:0x04a0, B:176:0x04af, B:190:0x047e, B:191:0x0488, B:193:0x0416, B:195:0x041a, B:196:0x0420, B:199:0x03d2, B:200:0x03de, B:210:0x036f, B:211:0x02b0, B:213:0x02bb, B:215:0x02d7, B:217:0x02df, B:219:0x02e2, B:221:0x02eb, B:224:0x0221, B:231:0x0057, B:232:0x039a, B:233:0x03a2, B:236:0x0045, B:202:0x033f, B:205:0x035a, B:8:0x0027), top: B:3:0x0009, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void startUploadRequest() {
        byte[] bArr;
        int read;
        byte[] bArr2;
        int i;
        TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.state != 1) {
            return;
        }
        try {
            this.started = true;
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
                        z3 = true;
                        if (!z3 && i5 != 0) {
                            z4 = this.isBigFile;
                            if (z4) {
                                if (i5 < this.uploadStartTime - 86400) {
                                    i5 = 0;
                                    if (i5 == 0) {
                                        z5 = z3;
                                    } else if (j5 > 0) {
                                        this.readBytesCount = j5;
                                        this.currentPartNum = (int) (j5 / this.uploadChunkSize);
                                        if (!z4) {
                                            int i6 = 0;
                                            while (true) {
                                                z5 = z3;
                                                if (i6 >= this.readBytesCount / this.uploadChunkSize) {
                                                    break;
                                                }
                                                int read2 = this.stream.read(this.readBuffer);
                                                int i7 = (!this.isEncrypted || read2 % 16 == 0) ? 0 : 16 - (read2 % 16);
                                                int i8 = read2 + i7;
                                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i8);
                                                if (read2 != this.uploadChunkSize || this.totalPartsCount == this.currentPartNum + 1) {
                                                    this.isLastPart = true;
                                                }
                                                int i9 = 0;
                                                nativeByteBuffer.writeBytes(this.readBuffer, 0, read2);
                                                if (this.isEncrypted) {
                                                    int i10 = 0;
                                                    while (i10 < i7) {
                                                        nativeByteBuffer.writeByte(i9);
                                                        i10++;
                                                        i9 = 0;
                                                    }
                                                    Utilities.aesIgeEncryption(nativeByteBuffer.buffer, this.key, this.ivChange, true, true, 0, i8);
                                                }
                                                nativeByteBuffer.reuse();
                                                i6++;
                                                z3 = z5;
                                            }
                                        } else {
                                            z5 = z3;
                                            this.stream.seek(j5);
                                            if (this.isEncrypted) {
                                                bArr = null;
                                                String string3 = this.preferences.getString(this.fileKey + "_ivc", null);
                                                if (string3 != null) {
                                                    byte[] hexToBytes2 = Utilities.hexToBytes(string3);
                                                    this.ivChange = hexToBytes2;
                                                    if (hexToBytes2 == null || hexToBytes2.length != 32) {
                                                        this.readBytesCount = 0L;
                                                        this.currentPartNum = 0;
                                                    }
                                                    z2 = z5;
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
                                                            for (int i11 = 0; i11 < 4; i11++) {
                                                                this.fingerprint |= ((digest[i11] ^ digest[i11 + 4]) & NotificationCenter.didReceiveSmsCode) << (i11 * 8);
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
                                        }
                                    }
                                    bArr = null;
                                    z2 = z5;
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
                            if (!z4) {
                            }
                            if (i5 == 0) {
                            }
                            bArr = null;
                            z2 = z5;
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
                    z3 = false;
                    if (!z3) {
                        z4 = this.isBigFile;
                        if (z4) {
                        }
                        if (!z4) {
                        }
                        if (i5 == 0) {
                        }
                        bArr = null;
                        z2 = z5;
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
                bArr = null;
                z2 = true;
                if (z2) {
                }
                if (this.isEncrypted) {
                }
                this.uploadedBytesCount = this.readBytesCount;
                this.lastSavedPartNum = this.currentPartNum;
                if (this.uploadFirstPartLater) {
                }
            } else {
                bArr = null;
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
                if (read == -1) {
                    return;
                }
                int i12 = (!this.isEncrypted || read % 16 == 0) ? 0 : 16 - (read % 16);
                int i13 = read + i12;
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i13);
                if (this.nextPartFirst || read != this.uploadChunkSize || (this.estimatedSize == 0 && this.totalPartsCount == this.currentPartNum + 1)) {
                    if (this.uploadFirstPartLater) {
                        this.nextPartFirst = true;
                        this.uploadFirstPartLater = false;
                    } else {
                        this.isLastPart = true;
                    }
                }
                int i14 = 0;
                nativeByteBuffer2.writeBytes(this.readBuffer, 0, read);
                if (this.isEncrypted) {
                    int i15 = 0;
                    while (i15 < i12) {
                        nativeByteBuffer2.writeByte(i14);
                        i15++;
                        i14 = 0;
                    }
                    Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, this.key, this.ivChange, true, true, 0, i13);
                    bArr2 = this.freeRequestIvs.get(0);
                    System.arraycopy(this.ivChange, 0, bArr2, 0, 32);
                    this.freeRequestIvs.remove(0);
                } else {
                    bArr2 = bArr;
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
                final int i16 = i;
                if (this.isLastPart && this.nextPartFirst) {
                    this.nextPartFirst = false;
                    this.currentPartNum = this.totalPartsCount - 1;
                    this.stream.seek(this.totalFileSize);
                }
                this.readBytesCount += read;
                this.currentPartNum++;
                this.currentUploadRequetsCount++;
                final int i17 = this.requestNum;
                this.requestNum = i17 + 1;
                final long j6 = i16 + read;
                final int objectSize = tL_upload_saveFilePart3.getObjectSize() + 4;
                final int i18 = this.operationGuid;
                int i19 = this.slowNetwork ? 4 : ((i17 % 4) << 16) | 4;
                System.currentTimeMillis();
                final int[] iArr = new int[1];
                final byte[] bArr7 = bArr2;
                final int i20 = read;
                iArr[0] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_saveFilePart3, new RequestDelegate() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda5
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        FileUploadOperation.$r8$lambda$xvTb41RA9qgxehxtlT--7WGhJ0Y(FileUploadOperation.this, i18, iArr, objectSize, bArr7, i17, i20, i16, j6, tLObject, tL_error);
                    }
                }, null, new WriteToSocketDelegate() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda6
                    @Override // org.telegram.tgnet.WriteToSocketDelegate
                    public final void run() {
                        FileUploadOperation.$r8$lambda$8_tMA1KNfC6he271ppMh39z2wTQ(FileUploadOperation.this);
                    }
                }, this.forceSmallFile ? 4 : 0, ConnectionsManager.DEFAULT_DATACENTER_ID, i19, true);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("debug_uploading:  send reqId " + iArr[0] + " " + this.uploadingFilePath + " file_part=" + i16 + " isBig=" + this.isBigFile + " file_id=" + this.currentFileId);
                }
                this.requestTokens.put(i17, iArr[0]);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileUploadOperation.this.uiRequestTokens.add(Integer.valueOf(iArr[0]));
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

    public static /* synthetic */ void $r8$lambda$xvTb41RA9qgxehxtlT--7WGhJ0Y(final FileUploadOperation fileUploadOperation, int i, final int[] iArr, int i2, byte[] bArr, int i3, int i4, int i5, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j2;
        TLRPC.InputEncryptedFile tL_inputEncryptedFileUploaded;
        TLRPC.InputFile tL_inputFile;
        byte[] bArr2 = bArr;
        if (i != fileUploadOperation.operationGuid) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("debug_uploading:  response reqId " + iArr[0] + " time" + fileUploadOperation.uploadingFilePath);
        }
        int currentNetworkType = tLObject != null ? tLObject.networkType : ApplicationLoader.getCurrentNetworkType();
        int i6 = fileUploadOperation.currentType;
        if (i6 == 50331648) {
            StatsController.getInstance(fileUploadOperation.currentAccount).incrementSentBytesCount(currentNetworkType, 3, i2);
        } else if (i6 == 33554432) {
            StatsController.getInstance(fileUploadOperation.currentAccount).incrementSentBytesCount(currentNetworkType, 2, i2);
        } else if (i6 == 16777216) {
            StatsController.getInstance(fileUploadOperation.currentAccount).incrementSentBytesCount(currentNetworkType, 4, i2);
        } else if (i6 == 67108864) {
            String str = fileUploadOperation.uploadingFilePath;
            if (str != null && (str.toLowerCase().endsWith("mp3") || fileUploadOperation.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                StatsController.getInstance(fileUploadOperation.currentAccount).incrementSentBytesCount(currentNetworkType, 7, i2);
            } else {
                StatsController.getInstance(fileUploadOperation.currentAccount).incrementSentBytesCount(currentNetworkType, 5, i2);
            }
        }
        if (bArr2 != null) {
            fileUploadOperation.freeRequestIvs.add(bArr2);
        }
        fileUploadOperation.requestTokens.delete(i3);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                FileUploadOperation.this.uiRequestTokens.remove(Integer.valueOf(iArr[0]));
            }
        });
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            if (fileUploadOperation.state != 1) {
                return;
            }
            fileUploadOperation.uploadedBytesCount += i4;
            long j3 = fileUploadOperation.estimatedSize;
            if (j3 != 0) {
                j2 = Math.max(fileUploadOperation.availableSize, j3);
            } else {
                j2 = fileUploadOperation.totalFileSize;
            }
            fileUploadOperation.delegate.didChangedUploadProgress(fileUploadOperation, fileUploadOperation.uploadedBytesCount, j2);
            int i7 = fileUploadOperation.currentUploadRequetsCount - 1;
            fileUploadOperation.currentUploadRequetsCount = i7;
            if (fileUploadOperation.isLastPart && i7 == 0 && fileUploadOperation.state == 1) {
                fileUploadOperation.state = 3;
                if (fileUploadOperation.key == null) {
                    if (fileUploadOperation.isBigFile) {
                        tL_inputFile = new TLRPC.TL_inputFileBig();
                    } else {
                        tL_inputFile = new TLRPC.TL_inputFile();
                        tL_inputFile.md5_checksum = "";
                    }
                    tL_inputFile.parts = fileUploadOperation.currentPartNum;
                    tL_inputFile.id = fileUploadOperation.currentFileId;
                    String str2 = fileUploadOperation.uploadingFilePath;
                    tL_inputFile.name = str2.substring(str2.lastIndexOf("/") + 1);
                    fileUploadOperation.delegate.didFinishUploadingFile(fileUploadOperation, tL_inputFile, null, null, null);
                    fileUploadOperation.cleanup();
                } else {
                    if (fileUploadOperation.isBigFile) {
                        tL_inputEncryptedFileUploaded = new TLRPC.TL_inputEncryptedFileBigUploaded();
                    } else {
                        tL_inputEncryptedFileUploaded = new TLRPC.TL_inputEncryptedFileUploaded();
                        tL_inputEncryptedFileUploaded.md5_checksum = "";
                    }
                    tL_inputEncryptedFileUploaded.parts = fileUploadOperation.currentPartNum;
                    tL_inputEncryptedFileUploaded.id = fileUploadOperation.currentFileId;
                    tL_inputEncryptedFileUploaded.key_fingerprint = fileUploadOperation.fingerprint;
                    fileUploadOperation.delegate.didFinishUploadingFile(fileUploadOperation, null, tL_inputEncryptedFileUploaded, fileUploadOperation.key, fileUploadOperation.iv);
                    fileUploadOperation.cleanup();
                }
                int i8 = fileUploadOperation.currentType;
                if (i8 == 50331648) {
                    StatsController.getInstance(fileUploadOperation.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
                    return;
                }
                if (i8 == 33554432) {
                    StatsController.getInstance(fileUploadOperation.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
                    return;
                }
                if (i8 == 16777216) {
                    StatsController.getInstance(fileUploadOperation.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
                    return;
                }
                if (i8 == 67108864) {
                    String str3 = fileUploadOperation.uploadingFilePath;
                    if (str3 != null && (str3.toLowerCase().endsWith("mp3") || fileUploadOperation.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                        StatsController.getInstance(fileUploadOperation.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
                        return;
                    } else {
                        StatsController.getInstance(fileUploadOperation.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
                        return;
                    }
                }
                return;
            }
            if (i7 < fileUploadOperation.maxRequestsCount) {
                if (fileUploadOperation.estimatedSize == 0 && !fileUploadOperation.uploadFirstPartLater && !fileUploadOperation.nextPartFirst) {
                    if (fileUploadOperation.saveInfoTimes >= 4) {
                        fileUploadOperation.saveInfoTimes = 0;
                    }
                    int i9 = fileUploadOperation.lastSavedPartNum;
                    if (i5 == i9) {
                        fileUploadOperation.lastSavedPartNum = i9 + 1;
                        long j4 = j;
                        while (true) {
                            UploadCachedResult uploadCachedResult = fileUploadOperation.cachedResults.get(fileUploadOperation.lastSavedPartNum);
                            if (uploadCachedResult == null) {
                                break;
                            }
                            j4 = uploadCachedResult.bytesOffset;
                            bArr2 = uploadCachedResult.iv;
                            fileUploadOperation.cachedResults.remove(fileUploadOperation.lastSavedPartNum);
                            fileUploadOperation.lastSavedPartNum++;
                        }
                        boolean z = fileUploadOperation.isBigFile;
                        if ((z && j4 % 1048576 == 0) || (!z && fileUploadOperation.saveInfoTimes == 0)) {
                            SharedPreferences.Editor edit = fileUploadOperation.preferences.edit();
                            edit.putLong(fileUploadOperation.fileKey + "_uploaded", j4);
                            if (fileUploadOperation.isEncrypted) {
                                edit.putString(fileUploadOperation.fileKey + "_ivc", Utilities.bytesToHex(bArr2));
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
                        fileUploadOperation.cachedResults.put(i5, uploadCachedResult2);
                    }
                    fileUploadOperation.saveInfoTimes++;
                }
                fileUploadOperation.startUploadRequest();
                return;
            }
            return;
        }
        fileUploadOperation.state = 4;
        fileUploadOperation.delegate.didFailedUploadingFile(fileUploadOperation);
        fileUploadOperation.cleanup();
    }

    public static /* synthetic */ void $r8$lambda$8_tMA1KNfC6he271ppMh39z2wTQ(final FileUploadOperation fileUploadOperation) {
        fileUploadOperation.getClass();
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileUploadOperation$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                FileUploadOperation.$r8$lambda$TxG41Zo5_cKHw8eW3nsGuYBF6JY(FileUploadOperation.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$TxG41Zo5_cKHw8eW3nsGuYBF6JY(FileUploadOperation fileUploadOperation) {
        if (fileUploadOperation.currentUploadRequetsCount < fileUploadOperation.maxRequestsCount) {
            fileUploadOperation.startUploadRequest();
        }
    }
}
