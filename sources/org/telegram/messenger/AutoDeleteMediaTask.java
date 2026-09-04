package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class AutoDeleteMediaTask {
    public static Set<String> usingFilePaths = Collections.newSetFromMap(new ConcurrentHashMap());

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        long j3 = fileInfoInternal2.lastUsageDate;
        long j10 = fileInfoInternal.lastUsageDate;
        if (j3 > j10) {
            return -1;
        }
        return j3 < j10 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$run$1(int i10, File file) {
        int i11;
        int i12;
        long j3;
        int i13;
        int i14;
        File file2;
        long j10;
        char c10;
        long j11;
        long j12;
        int i15;
        ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList;
        long j13;
        int i16 = i10;
        long currentTimeMillis = System.currentTimeMillis();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkKeepMedia start task");
        }
        ArrayList arrayList2 = new ArrayList();
        int i17 = 0;
        boolean z10 = false;
        while (true) {
            i11 = 4;
            i12 = 1;
            if (i17 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i17).isClientActivated()) {
                CacheByChatsController cacheByChatsController = UserConfig.getInstance(i17).getMessagesController().getCacheByChatsController();
                arrayList2.add(cacheByChatsController);
                if (cacheByChatsController.getKeepMediaExceptionsByDialogs().size() > 0) {
                    z10 = true;
                }
            }
            i17++;
        }
        int[] iArr = new int[4];
        long j14 = Long.MAX_VALUE;
        boolean z11 = true;
        for (int i18 = 0; i18 < 4; i18++) {
            int i19 = SharedConfig.getPreferences().getInt(i2.g.i(i18, "keep_media_type_"), CacheByChatsController.getDefault(i18));
            iArr[i18] = i19;
            if (i19 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                z11 = false;
            }
            long daysInSeconds = CacheByChatsController.getDaysInSeconds(i19);
            if (daysInSeconds < j14) {
                j14 = daysInSeconds;
            }
        }
        if (z10) {
            z11 = false;
        }
        SparseArray<File> createMediaPaths = ImageLoader.getInstance().createMediaPaths();
        int i20 = 0;
        int i21 = 0;
        long j15 = 0;
        while (i21 < createMediaPaths.size()) {
            if (!z11 || (createMediaPaths.keyAt(i21) != i12 && createMediaPaths.keyAt(i21) != 3)) {
                boolean z12 = createMediaPaths.keyAt(i21) == i11;
                try {
                    File[] listFiles = createMediaPaths.valueAt(i21).listFiles();
                    ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList3 = new ArrayList<>();
                    if (listFiles != null) {
                        c10 = 3;
                        for (int i22 = 0; i22 < listFiles.length; i22++) {
                            if (!listFiles[i22].isDirectory() && !usingFilePaths.contains(listFiles[i22].getAbsolutePath())) {
                                arrayList3.add(new CacheByChatsController.KeepMediaFile(listFiles[i22]));
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                    for (int i23 = 0; i23 < arrayList2.size(); i23++) {
                        ((CacheByChatsController) arrayList2.get(i23)).lookupFiles(arrayList3);
                    }
                    int i24 = 0;
                    while (i24 < arrayList3.size()) {
                        CacheByChatsController.KeepMediaFile keepMediaFile = (CacheByChatsController.KeepMediaFile) arrayList3.get(i24);
                        try {
                            if (keepMediaFile.isStory) {
                                j12 = CacheByChatsController.getDaysInSeconds(iArr[c10]);
                                j10 = currentTimeMillis;
                            } else {
                                j10 = currentTimeMillis;
                                int i25 = keepMediaFile.keepMedia;
                                if (i25 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                                    if (i25 >= 0) {
                                        j11 = CacheByChatsController.getDaysInSeconds(i25);
                                    } else {
                                        int i26 = keepMediaFile.dialogType;
                                        if (i26 >= 0) {
                                            j11 = CacheByChatsController.getDaysInSeconds(iArr[i26]);
                                        } else if (!z12) {
                                            j11 = j14;
                                        }
                                    }
                                    if (j11 != Long.MAX_VALUE) {
                                        j12 = j11;
                                    }
                                }
                                i15 = i24;
                                arrayList = arrayList3;
                                i24 = i15 + 1;
                                i16 = i10;
                                arrayList3 = arrayList;
                                currentTimeMillis = j10;
                            }
                            arrayList = arrayList3;
                            long lastUsageFileTime = Utilities.getLastUsageFileTime(keepMediaFile.file.getAbsolutePath());
                            if (lastUsageFileTime <= 316000000 || lastUsageFileTime >= j13) {
                                i15 = i24;
                            } else {
                                i15 = i24;
                                if (!usingFilePaths.contains(keepMediaFile.file.getPath())) {
                                    try {
                                        if (BuildVars.LOGS_ENABLED) {
                                            i20++;
                                            j15 += keepMediaFile.file.length();
                                        }
                                        if (BuildVars.DEBUG_PRIVATE_VERSION) {
                                            FileLog.d("delete file " + keepMediaFile.file.getPath() + " last_usage_time=" + lastUsageFileTime + " time_local=" + j13 + " story=" + keepMediaFile.isStory);
                                        }
                                        keepMediaFile.file.delete();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                            }
                            i24 = i15 + 1;
                            i16 = i10;
                            arrayList3 = arrayList;
                            currentTimeMillis = j10;
                        } catch (Throwable th2) {
                            th = th2;
                            FileLog.e(th);
                            i21++;
                            i16 = i10;
                            currentTimeMillis = j10;
                            i11 = 4;
                            i12 = 1;
                        }
                        j13 = i16 - j12;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j10 = currentTimeMillis;
                }
            }
            j10 = currentTimeMillis;
            i21++;
            i16 = i10;
            currentTimeMillis = j10;
            i11 = 4;
            i12 = 1;
        }
        long j16 = currentTimeMillis;
        int i27 = SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i27 != Integer.MAX_VALUE) {
            long j17 = i27 == 1 ? 314572800L : i27 * 1048576000;
            long j18 = 0;
            for (int i28 = 0; i28 < createMediaPaths.size(); i28++) {
                j18 += Utilities.getDirSize(createMediaPaths.valueAt(i28).getAbsolutePath(), 0, true);
            }
            if (j18 > j17) {
                ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList4 = new ArrayList<>();
                for (int i29 = 0; i29 < createMediaPaths.size(); i29++) {
                    fillFilesRecursive(createMediaPaths.valueAt(i29), arrayList4);
                }
                for (int i30 = 0; i30 < arrayList2.size(); i30++) {
                    ((CacheByChatsController) arrayList2.get(i30)).lookupFiles(arrayList4);
                }
                Collections.sort(arrayList4, new d(1));
                j3 = 0;
                int i31 = 0;
                i13 = 0;
                for (int i32 = 0; i32 < arrayList4.size(); i32++) {
                    if (((FileInfoInternal) arrayList4.get(i32)).keepMedia != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                        if (((FileInfoInternal) arrayList4.get(i32)).lastUsageDate > 0) {
                            long length = ((FileInfoInternal) arrayList4.get(i32)).file.length();
                            j18 -= length;
                            i13++;
                            j3 += length;
                            try {
                                ((FileInfoInternal) arrayList4.get(i32)).file.delete();
                            } catch (Exception unused) {
                            }
                            if (j18 < j17) {
                                break;
                            }
                        } else {
                            i31++;
                        }
                    }
                }
                i14 = i31;
                file2 = new File(file, "acache");
                if (file2.exists()) {
                    try {
                        Utilities.clearDir(file2.getAbsolutePath(), 0, i10 - 86400, false);
                    } catch (Throwable th4) {
                        FileLog.e(th4);
                    }
                }
                MessagesController.getGlobalMainSettings().edit().putInt("lastKeepMediaCheckTime", SharedConfig.lastKeepMediaCheckTime).apply();
                if (BuildVars.LOGS_ENABLED) {
                    return;
                }
                FileLog.d("checkKeepMedia task end time " + (System.currentTimeMillis() - j16) + " auto deleted info: files " + i20 + " size " + AndroidUtilities.formatFileSize(j15) + "   deleted by size limit info: files " + i13 + " size " + AndroidUtilities.formatFileSize(j3) + " unknownTimeFiles " + i14);
                return;
            }
        }
        j3 = 0;
        i13 = 0;
        i14 = 0;
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
        Utilities.cacheClearQueue.postRunnable(new o6(currentTimeMillis, FileLoader.checkDirectory(4), 4));
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
