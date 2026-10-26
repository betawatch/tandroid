package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class FileUploadOperation {
    private static final int initialRequestsCount = 8;
    private static final int initialRequestsSlowNetworkCount = 1;
    private static final int maxUploadingKBytes = 8192;
    private static final int maxUploadingSlowNetworkKBytes = 32;
    private static final int minUploadChunkSize = 128;
    private static final int minUploadChunkSizeBig = 512;
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
    private int uploadConnectionsCount = 4;
    private final int[] uploadRequestsPerConnection = new int[8];
    private int uploadChunkSize = 65536;
    public final SparseIntArray requestTokens = new SparseIntArray();
    public final ArrayList<Integer> uiRequestTokens = new ArrayList<>();
    private SparseArray<UploadCachedResult> cachedResults = new SparseArray<>();
    private boolean[] recalculatedEstimatedSize = {false, false};

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public interface FileUploadOperationDelegate {
        void didChangedUploadProgress(FileUploadOperation fileUploadOperation, long j10, long j11);

        void didFailedUploadingFile(FileUploadOperation fileUploadOperation);

        void didFinishUploadingFile(FileUploadOperation fileUploadOperation, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2);
    }

    /* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
    public static class UploadCachedResult {
        private long bytesOffset;
        private byte[] iv;

        private UploadCachedResult() {
        }
    }

    public FileUploadOperation(int i10, String str, boolean z10, long j10, int i11) {
        this.currentAccount = i10;
        this.uploadingFilePath = str;
        this.isEncrypted = z10;
        this.estimatedSize = j10;
        this.currentType = i11;
        this.uploadFirstPartLater = (j10 == 0 || z10) ? false : true;
    }

    private void calcTotalPartsCount() {
        if (!this.uploadFirstPartLater) {
            long j10 = this.totalFileSize;
            int i10 = this.uploadChunkSize;
            this.totalPartsCount = (int) (((j10 + i10) - 1) / i10);
        } else if (this.isBigFile) {
            long j11 = this.totalFileSize;
            int i11 = this.uploadChunkSize;
            this.totalPartsCount = ((int) ((((j11 - i11) + i11) - 1) / i11)) + 1;
        } else {
            long j12 = this.totalFileSize - 1024;
            int i12 = this.uploadChunkSize;
            this.totalPartsCount = ((int) (((j12 + i12) - 1) / i12)) + 1;
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
    public /* synthetic */ void lambda$checkNewDataAvailable$4(Float f7, long j10, long j11) {
        if (f7 != null && this.estimatedSize != 0 && j10 == 0) {
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
                        this.estimatedSize = (long) (j11 / f7.floatValue());
                    }
                }
            }
            z11 = z10;
            if (z11) {
            }
        }
        if (this.estimatedSize != 0 && j10 != 0) {
            this.estimatedSize = 0L;
            this.totalFileSize = j10;
            calcTotalPartsCount();
            if (!this.uploadFirstPartLater && this.started) {
                storeFileUploadInfo();
            }
        }
        if (j10 <= 0) {
            j10 = j11;
        }
        this.availableSize = j10;
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
            Arrays.fill(this.uploadRequestsPerConnection, 0);
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
        lambda$startUploadRequest$7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$5(int[] iArr) {
        this.uiRequestTokens.remove(Integer.valueOf(iArr[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$6(int i10, int i11, int[] iArr, int i12, byte[] bArr, int i13, int i14, int i15, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.InputEncryptedFile tL_inputEncryptedFileUploaded;
        TLRPC.InputFile tL_inputFile;
        byte[] bArr2 = bArr;
        if (i10 != this.operationGuid) {
            return;
        }
        int[] iArr2 = this.uploadRequestsPerConnection;
        iArr2[i11] = iArr2[i11] - 1;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("debug_uploading:  response reqId ");
            sb2.append(iArr[0]);
            sb2.append(" time");
            ic.a.w(this.uploadingFilePath, sb2);
        }
        int currentNetworkType = tLObject != null ? tLObject.networkType : ApplicationLoader.getCurrentNetworkType();
        int i16 = this.currentType;
        if (i16 == 50331648) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 3, i12);
        } else if (i16 == 33554432) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 2, i12);
        } else if (i16 == 16777216) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 4, i12);
        } else if (i16 == 67108864) {
            String str = this.uploadingFilePath;
            if (str == null || !(str.toLowerCase().endsWith("mp3") || this.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 5, i12);
            } else {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 7, i12);
            }
        }
        if (bArr2 != null) {
            this.freeRequestIvs.add(bArr2);
        }
        this.requestTokens.delete(i13);
        AndroidUtilities.runOnUIThread(new a4(this, iArr, 1));
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            this.state = 4;
            this.delegate.didFailedUploadingFile(this);
            cleanup();
            return;
        }
        if (this.state != 1) {
            return;
        }
        this.uploadedBytesCount += i14;
        long j11 = this.estimatedSize;
        this.delegate.didChangedUploadProgress(this, this.uploadedBytesCount, j11 != 0 ? Math.max(this.availableSize, j11) : this.totalFileSize);
        int i17 = this.currentUploadRequetsCount - 1;
        this.currentUploadRequetsCount = i17;
        if (!this.isLastPart || i17 != 0 || this.state != 1) {
            if (i17 < this.maxRequestsCount) {
                if (this.estimatedSize == 0 && !this.uploadFirstPartLater && !this.nextPartFirst) {
                    if (this.saveInfoTimes >= 4) {
                        this.saveInfoTimes = 0;
                    }
                    int i18 = this.lastSavedPartNum;
                    if (i15 == i18) {
                        this.lastSavedPartNum = i18 + 1;
                        long j12 = j10;
                        while (true) {
                            UploadCachedResult uploadCachedResult = this.cachedResults.get(this.lastSavedPartNum);
                            if (uploadCachedResult == null) {
                                break;
                            }
                            j12 = uploadCachedResult.bytesOffset;
                            bArr2 = uploadCachedResult.iv;
                            this.cachedResults.remove(this.lastSavedPartNum);
                            this.lastSavedPartNum++;
                        }
                        boolean z10 = this.isBigFile;
                        if ((z10 && j12 % 1048576 == 0) || (!z10 && this.saveInfoTimes == 0)) {
                            SharedPreferences.Editor edit = this.preferences.edit();
                            edit.putLong(a1.g.s(new StringBuilder(), this.fileKey, "_uploaded"), j12);
                            if (this.isEncrypted) {
                                edit.putString(a1.g.s(new StringBuilder(), this.fileKey, "_ivc"), Utilities.bytesToHex(bArr2));
                            }
                            edit.commit();
                        }
                    } else {
                        UploadCachedResult uploadCachedResult2 = new UploadCachedResult();
                        uploadCachedResult2.bytesOffset = j10;
                        if (bArr2 != null) {
                            uploadCachedResult2.iv = new byte[32];
                            System.arraycopy(bArr2, 0, uploadCachedResult2.iv, 0, 32);
                        }
                        this.cachedResults.put(i15, uploadCachedResult2);
                    }
                    this.saveInfoTimes++;
                }
                lambda$startUploadRequest$7();
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
        int i19 = this.currentType;
        if (i19 == 50331648) {
            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
            return;
        }
        if (i19 == 33554432) {
            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
            return;
        }
        if (i19 == 16777216) {
            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
            return;
        }
        if (i19 == 67108864) {
            String str3 = this.uploadingFilePath;
            if (str3 == null || !(str3.toLowerCase().endsWith("mp3") || this.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
            } else {
                StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$8() {
        Utilities.stageQueue.postRunnable(new y3(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startUploadRequest$9(int[] iArr) {
        this.uiRequestTokens.add(Integer.valueOf(iArr[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f8 A[Catch: Exception -> 0x0054, TryCatch #2 {Exception -> 0x0054, blocks: (B:4:0x0009, B:6:0x0016, B:10:0x004b, B:12:0x0051, B:13:0x005d, B:15:0x0061, B:17:0x006a, B:18:0x006c, B:20:0x0085, B:22:0x008e, B:23:0x0097, B:26:0x00a7, B:29:0x00c0, B:31:0x00c4, B:33:0x00c7, B:34:0x00c9, B:37:0x00d1, B:40:0x00ee, B:42:0x00f4, B:43:0x00fe, B:45:0x0102, B:47:0x010c, B:50:0x012d, B:52:0x0162, B:54:0x0166, B:56:0x016c, B:58:0x0172, B:60:0x01c4, B:63:0x01fa, B:66:0x020c, B:68:0x020f, B:70:0x0212, B:74:0x0222, B:76:0x0226, B:82:0x0246, B:85:0x0253, B:87:0x025e, B:89:0x026a, B:91:0x026e, B:92:0x0274, B:94:0x027f, B:96:0x0288, B:100:0x0295, B:102:0x029c, B:104:0x02b3, B:106:0x0286, B:109:0x02bb, B:111:0x02c4, B:113:0x02df, B:115:0x02e7, B:117:0x02ea, B:118:0x02f0, B:120:0x02f8, B:122:0x02fc, B:123:0x031c, B:125:0x0328, B:127:0x032c, B:129:0x0332, B:130:0x0335, B:132:0x036c, B:134:0x0378, B:136:0x037c, B:137:0x0393, B:138:0x038a, B:148:0x0369, B:150:0x0232, B:158:0x009e, B:162:0x0057, B:163:0x0396, B:164:0x039e, B:168:0x0045, B:169:0x039f, B:171:0x03a5, B:175:0x03b2, B:177:0x03b6, B:179:0x03bf, B:180:0x03d4, B:184:0x03e5, B:186:0x03e9, B:188:0x03ed, B:189:0x03f3, B:191:0x03fe, B:193:0x0402, B:195:0x0408, B:197:0x041b, B:201:0x0428, B:203:0x042f, B:204:0x045a, B:206:0x045e, B:208:0x0471, B:209:0x0478, B:211:0x048e, B:213:0x0492, B:215:0x0496, B:216:0x04a5, B:240:0x0474, B:241:0x047e, B:242:0x040f, B:244:0x0413, B:245:0x0419, B:248:0x03c9, B:249:0x03d8, B:8:0x0027, B:140:0x0339, B:143:0x0354), top: B:3:0x0009, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0378 A[Catch: Exception -> 0x0054, TryCatch #2 {Exception -> 0x0054, blocks: (B:4:0x0009, B:6:0x0016, B:10:0x004b, B:12:0x0051, B:13:0x005d, B:15:0x0061, B:17:0x006a, B:18:0x006c, B:20:0x0085, B:22:0x008e, B:23:0x0097, B:26:0x00a7, B:29:0x00c0, B:31:0x00c4, B:33:0x00c7, B:34:0x00c9, B:37:0x00d1, B:40:0x00ee, B:42:0x00f4, B:43:0x00fe, B:45:0x0102, B:47:0x010c, B:50:0x012d, B:52:0x0162, B:54:0x0166, B:56:0x016c, B:58:0x0172, B:60:0x01c4, B:63:0x01fa, B:66:0x020c, B:68:0x020f, B:70:0x0212, B:74:0x0222, B:76:0x0226, B:82:0x0246, B:85:0x0253, B:87:0x025e, B:89:0x026a, B:91:0x026e, B:92:0x0274, B:94:0x027f, B:96:0x0288, B:100:0x0295, B:102:0x029c, B:104:0x02b3, B:106:0x0286, B:109:0x02bb, B:111:0x02c4, B:113:0x02df, B:115:0x02e7, B:117:0x02ea, B:118:0x02f0, B:120:0x02f8, B:122:0x02fc, B:123:0x031c, B:125:0x0328, B:127:0x032c, B:129:0x0332, B:130:0x0335, B:132:0x036c, B:134:0x0378, B:136:0x037c, B:137:0x0393, B:138:0x038a, B:148:0x0369, B:150:0x0232, B:158:0x009e, B:162:0x0057, B:163:0x0396, B:164:0x039e, B:168:0x0045, B:169:0x039f, B:171:0x03a5, B:175:0x03b2, B:177:0x03b6, B:179:0x03bf, B:180:0x03d4, B:184:0x03e5, B:186:0x03e9, B:188:0x03ed, B:189:0x03f3, B:191:0x03fe, B:193:0x0402, B:195:0x0408, B:197:0x041b, B:201:0x0428, B:203:0x042f, B:204:0x045a, B:206:0x045e, B:208:0x0471, B:209:0x0478, B:211:0x048e, B:213:0x0492, B:215:0x0496, B:216:0x04a5, B:240:0x0474, B:241:0x047e, B:242:0x040f, B:244:0x0413, B:245:0x0419, B:248:0x03c9, B:249:0x03d8, B:8:0x0027, B:140:0x0339, B:143:0x0354), top: B:3:0x0009, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0339 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void startUploadRequest() {
        int read;
        int i10;
        TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.state != 1) {
            return;
        }
        try {
            this.started = true;
            byte[] bArr = null;
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
                long j10 = this.estimatedSize;
                if (j10 != 0) {
                    this.totalFileSize = j10;
                } else {
                    this.totalFileSize = file.length();
                }
                if (!this.forceSmallFile && this.totalFileSize > 10485760) {
                    this.isBigFile = true;
                }
                long j11 = MessagesController.getInstance(this.currentAccount).uploadMaxFileParts;
                if (AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium() && this.totalFileSize > FileLoader.DEFAULT_MAX_FILE_SIZE) {
                    j11 = MessagesController.getInstance(this.currentAccount).uploadMaxFilePartsPremium;
                }
                long j12 = j11 * 1024;
                int max = (int) Math.max(this.slowNetwork ? 32L : this.isBigFile ? 512L : 128L, ((this.totalFileSize + j12) - 1) / j12);
                this.uploadChunkSize = max;
                if (1024 % max != 0) {
                    int i13 = 64;
                    while (this.uploadChunkSize > i13) {
                        i13 *= 2;
                    }
                    this.uploadChunkSize = i13;
                }
                this.maxRequestsCount = Math.max(1, (this.slowNetwork ? 32 : 8192) / this.uploadChunkSize);
                this.uploadConnectionsCount = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium() ? 8 : 4;
                if (this.isEncrypted) {
                    this.freeRequestIvs = new ArrayList<>(this.maxRequestsCount);
                    for (int i14 = 0; i14 < this.maxRequestsCount; i14++) {
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
                long j13 = this.preferences.getLong(this.fileKey + "_size", 0L);
                this.uploadStartTime = (int) (System.currentTimeMillis() / 1000);
                if (!this.uploadFirstPartLater && !this.nextPartFirst && this.estimatedSize == 0 && j13 == this.totalFileSize) {
                    this.currentFileId = this.preferences.getLong(this.fileKey + "_id", 0L);
                    int i15 = this.preferences.getInt(this.fileKey + "_time", 0);
                    long j14 = this.preferences.getLong(this.fileKey + "_uploaded", 0L);
                    if (this.isEncrypted) {
                        String string = this.preferences.getString(this.fileKey + "_iv", null);
                        String string2 = this.preferences.getString(this.fileKey + "_key", null);
                        if (string != null && string2 != null) {
                            this.key = Utilities.hexToBytes(string2);
                            byte[] hexToBytes = Utilities.hexToBytes(string);
                            this.iv = hexToBytes;
                            byte[] bArr2 = this.key;
                            if (bArr2 != null && hexToBytes != null && bArr2.length == 32 && hexToBytes.length == 32) {
                                byte[] bArr3 = new byte[32];
                                this.ivChange = bArr3;
                                System.arraycopy(hexToBytes, 0, bArr3, 0, 32);
                            }
                        }
                        z11 = true;
                        if (!z11 && i15 != 0) {
                            z12 = this.isBigFile;
                            if (!z12) {
                            }
                            if (!z12 && i15 < this.uploadStartTime - 5400.0f) {
                                i15 = 0;
                            }
                            if (i15 != 0) {
                                if (j14 > 0) {
                                    this.readBytesCount = j14;
                                    this.currentPartNum = (int) (j14 / this.uploadChunkSize);
                                    if (z12) {
                                        this.stream.seek(j14);
                                        if (this.isEncrypted) {
                                            String string3 = this.preferences.getString(this.fileKey + "_ivc", null);
                                            if (string3 != null) {
                                                byte[] hexToBytes2 = Utilities.hexToBytes(string3);
                                                this.ivChange = hexToBytes2;
                                                if (hexToBytes2 == null || hexToBytes2.length != 32) {
                                                    this.readBytesCount = 0L;
                                                    this.currentPartNum = 0;
                                                }
                                            } else {
                                                this.readBytesCount = 0L;
                                                this.currentPartNum = 0;
                                            }
                                        }
                                    } else {
                                        for (int i16 = 0; i16 < this.readBytesCount / this.uploadChunkSize; i16++) {
                                            int read2 = this.stream.read(this.readBuffer);
                                            int i17 = (!this.isEncrypted || read2 % 16 == 0) ? 0 : 16 - (read2 % 16);
                                            int i18 = read2 + i17;
                                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i18);
                                            if (read2 != this.uploadChunkSize || this.totalPartsCount == this.currentPartNum + 1) {
                                                this.isLastPart = true;
                                            }
                                            int i19 = 0;
                                            nativeByteBuffer.writeBytes(this.readBuffer, 0, read2);
                                            if (this.isEncrypted) {
                                                int i20 = 0;
                                                while (i20 < i17) {
                                                    nativeByteBuffer.writeByte(i19);
                                                    i20++;
                                                    i19 = 0;
                                                }
                                                Utilities.aesIgeEncryption(nativeByteBuffer.buffer, this.key, this.ivChange, true, true, 0, i18);
                                            }
                                            nativeByteBuffer.reuse();
                                        }
                                    }
                                }
                            }
                            if (z11) {
                                if (this.isEncrypted) {
                                    byte[] bArr4 = new byte[32];
                                    this.iv = bArr4;
                                    this.key = new byte[32];
                                    this.ivChange = new byte[32];
                                    Utilities.random.nextBytes(bArr4);
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
                                    byte[] bArr5 = new byte[64];
                                    System.arraycopy(this.key, 0, bArr5, 0, 32);
                                    System.arraycopy(this.iv, 0, bArr5, 32, 32);
                                    byte[] digest = messageDigest.digest(bArr5);
                                    for (int i21 = 0; i21 < 4; i21++) {
                                        this.fingerprint |= ((digest[i21] ^ digest[i21 + 4]) & 255) << (i21 * 8);
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
                        }
                    }
                    z11 = false;
                    if (!z11) {
                        z12 = this.isBigFile;
                        if (!z12 || i15 >= this.uploadStartTime - 86400) {
                            if (!z12) {
                            }
                            if (i15 != 0) {
                            }
                            if (z11) {
                            }
                            if (this.isEncrypted) {
                            }
                            this.uploadedBytesCount = this.readBytesCount;
                            this.lastSavedPartNum = this.currentPartNum;
                            if (this.uploadFirstPartLater) {
                            }
                        }
                        i15 = 0;
                        if (i15 != 0) {
                        }
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
            if (this.estimatedSize == 0 || this.readBytesCount + this.uploadChunkSize <= this.availableSize) {
                if (this.nextPartFirst) {
                    this.stream.seek(0L);
                    if (this.isBigFile) {
                        read = this.stream.read(this.readBuffer);
                        i12 = 0;
                    } else {
                        i12 = 0;
                        read = this.stream.read(this.readBuffer, 0, 1024);
                    }
                    this.currentPartNum = i12;
                } else {
                    read = this.stream.read(this.readBuffer);
                }
                final int i22 = read;
                if (i22 == -1) {
                    return;
                }
                int i23 = (!this.isEncrypted || i22 % 16 == 0) ? 0 : 16 - (i22 % 16);
                int i24 = i22 + i23;
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i24);
                if (this.nextPartFirst || i22 != this.uploadChunkSize || (this.estimatedSize == 0 && this.totalPartsCount == this.currentPartNum + 1)) {
                    if (this.uploadFirstPartLater) {
                        this.nextPartFirst = true;
                        this.uploadFirstPartLater = false;
                    } else {
                        this.isLastPart = true;
                    }
                }
                int i25 = 0;
                nativeByteBuffer2.writeBytes(this.readBuffer, 0, i22);
                if (this.isEncrypted) {
                    int i26 = 0;
                    while (i26 < i23) {
                        nativeByteBuffer2.writeByte(i25);
                        i26++;
                        i25 = 0;
                    }
                    Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, this.key, this.ivChange, true, true, 0, i24);
                    bArr = this.freeRequestIvs.get(0);
                    System.arraycopy(this.ivChange, 0, bArr, 0, 32);
                    this.freeRequestIvs.remove(0);
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
                final int i27 = i10;
                if (this.isLastPart && this.nextPartFirst) {
                    this.nextPartFirst = false;
                    this.currentPartNum = this.totalPartsCount - 1;
                    this.stream.seek(this.totalFileSize);
                }
                this.readBytesCount += i22;
                this.currentPartNum++;
                this.currentUploadRequetsCount++;
                final int i28 = this.requestNum;
                this.requestNum = i28 + 1;
                final long j15 = i27 + i22;
                final int objectSize = tL_upload_saveFilePart3.getObjectSize() + 4;
                final int i29 = this.operationGuid;
                if (this.slowNetwork) {
                    i11 = 4;
                } else {
                    int i30 = i28 % this.uploadConnectionsCount;
                    int i31 = 1;
                    while (true) {
                        int i32 = this.uploadConnectionsCount;
                        if (i31 >= i32) {
                            break;
                        }
                        int i33 = (i28 + i31) % i32;
                        int[] iArr = this.uploadRequestsPerConnection;
                        if (iArr[i33] < iArr[i30]) {
                            i30 = i33;
                        }
                        i31++;
                    }
                    i11 = (i30 << 16) | 4;
                }
                final int i34 = i11 >> 16;
                int[] iArr2 = this.uploadRequestsPerConnection;
                iArr2[i34] = iArr2[i34] + 1;
                System.currentTimeMillis();
                final int[] iArr3 = new int[1];
                final byte[] bArr6 = bArr;
                iArr3[0] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_saveFilePart3, new RequestDelegate() { // from class: org.telegram.messenger.z3
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        FileUploadOperation.this.lambda$startUploadRequest$6(i29, i34, iArr3, objectSize, bArr6, i28, i22, i27, j15, tLObject, tL_error);
                    }
                }, null, new g0(this, 3), this.forceSmallFile ? 4 : 0, ConnectionsManager.DEFAULT_DATACENTER_ID, i11, true);
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb3 = new StringBuilder("debug_uploading:  send reqId ");
                    sb3.append(iArr3[0]);
                    sb3.append(" ");
                    sb3.append(this.uploadingFilePath);
                    sb3.append(" file_part=");
                    sb3.append(i27);
                    sb3.append(" isBig=");
                    sb3.append(this.isBigFile);
                    sb3.append(" file_id=");
                    t.s(sb3, this.currentFileId);
                }
                this.requestTokens.put(i28, iArr3[0]);
                AndroidUtilities.runOnUIThread(new a4(this, iArr3, 0));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            this.state = 4;
            this.delegate.didFailedUploadingFile(this);
            cleanup();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startUploadRequests, reason: merged with bridge method [inline-methods] */
    public void lambda$startUploadRequest$7() {
        int i10;
        while (this.state == 1 && (i10 = this.currentUploadRequetsCount) < this.maxRequestsCount) {
            startUploadRequest();
            if (this.currentUploadRequetsCount == i10) {
                return;
            }
        }
    }

    private void storeFileUploadInfo() {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putInt(a1.g.s(new StringBuilder(), this.fileKey, "_time"), this.uploadStartTime);
        edit.putLong(a1.g.s(new StringBuilder(), this.fileKey, "_size"), this.totalFileSize);
        edit.putLong(a1.g.s(new StringBuilder(), this.fileKey, "_id"), this.currentFileId);
        edit.remove(this.fileKey + "_uploaded");
        if (this.isEncrypted) {
            edit.putString(a1.g.s(new StringBuilder(), this.fileKey, "_iv"), Utilities.bytesToHex(this.iv));
            edit.putString(a1.g.s(new StringBuilder(), this.fileKey, "_ivc"), Utilities.bytesToHex(this.ivChange));
            edit.putString(a1.g.s(new StringBuilder(), this.fileKey, "_key"), Utilities.bytesToHex(this.key));
        }
        edit.commit();
    }

    public void cancel() {
        if (this.state == 3) {
            return;
        }
        this.state = 2;
        Utilities.stageQueue.postRunnable(new y3(this, 1));
        AutoDeleteMediaTask.unlockFile(this.uploadingFilePath);
        this.delegate.didFailedUploadingFile(this);
        cleanup();
    }

    public void checkNewDataAvailable(long j10, long j11, Float f7) {
        Utilities.stageQueue.postRunnable(new a3.h0(this, f7, j11, j10, 4));
    }

    public long getTotalFileSize() {
        return this.totalFileSize;
    }

    public void onNetworkChanged(boolean z10) {
        if (this.state != 1) {
            return;
        }
        Utilities.stageQueue.postRunnable(new bh.n(14, this, z10));
        AndroidUtilities.runOnUIThread(new y3(this, 3));
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
        Utilities.stageQueue.postRunnable(new y3(this, 0));
    }
}
