package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class AutoDeleteMediaTask {
    public static Set<String> usingFilePaths = Collections.newSetFromMap(new ConcurrentHashMap());

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class FileInfoInternal extends CacheByChatsController.KeepMediaFile {
        final long lastUsageDate;

        private FileInfoInternal(File file) {
            super(file);
            this.lastUsageDate = Utilities.getLastUsageFileTime(file.getAbsolutePath());
        }
    }

    private static void fillFilesRecursive(File file, ArrayList<FileInfoInternal> arrayList) {
        File[] listFiles;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                fillFilesRecursive(file2, arrayList);
            } else if (!file2.getName().equals(".nomedia") && !usingFilePaths.contains(file2.getAbsolutePath())) {
                arrayList.add(new FileInfoInternal(file2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$run$0(FileInfoInternal fileInfoInternal, FileInfoInternal fileInfoInternal2) {
        long j10 = fileInfoInternal2.lastUsageDate;
        long j11 = fileInfoInternal.lastUsageDate;
        if (j10 > j11) {
            return -1;
        }
        return j10 < j11 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$run$1(int i9, File file) {
        int i10;
        int i11;
        long j10;
        int i12;
        int i13;
        File file2;
        long j11;
        char c10;
        long j12;
        long j13;
        int i14;
        ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList;
        long j14;
        int i15 = i9;
        long currentTimeMillis = System.currentTimeMillis();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkKeepMedia start task");
        }
        ArrayList arrayList2 = new ArrayList();
        int i16 = 0;
        boolean z10 = false;
        while (true) {
            i10 = 4;
            i11 = 1;
            if (i16 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i16).isClientActivated()) {
                CacheByChatsController cacheByChatsController = UserConfig.getInstance(i16).getMessagesController().getCacheByChatsController();
                arrayList2.add(cacheByChatsController);
                if (cacheByChatsController.getKeepMediaExceptionsByDialogs().size() > 0) {
                    z10 = true;
                }
            }
            i16++;
        }
        int[] iArr = new int[4];
        long j15 = Long.MAX_VALUE;
        boolean z11 = true;
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = SharedConfig.getPreferences().getInt(j3.r0.l(i17, "keep_media_type_"), CacheByChatsController.getDefault(i17));
            iArr[i17] = i18;
            if (i18 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                z11 = false;
            }
            long daysInSeconds = CacheByChatsController.getDaysInSeconds(i18);
            if (daysInSeconds < j15) {
                j15 = daysInSeconds;
            }
        }
        if (z10) {
            z11 = false;
        }
        SparseArray<File> createMediaPaths = ImageLoader.getInstance().createMediaPaths();
        int i19 = 0;
        int i20 = 0;
        long j16 = 0;
        while (i20 < createMediaPaths.size()) {
            if (!z11 || (createMediaPaths.keyAt(i20) != i11 && createMediaPaths.keyAt(i20) != 3)) {
                boolean z12 = createMediaPaths.keyAt(i20) == i10;
                try {
                    File[] listFiles = createMediaPaths.valueAt(i20).listFiles();
                    ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList3 = new ArrayList<>();
                    if (listFiles != null) {
                        c10 = 3;
                        for (int i21 = 0; i21 < listFiles.length; i21++) {
                            if (!listFiles[i21].isDirectory() && !usingFilePaths.contains(listFiles[i21].getAbsolutePath())) {
                                arrayList3.add(new CacheByChatsController.KeepMediaFile(listFiles[i21]));
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                    for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                        ((CacheByChatsController) arrayList2.get(i22)).lookupFiles(arrayList3);
                    }
                    int i23 = 0;
                    while (i23 < arrayList3.size()) {
                        CacheByChatsController.KeepMediaFile keepMediaFile = (CacheByChatsController.KeepMediaFile) arrayList3.get(i23);
                        try {
                            if (keepMediaFile.isStory) {
                                j13 = CacheByChatsController.getDaysInSeconds(iArr[c10]);
                                j11 = currentTimeMillis;
                            } else {
                                j11 = currentTimeMillis;
                                int i24 = keepMediaFile.keepMedia;
                                if (i24 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                                    if (i24 >= 0) {
                                        j12 = CacheByChatsController.getDaysInSeconds(i24);
                                    } else {
                                        int i25 = keepMediaFile.dialogType;
                                        if (i25 >= 0) {
                                            j12 = CacheByChatsController.getDaysInSeconds(iArr[i25]);
                                        } else if (!z12) {
                                            j12 = j15;
                                        }
                                    }
                                    if (j12 != Long.MAX_VALUE) {
                                        j13 = j12;
                                    }
                                }
                                i14 = i23;
                                arrayList = arrayList3;
                                i23 = i14 + 1;
                                i15 = i9;
                                arrayList3 = arrayList;
                                currentTimeMillis = j11;
                            }
                            arrayList = arrayList3;
                            long lastUsageFileTime = Utilities.getLastUsageFileTime(keepMediaFile.file.getAbsolutePath());
                            if (lastUsageFileTime <= 316000000 || lastUsageFileTime >= j14) {
                                i14 = i23;
                            } else {
                                i14 = i23;
                                if (!usingFilePaths.contains(keepMediaFile.file.getPath())) {
                                    try {
                                        if (BuildVars.LOGS_ENABLED) {
                                            i19++;
                                            j16 += keepMediaFile.file.length();
                                        }
                                        if (BuildVars.DEBUG_PRIVATE_VERSION) {
                                            FileLog.d("delete file " + keepMediaFile.file.getPath() + " last_usage_time=" + lastUsageFileTime + " time_local=" + j14 + " story=" + keepMediaFile.isStory);
                                        }
                                        keepMediaFile.file.delete();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                }
                            }
                            i23 = i14 + 1;
                            i15 = i9;
                            arrayList3 = arrayList;
                            currentTimeMillis = j11;
                        } catch (Throwable th) {
                            th = th;
                            FileLog.e(th);
                            i20++;
                            i15 = i9;
                            currentTimeMillis = j11;
                            i10 = 4;
                            i11 = 1;
                        }
                        j14 = i15 - j13;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j11 = currentTimeMillis;
                }
            }
            j11 = currentTimeMillis;
            i20++;
            i15 = i9;
            currentTimeMillis = j11;
            i10 = 4;
            i11 = 1;
        }
        long j17 = currentTimeMillis;
        int i26 = SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i26 != Integer.MAX_VALUE) {
            long j18 = i26 == 1 ? 314572800L : i26 * 1048576000;
            long j19 = 0;
            for (int i27 = 0; i27 < createMediaPaths.size(); i27++) {
                j19 += Utilities.getDirSize(createMediaPaths.valueAt(i27).getAbsolutePath(), 0, true);
            }
            if (j19 > j18) {
                ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList4 = new ArrayList<>();
                for (int i28 = 0; i28 < createMediaPaths.size(); i28++) {
                    fillFilesRecursive(createMediaPaths.valueAt(i28), arrayList4);
                }
                for (int i29 = 0; i29 < arrayList2.size(); i29++) {
                    ((CacheByChatsController) arrayList2.get(i29)).lookupFiles(arrayList4);
                }
                Collections.sort(arrayList4, new q(1));
                j10 = 0;
                int i30 = 0;
                i12 = 0;
                for (int i31 = 0; i31 < arrayList4.size(); i31++) {
                    if (((FileInfoInternal) arrayList4.get(i31)).keepMedia != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                        if (((FileInfoInternal) arrayList4.get(i31)).lastUsageDate > 0) {
                            long length = ((FileInfoInternal) arrayList4.get(i31)).file.length();
                            j19 -= length;
                            i12++;
                            j10 += length;
                            try {
                                ((FileInfoInternal) arrayList4.get(i31)).file.delete();
                            } catch (Exception unused) {
                            }
                            if (j19 < j18) {
                                break;
                            }
                        } else {
                            i30++;
                        }
                    }
                }
                i13 = i30;
                file2 = new File(file, "acache");
                if (file2.exists()) {
                    try {
                        Utilities.clearDir(file2.getAbsolutePath(), 0, i9 - 86400, false);
                    } catch (Throwable th3) {
                        FileLog.e(th3);
                    }
                }
                MessagesController.getGlobalMainSettings().edit().putInt("lastKeepMediaCheckTime", SharedConfig.lastKeepMediaCheckTime).apply();
                if (BuildVars.LOGS_ENABLED) {
                    return;
                }
                FileLog.d("checkKeepMedia task end time " + (System.currentTimeMillis() - j17) + " auto deleted info: files " + i19 + " size " + AndroidUtilities.formatFileSize(j16) + "   deleted by size limit info: files " + i12 + " size " + AndroidUtilities.formatFileSize(j10) + " unknownTimeFiles " + i13);
                return;
            }
        }
        j10 = 0;
        i12 = 0;
        i13 = 0;
        file2 = new File(file, "acache");
        if (file2.exists()) {
        }
        MessagesController.getGlobalMainSettings().edit().putInt("lastKeepMediaCheckTime", SharedConfig.lastKeepMediaCheckTime).apply();
        if (BuildVars.LOGS_ENABLED) {
        }
    }

    public static void lockFile(File file) {
        if (file == null) {
            return;
        }
        lockFile(file.getAbsolutePath());
    }

    public static void run() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - SharedConfig.lastKeepMediaCheckTime) < 86400) {
            return;
        }
        SharedConfig.lastKeepMediaCheckTime = currentTimeMillis;
        Utilities.cacheClearQueue.postRunnable(new n6(currentTimeMillis, FileLoader.checkDirectory(4), 4));
    }

    public static void unlockFile(File file) {
        if (file == null) {
            return;
        }
        unlockFile(file.getAbsolutePath());
    }

    public static void lockFile(String str) {
        if (str == null) {
            return;
        }
        usingFilePaths.add(str);
    }

    public static void unlockFile(String str) {
        if (str == null) {
            return;
        }
        usingFilePaths.remove(str);
    }
}
