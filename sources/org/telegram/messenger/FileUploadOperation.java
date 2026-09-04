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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
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

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
    public interface FileUploadOperationDelegate {
        void didChangedUploadProgress(FileUploadOperation fileUploadOperation, long j3, long j10);

        void didFailedUploadingFile(FileUploadOperation fileUploadOperation);

        void didFinishUploadingFile(FileUploadOperation fileUploadOperation, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2);
    }

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
    public static class UploadCachedResult {
        private long bytesOffset;
        private byte[] iv;

        private UploadCachedResult() {
        }
    }

    public FileUploadOperation(int i10, String str, boolean z10, long j3, int i11) {
        this.currentAccount = i10;
        this.uploadingFilePath = str;
        this.isEncrypted = z10;
        this.estimatedSize = j3;
        this.currentType = i11;
        this.uploadFirstPartLater = (j3 == 0 || z10) ? false : true;
    }

    private void calcTotalPartsCount() {
        if (!this.uploadFirstPartLater) {
            long j3 = this.totalFileSize;
            int i10 = this.uploadChunkSize;
            this.totalPartsCount = (int) (((j3 + i10) - 1) / i10);
        } else if (this.isBigFile) {
            long j10 = this.totalFileSize;
            int i11 = this.uploadChunkSize;
            this.totalPartsCount = ((int) ((((j10 - i11) + i11) - 1) / i11)) + 1;
        } else {
            long j11 = this.totalFileSize - 1024;
            int i12 = this.uploadChunkSize;
            this.totalPartsCount = ((int) (((j11 + i12) - 1) / i12)) + 1;
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AutoDeleteMediaTask.unlockFile(this.uploadingFilePath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancel$3() {
        for (int i10 = 0; i10 < this.requestTokens.size(); i10++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestTokens.valueAt(i10), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$checkNewDataAvailable$4(Float f7, long j3, long j10) {
        if (f7 != null && this.estimatedSize != 0 && j3 == 0) {
            boolean z10 = false;
            boolean z11 = true;
            if (f7.floatValue() > 0.75f) {
                boolean[] zArr = this.recalculatedEstimatedSize;
                if (!zArr[0]) {
                    zArr[0] = true;
                    z10 = true;
                }
            }
            if (f7.floatValue() > 0.95f) {
                boolean[] zArr2 = this.recalculatedEstimatedSize;
                if (!zArr2[1]) {
                    zArr2[1] = true;
                    if (z11) {
                        this.estimatedSize = (long) (j10 / f7.floatValue());
                    }
                }
            }
            z11 = z10;
            if (z11) {
            }
        }
        if (this.estimatedSize != 0 && j3 != 0) {
            this.estimatedSize = 0L;
            this.totalFileSize = j3;
            calcTotalPartsCount();
            if (!this.uploadFirstPartLater && this.started) {
                storeFileUploadInfo();
            }
        }
        if (j3 <= 0) {
            j3 = j10;
        }
        this.availableSize = j3;
        if (this.currentUploadRequetsCount < this.maxRequestsCount) {
            startUploadRequest();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNetworkChanged$1(boolean z10) {
        if (this.slowNetwork != z10) {
            this.slowNetwork = z10;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("network changed to slow = " + this.slowNetwork);
            }
            int i10 = 0;
            while (true) {
                if (i10 >= this.requestTokens.size()) {
                    break;
                }
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestTokens.valueAt(i10), true);
                i10++;
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
            int i11 = this.slowNetwork ? 1 : 8;
            for (int i12 = 0; i12 < i11; i12++) {
                startUploadRequest();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNetworkChanged$2() {
        this.uiRequestTokens.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("uploadinfo", 0);
        this.slowNetwork = ApplicationLoader.isConnectionSlow();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload on slow network = " + this.slowNetwork);
        }
        int i10 = this.slowNetwork ? 1 : 8;
        for (int i11 = 0; i11 < i10; i11++) {
            startUploadRequest();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$5(int[] iArr) {
        this.uiRequestTokens.remove(Integer.valueOf(iArr[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$6(int i10, int[] iArr, int i11, byte[] bArr, int i12, int i13, int i14, long j3, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.InputEncryptedFile tL_inputEncryptedFileUploaded;
        TLRPC.InputFile tL_inputFile;
        byte[] bArr2 = bArr;
        if (i10 != this.operationGuid) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("debug_uploading:  response reqId ");
            sb2.append(iArr[0]);
            sb2.append(" time");
            com.google.android.gms.internal.vision.e2.t(this.uploadingFilePath, sb2);
        }
        int currentNetworkType = tLObject != null ? tLObject.networkType : ApplicationLoader.getCurrentNetworkType();
        int i15 = this.currentType;
        if (i15 == 50331648) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 3, i11);
        } else if (i15 == 33554432) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 2, i11);
        } else if (i15 == 16777216) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 4, i11);
        } else if (i15 == 67108864) {
            String str = this.uploadingFilePath;
            if (str == null || !(str.toLowerCase().endsWith("mp3") || this.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 5, i11);
            } else {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 7, i11);
            }
        }
        if (bArr2 != null) {
            this.freeRequestIvs.add(bArr2);
        }
        this.requestTokens.delete(i12);
        AndroidUtilities.runOnUIThread(new s3(this, iArr, 0));
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            this.state = 4;
            this.delegate.didFailedUploadingFile(this);
            cleanup();
            return;
        }
        if (this.state != 1) {
            return;
        }
        this.uploadedBytesCount += i13;
        long j10 = this.estimatedSize;
        this.delegate.didChangedUploadProgress(this, this.uploadedBytesCount, j10 != 0 ? Math.max(this.availableSize, j10) : this.totalFileSize);
        int i16 = this.currentUploadRequetsCount - 1;
        this.currentUploadRequetsCount = i16;
        if (!this.isLastPart || i16 != 0 || this.state != 1) {
            if (i16 < this.maxRequestsCount) {
                if (this.estimatedSize == 0 && !this.uploadFirstPartLater && !this.nextPartFirst) {
                    if (this.saveInfoTimes >= 4) {
                        this.saveInfoTimes = 0;
                    }
                    int i17 = this.lastSavedPartNum;
                    if (i14 == i17) {
                        this.lastSavedPartNum = i17 + 1;
                        long j11 = j3;
                        while (true) {
                            UploadCachedResult uploadCachedResult = this.cachedResults.get(this.lastSavedPartNum);
                            if (uploadCachedResult == null) {
                                break;
                            }
                            j11 = uploadCachedResult.bytesOffset;
                            bArr2 = uploadCachedResult.iv;
                            this.cachedResults.remove(this.lastSavedPartNum);
                            this.lastSavedPartNum++;
                        }
                        boolean z10 = this.isBigFile;
                        if ((z10 && j11 % 1048576 == 0) || (!z10 && this.saveInfoTimes == 0)) {
                            SharedPreferences.Editor edit = this.preferences.edit();
                            edit.putLong(a4.a.s(new StringBuilder(), this.fileKey, "_uploaded"), j11);
                            if (this.isEncrypted) {
                                edit.putString(a4.a.s(new StringBuilder(), this.fileKey, "_ivc"), Utilities.bytesToHex(bArr2));
                            }
                            edit.commit();
                        }
                    } else {
                        UploadCachedResult uploadCachedResult2 = new UploadCachedResult();
                        uploadCachedResult2.bytesOffset = j3;
                        if (bArr2 != null) {
                            uploadCachedResult2.iv = new byte[32];
                            System.arraycopy(bArr2, 0, uploadCachedResult2.iv, 0, 32);
                        }
                        this.cachedResults.put(i14, uploadCachedResult2);
                    }
                    this.saveInfoTimes++;
                }
                startUploadRequest();
                return;
            }
            return;
        }
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
        int i18 = this.currentType;
        if (i18 == 50331648) {
            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
            return;
        }
        if (i18 == 33554432) {
            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
            return;
        }
        if (i18 == 16777216) {
            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
            return;
        }
        if (i18 == 67108864) {
            String str3 = this.uploadingFilePath;
            if (str3 == null || !(str3.toLowerCase().endsWith("mp3") || this.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
            } else {
                StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$7() {
        if (this.currentUploadRequetsCount < this.maxRequestsCount) {
            startUploadRequest();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$8() {
        Utilities.stageQueue.postRunnable(new r3(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$9(int[] iArr) {
        this.uiRequestTokens.add(Integer.valueOf(iArr[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ff A[Catch: Exception -> 0x0054, TryCatch #1 {Exception -> 0x0054, blocks: (B:4:0x0009, B:6:0x0016, B:10:0x004b, B:12:0x0051, B:13:0x005d, B:15:0x0061, B:17:0x006a, B:18:0x006c, B:20:0x0085, B:22:0x008e, B:23:0x0097, B:26:0x00a0, B:29:0x00bb, B:31:0x00bf, B:33:0x00c2, B:34:0x00c4, B:37:0x00cd, B:39:0x00da, B:40:0x00e4, B:42:0x00e8, B:44:0x00f2, B:47:0x0114, B:49:0x014a, B:51:0x014e, B:53:0x0156, B:55:0x015c, B:57:0x01b2, B:60:0x01ea, B:63:0x01fc, B:65:0x01ff, B:67:0x0202, B:71:0x0212, B:73:0x0216, B:79:0x0238, B:82:0x0245, B:84:0x0252, B:86:0x025e, B:88:0x0262, B:89:0x0268, B:91:0x0273, B:93:0x027c, B:97:0x0289, B:99:0x0290, B:101:0x02a7, B:103:0x027a, B:109:0x02ff, B:111:0x0303, B:112:0x0323, B:114:0x032f, B:116:0x0333, B:118:0x033b, B:119:0x033e, B:121:0x0375, B:123:0x0381, B:125:0x0385, B:126:0x039a, B:127:0x0393, B:128:0x03a7, B:130:0x03af, B:135:0x03bc, B:137:0x03c0, B:139:0x03cb, B:140:0x03de, B:143:0x03ed, B:145:0x03f1, B:147:0x03f5, B:148:0x03fb, B:150:0x0406, B:152:0x040a, B:154:0x0412, B:156:0x0425, B:160:0x0432, B:162:0x0439, B:163:0x0465, B:165:0x0469, B:167:0x047e, B:168:0x0485, B:170:0x049b, B:172:0x049f, B:174:0x04a3, B:175:0x04b2, B:189:0x0481, B:190:0x048b, B:192:0x0419, B:194:0x041d, B:195:0x0423, B:198:0x03d5, B:199:0x03e1, B:209:0x0372, B:210:0x02b1, B:212:0x02bc, B:214:0x02d8, B:216:0x02e0, B:219:0x02e9, B:221:0x02ef, B:224:0x0222, B:232:0x0057, B:233:0x039d, B:234:0x03a5, B:237:0x0045, B:8:0x0027, B:201:0x0342, B:204:0x035d), top: B:3:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0381 A[Catch: Exception -> 0x0054, TryCatch #1 {Exception -> 0x0054, blocks: (B:4:0x0009, B:6:0x0016, B:10:0x004b, B:12:0x0051, B:13:0x005d, B:15:0x0061, B:17:0x006a, B:18:0x006c, B:20:0x0085, B:22:0x008e, B:23:0x0097, B:26:0x00a0, B:29:0x00bb, B:31:0x00bf, B:33:0x00c2, B:34:0x00c4, B:37:0x00cd, B:39:0x00da, B:40:0x00e4, B:42:0x00e8, B:44:0x00f2, B:47:0x0114, B:49:0x014a, B:51:0x014e, B:53:0x0156, B:55:0x015c, B:57:0x01b2, B:60:0x01ea, B:63:0x01fc, B:65:0x01ff, B:67:0x0202, B:71:0x0212, B:73:0x0216, B:79:0x0238, B:82:0x0245, B:84:0x0252, B:86:0x025e, B:88:0x0262, B:89:0x0268, B:91:0x0273, B:93:0x027c, B:97:0x0289, B:99:0x0290, B:101:0x02a7, B:103:0x027a, B:109:0x02ff, B:111:0x0303, B:112:0x0323, B:114:0x032f, B:116:0x0333, B:118:0x033b, B:119:0x033e, B:121:0x0375, B:123:0x0381, B:125:0x0385, B:126:0x039a, B:127:0x0393, B:128:0x03a7, B:130:0x03af, B:135:0x03bc, B:137:0x03c0, B:139:0x03cb, B:140:0x03de, B:143:0x03ed, B:145:0x03f1, B:147:0x03f5, B:148:0x03fb, B:150:0x0406, B:152:0x040a, B:154:0x0412, B:156:0x0425, B:160:0x0432, B:162:0x0439, B:163:0x0465, B:165:0x0469, B:167:0x047e, B:168:0x0485, B:170:0x049b, B:172:0x049f, B:174:0x04a3, B:175:0x04b2, B:189:0x0481, B:190:0x048b, B:192:0x0419, B:194:0x041d, B:195:0x0423, B:198:0x03d5, B:199:0x03e1, B:209:0x0372, B:210:0x02b1, B:212:0x02bc, B:214:0x02d8, B:216:0x02e0, B:219:0x02e9, B:221:0x02ef, B:224:0x0222, B:232:0x0057, B:233:0x039d, B:234:0x03a5, B:237:0x0045, B:8:0x0027, B:201:0x0342, B:204:0x035d), top: B:3:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0342 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void startUploadRequest() {
        byte[] bArr;
        int read;
        byte[] bArr2;
        int i10;
        TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.state != 1) {
            return;
        }
        try {
            this.started = true;
            if (this.stream == null) {
                File file = new File(this.uploadingFilePath);
                this.stream = new RandomAccessFile(file, "r");
                try {
                    z10 = AndroidUtilities.isInternalUri(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(this.stream.getFD(), null)).intValue());
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    z10 = false;
                }
                if (z10) {
                    throw new Exception("trying to upload internal file");
                }
                long j3 = this.estimatedSize;
                if (j3 != 0) {
                    this.totalFileSize = j3;
                } else {
                    this.totalFileSize = file.length();
                }
                if (!this.forceSmallFile && this.totalFileSize > 10485760) {
                    this.isBigFile = true;
                }
                long j10 = MessagesController.getInstance(this.currentAccount).uploadMaxFileParts;
                if (AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium() && this.totalFileSize > FileLoader.DEFAULT_MAX_FILE_SIZE) {
                    j10 = MessagesController.getInstance(this.currentAccount).uploadMaxFilePartsPremium;
                }
                long j11 = j10 * 1024;
                int max = (int) Math.max(this.slowNetwork ? 32L : 128L, ((this.totalFileSize + j11) - 1) / j11);
                this.uploadChunkSize = max;
                if (1024 % max != 0) {
                    int i12 = 64;
                    while (this.uploadChunkSize > i12) {
                        i12 *= 2;
                    }
                    this.uploadChunkSize = i12;
                }
                this.maxRequestsCount = Math.max(1, (this.slowNetwork ? 32 : 2048) / this.uploadChunkSize);
                if (this.isEncrypted) {
                    this.freeRequestIvs = new ArrayList<>(this.maxRequestsCount);
                    for (int i13 = 0; i13 < this.maxRequestsCount; i13++) {
                        this.freeRequestIvs.add(new byte[32]);
                    }
                }
                this.uploadChunkSize *= 1024;
                calcTotalPartsCount();
                this.readBuffer = new byte[this.uploadChunkSize];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.uploadingFilePath);
                sb2.append(this.isEncrypted ? "enc" : "");
                this.fileKey = Utilities.MD5(sb2.toString());
                long j12 = this.preferences.getLong(this.fileKey + "_size", 0L);
                this.uploadStartTime = (int) (System.currentTimeMillis() / 1000);
                if (!this.uploadFirstPartLater && !this.nextPartFirst && this.estimatedSize == 0 && j12 == this.totalFileSize) {
                    this.currentFileId = this.preferences.getLong(this.fileKey + "_id", 0L);
                    int i14 = this.preferences.getInt(this.fileKey + "_time", 0);
                    long j13 = this.preferences.getLong(this.fileKey + "_uploaded", 0L);
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
                        z12 = true;
                        if (!z12 && i14 != 0) {
                            z13 = this.isBigFile;
                            if (!z13) {
                            }
                            if (!z13 && i14 < this.uploadStartTime - 5400.0f) {
                                i14 = 0;
                            }
                            if (i14 == 0) {
                                z14 = z12;
                            } else if (j13 > 0) {
                                this.readBytesCount = j13;
                                this.currentPartNum = (int) (j13 / this.uploadChunkSize);
                                if (!z13) {
                                    int i15 = 0;
                                    while (true) {
                                        z14 = z12;
                                        if (i15 >= this.readBytesCount / this.uploadChunkSize) {
                                            break;
                                        }
                                        int read2 = this.stream.read(this.readBuffer);
                                        int i16 = (!this.isEncrypted || read2 % 16 == 0) ? 0 : 16 - (read2 % 16);
                                        int i17 = read2 + i16;
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i17);
                                        if (read2 != this.uploadChunkSize || this.totalPartsCount == this.currentPartNum + 1) {
                                            this.isLastPart = true;
                                        }
                                        int i18 = 0;
                                        nativeByteBuffer.writeBytes(this.readBuffer, 0, read2);
                                        if (this.isEncrypted) {
                                            int i19 = 0;
                                            while (i19 < i16) {
                                                nativeByteBuffer.writeByte(i18);
                                                i19++;
                                                i18 = 0;
                                            }
                                            Utilities.aesIgeEncryption(nativeByteBuffer.buffer, this.key, this.ivChange, true, true, 0, i17);
                                        }
                                        nativeByteBuffer.reuse();
                                        i15++;
                                        z12 = z14;
                                    }
                                } else {
                                    z14 = z12;
                                    this.stream.seek(j13);
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
                                            z11 = z14;
                                            if (z11) {
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
                                                    for (int i20 = 0; i20 < 4; i20++) {
                                                        this.fingerprint |= ((digest[i20] ^ digest[i20 + 4]) & 255) << (i20 * 8);
                                                    }
                                                } catch (Exception e7) {
                                                    FileLog.e(e7);
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
                                        z11 = true;
                                        if (z11) {
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
                            z11 = z14;
                            if (z11) {
                            }
                            if (this.isEncrypted) {
                            }
                            this.uploadedBytesCount = this.readBytesCount;
                            this.lastSavedPartNum = this.currentPartNum;
                            if (this.uploadFirstPartLater) {
                            }
                        }
                    }
                    z12 = false;
                    if (!z12) {
                        z13 = this.isBigFile;
                        if (!z13 || i14 >= this.uploadStartTime - 86400) {
                            if (!z13) {
                            }
                            if (i14 == 0) {
                            }
                            bArr = null;
                            z11 = z14;
                            if (z11) {
                            }
                            if (this.isEncrypted) {
                            }
                            this.uploadedBytesCount = this.readBytesCount;
                            this.lastSavedPartNum = this.currentPartNum;
                            if (this.uploadFirstPartLater) {
                            }
                        }
                        i14 = 0;
                        if (i14 == 0) {
                        }
                        bArr = null;
                        z11 = z14;
                        if (z11) {
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
                z11 = true;
                if (z11) {
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
                        i11 = 0;
                    } else {
                        i11 = 0;
                        read = this.stream.read(this.readBuffer, 0, 1024);
                    }
                    this.currentPartNum = i11;
                } else {
                    read = this.stream.read(this.readBuffer);
                }
                if (read == -1) {
                    return;
                }
                int i21 = (!this.isEncrypted || read % 16 == 0) ? 0 : 16 - (read % 16);
                int i22 = read + i21;
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i22);
                if (this.nextPartFirst || read != this.uploadChunkSize || (this.estimatedSize == 0 && this.totalPartsCount == this.currentPartNum + 1)) {
                    if (this.uploadFirstPartLater) {
                        this.nextPartFirst = true;
                        this.uploadFirstPartLater = false;
                    } else {
                        this.isLastPart = true;
                    }
                }
                int i23 = 0;
                nativeByteBuffer2.writeBytes(this.readBuffer, 0, read);
                if (this.isEncrypted) {
                    int i24 = 0;
                    while (i24 < i21) {
                        nativeByteBuffer2.writeByte(i23);
                        i24++;
                        i23 = 0;
                    }
                    Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, this.key, this.ivChange, true, true, 0, i22);
                    bArr2 = this.freeRequestIvs.get(0);
                    System.arraycopy(this.ivChange, 0, bArr2, 0, 32);
                    this.freeRequestIvs.remove(0);
                } else {
                    bArr2 = bArr;
                }
                if (this.isBigFile) {
                    TLRPC.TL_upload_saveBigFilePart tL_upload_saveBigFilePart = new TLRPC.TL_upload_saveBigFilePart();
                    i10 = this.currentPartNum;
                    tL_upload_saveBigFilePart.file_part = i10;
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
                    i10 = this.currentPartNum;
                    tL_upload_saveFilePart2.file_part = i10;
                    tL_upload_saveFilePart2.file_id = this.currentFileId;
                    tL_upload_saveFilePart2.bytes = nativeByteBuffer2;
                    tL_upload_saveFilePart = tL_upload_saveFilePart2;
                }
                TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart3 = tL_upload_saveFilePart;
                final int i25 = i10;
                if (this.isLastPart && this.nextPartFirst) {
                    this.nextPartFirst = false;
                    this.currentPartNum = this.totalPartsCount - 1;
                    this.stream.seek(this.totalFileSize);
                }
                this.readBytesCount += read;
                this.currentPartNum++;
                this.currentUploadRequetsCount++;
                final int i26 = this.requestNum;
                this.requestNum = i26 + 1;
                final long j14 = i25 + read;
                final int objectSize = tL_upload_saveFilePart3.getObjectSize() + 4;
                final int i27 = this.operationGuid;
                int i28 = this.slowNetwork ? 4 : ((i26 % 4) << 16) | 4;
                System.currentTimeMillis();
                final int[] iArr = new int[1];
                final byte[] bArr7 = bArr2;
                final int i29 = read;
                iArr[0] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_saveFilePart3, new RequestDelegate() { // from class: org.telegram.messenger.t3
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        FileUploadOperation.this.lambda$startUploadRequest$6(i27, iArr, objectSize, bArr7, i26, i29, i25, j14, tLObject, tL_error);
                    }
                }, null, new c0(this, 3), this.forceSmallFile ? 4 : 0, ConnectionsManager.DEFAULT_DATACENTER_ID, i28, true);
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb3 = new StringBuilder("debug_uploading:  send reqId ");
                    sb3.append(iArr[0]);
                    sb3.append(" ");
                    sb3.append(this.uploadingFilePath);
                    sb3.append(" file_part=");
                    sb3.append(i25);
                    sb3.append(" isBig=");
                    sb3.append(this.isBigFile);
                    sb3.append(" file_id=");
                    i2.g.w(sb3, this.currentFileId);
                }
                this.requestTokens.put(i26, iArr[0]);
                AndroidUtilities.runOnUIThread(new s3(this, iArr, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            this.state = 4;
            this.delegate.didFailedUploadingFile(this);
            cleanup();
        }
    }

    private void storeFileUploadInfo() {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putInt(a4.a.s(new StringBuilder(), this.fileKey, "_time"), this.uploadStartTime);
        edit.putLong(a4.a.s(new StringBuilder(), this.fileKey, "_size"), this.totalFileSize);
        edit.putLong(a4.a.s(new StringBuilder(), this.fileKey, "_id"), this.currentFileId);
        edit.remove(this.fileKey + "_uploaded");
        if (this.isEncrypted) {
            edit.putString(a4.a.s(new StringBuilder(), this.fileKey, "_iv"), Utilities.bytesToHex(this.iv));
            edit.putString(a4.a.s(new StringBuilder(), this.fileKey, "_ivc"), Utilities.bytesToHex(this.ivChange));
            edit.putString(a4.a.s(new StringBuilder(), this.fileKey, "_key"), Utilities.bytesToHex(this.key));
        }
        edit.commit();
    }

    public void cancel() {
        if (this.state == 3) {
            return;
        }
        this.state = 2;
        Utilities.stageQueue.postRunnable(new r3(this, 1));
        AutoDeleteMediaTask.unlockFile(this.uploadingFilePath);
        this.delegate.didFailedUploadingFile(this);
        cleanup();
    }

    public void checkNewDataAvailable(long j3, long j10, Float f7) {
        Utilities.stageQueue.postRunnable(new a3.f0(this, f7, j10, j3, 3));
    }

    public long getTotalFileSize() {
        return this.totalFileSize;
    }

    public void onNetworkChanged(boolean z10) {
        if (this.state != 1) {
            return;
        }
        Utilities.stageQueue.postRunnable(new ah.u(10, this, z10));
        AndroidUtilities.runOnUIThread(new r3(this, 3));
    }

    public void setDelegate(FileUploadOperationDelegate fileUploadOperationDelegate) {
        this.delegate = fileUploadOperationDelegate;
    }

    public void setForceSmallFile() {
        this.forceSmallFile = true;
    }

    public void start() {
        if (this.state != 0) {
            return;
        }
        this.state = 1;
        AutoDeleteMediaTask.lockFile(this.uploadingFilePath);
        Utilities.stageQueue.postRunnable(new r3(this, 0));
    }
}
