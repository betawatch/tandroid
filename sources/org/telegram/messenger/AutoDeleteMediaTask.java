package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import org.telegram.messenger.AutoDeleteMediaTask;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes3.dex */
public class AutoDeleteMediaTask {
    public static Set<String> usingFilePaths = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void run() {
        final int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (Math.abs(currentTimeMillis - SharedConfig.lastKeepMediaCheckTime) < 86400) {
            return;
        }
        SharedConfig.lastKeepMediaCheckTime = currentTimeMillis;
        final File checkDirectory = FileLoader.checkDirectory(4);
        Utilities.cacheClearQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.AutoDeleteMediaTask$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AutoDeleteMediaTask.$r8$lambda$ap5ZJdebehBgIX4zKtBVK_9N3_k(currentTimeMillis, checkDirectory);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$ap5ZJdebehBgIX4zKtBVK_9N3_k(int i, File file) {
        int i2;
        int i3;
        long j;
        int i4;
        int i5;
        File file2;
        long j2;
        char c;
        long j3;
        long j4;
        int i6;
        ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList;
        long j5;
        int i7 = i;
        long currentTimeMillis = System.currentTimeMillis();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkKeepMedia start task");
        }
        ArrayList arrayList2 = new ArrayList();
        int i8 = 0;
        boolean z = false;
        while (true) {
            i2 = 1;
            i3 = 4;
            if (i8 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i8).isClientActivated()) {
                CacheByChatsController cacheByChatsController = UserConfig.getInstance(i8).getMessagesController().getCacheByChatsController();
                arrayList2.add(cacheByChatsController);
                if (cacheByChatsController.getKeepMediaExceptionsByDialogs().size() > 0) {
                    z = true;
                }
            }
            i8++;
        }
        int[] iArr = new int[4];
        long j6 = Long.MAX_VALUE;
        boolean z2 = true;
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = SharedConfig.getPreferences().getInt("keep_media_type_" + i9, CacheByChatsController.getDefault(i9));
            iArr[i9] = i10;
            if (i10 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                z2 = false;
            }
            long daysInSeconds = CacheByChatsController.getDaysInSeconds(i10);
            if (daysInSeconds < j6) {
                j6 = daysInSeconds;
            }
        }
        if (z) {
            z2 = false;
        }
        SparseArray<File> createMediaPaths = ImageLoader.getInstance().createMediaPaths();
        int i11 = 0;
        int i12 = 0;
        long j7 = 0;
        while (i12 < createMediaPaths.size()) {
            if (!z2 || (createMediaPaths.keyAt(i12) != i2 && createMediaPaths.keyAt(i12) != 3)) {
                boolean z3 = createMediaPaths.keyAt(i12) == i3;
                try {
                    File[] listFiles = createMediaPaths.valueAt(i12).listFiles();
                    ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList3 = new ArrayList<>();
                    if (listFiles != null) {
                        c = 3;
                        for (int i13 = 0; i13 < listFiles.length; i13++) {
                            if (!listFiles[i13].isDirectory() && !usingFilePaths.contains(listFiles[i13].getAbsolutePath())) {
                                arrayList3.add(new CacheByChatsController.KeepMediaFile(listFiles[i13]));
                            }
                        }
                    } else {
                        c = 3;
                    }
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        ((CacheByChatsController) arrayList2.get(i14)).lookupFiles(arrayList3);
                    }
                    int i15 = 0;
                    while (i15 < arrayList3.size()) {
                        CacheByChatsController.KeepMediaFile keepMediaFile = (CacheByChatsController.KeepMediaFile) arrayList3.get(i15);
                        try {
                            if (keepMediaFile.isStory) {
                                j4 = CacheByChatsController.getDaysInSeconds(iArr[c]);
                                j2 = currentTimeMillis;
                            } else {
                                j2 = currentTimeMillis;
                                int i16 = keepMediaFile.keepMedia;
                                if (i16 != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                                    if (i16 >= 0) {
                                        j3 = CacheByChatsController.getDaysInSeconds(i16);
                                    } else {
                                        int i17 = keepMediaFile.dialogType;
                                        if (i17 >= 0) {
                                            j3 = CacheByChatsController.getDaysInSeconds(iArr[i17]);
                                        } else if (!z3) {
                                            j3 = j6;
                                        }
                                    }
                                    if (j3 != Long.MAX_VALUE) {
                                        j4 = j3;
                                    }
                                }
                                i6 = i15;
                                arrayList = arrayList3;
                                i15 = i6 + 1;
                                i7 = i;
                                arrayList3 = arrayList;
                                currentTimeMillis = j2;
                            }
                            arrayList = arrayList3;
                            long lastUsageFileTime = Utilities.getLastUsageFileTime(keepMediaFile.file.getAbsolutePath());
                            if (lastUsageFileTime <= 316000000 || lastUsageFileTime >= j5) {
                                i6 = i15;
                            } else {
                                i6 = i15;
                                if (!usingFilePaths.contains(keepMediaFile.file.getPath())) {
                                    try {
                                        if (BuildVars.LOGS_ENABLED) {
                                            i11++;
                                            j7 += keepMediaFile.file.length();
                                        }
                                        if (BuildVars.DEBUG_PRIVATE_VERSION) {
                                            FileLog.d("delete file " + keepMediaFile.file.getPath() + " last_usage_time=" + lastUsageFileTime + " time_local=" + j5 + " story=" + keepMediaFile.isStory);
                                        }
                                        keepMediaFile.file.delete();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                            }
                            i15 = i6 + 1;
                            i7 = i;
                            arrayList3 = arrayList;
                            currentTimeMillis = j2;
                        } catch (Throwable th) {
                            th = th;
                            FileLog.e(th);
                            i12++;
                            i7 = i;
                            currentTimeMillis = j2;
                            i2 = 1;
                            i3 = 4;
                        }
                        j5 = i7 - j4;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j2 = currentTimeMillis;
                }
            }
            j2 = currentTimeMillis;
            i12++;
            i7 = i;
            currentTimeMillis = j2;
            i2 = 1;
            i3 = 4;
        }
        long j8 = currentTimeMillis;
        int i18 = SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID);
        if (i18 != Integer.MAX_VALUE) {
            long j9 = i18 == 1 ? 314572800L : i18 * 1048576000;
            long j10 = 0;
            for (int i19 = 0; i19 < createMediaPaths.size(); i19++) {
                j10 += Utilities.getDirSize(createMediaPaths.valueAt(i19).getAbsolutePath(), 0, true);
            }
            if (j10 > j9) {
                ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList4 = new ArrayList<>();
                for (int i20 = 0; i20 < createMediaPaths.size(); i20++) {
                    fillFilesRecursive(createMediaPaths.valueAt(i20), arrayList4);
                }
                for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                    ((CacheByChatsController) arrayList2.get(i21)).lookupFiles(arrayList4);
                }
                Collections.sort(arrayList4, new Comparator() { // from class: org.telegram.messenger.AutoDeleteMediaTask$$ExternalSyntheticLambda1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return AutoDeleteMediaTask.$r8$lambda$8dg4GbivFh1IfgXiPENigECyG2w((AutoDeleteMediaTask.FileInfoInternal) obj, (AutoDeleteMediaTask.FileInfoInternal) obj2);
                    }
                });
                j = 0;
                int i22 = 0;
                i4 = 0;
                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                    if (((FileInfoInternal) arrayList4.get(i23)).keepMedia != CacheByChatsController.KEEP_MEDIA_FOREVER) {
                        if (((FileInfoInternal) arrayList4.get(i23)).lastUsageDate > 0) {
                            long length = ((FileInfoInternal) arrayList4.get(i23)).file.length();
                            j10 -= length;
                            i22++;
                            j += length;
                            try {
                                ((FileInfoInternal) arrayList4.get(i23)).file.delete();
                            } catch (Exception unused) {
                            }
                            if (j10 < j9) {
                                break;
                            }
                        } else {
                            i4++;
                        }
                    }
                }
                i5 = i22;
                file2 = new File(file, "acache");
                if (file2.exists()) {
                    try {
                        Utilities.clearDir(file2.getAbsolutePath(), 0, i - 86400, false);
                    } catch (Throwable th3) {
                        FileLog.e(th3);
                    }
                }
                MessagesController.getGlobalMainSettings().edit().putInt("lastKeepMediaCheckTime", SharedConfig.lastKeepMediaCheckTime).apply();
                if (BuildVars.LOGS_ENABLED) {
                    return;
                }
                FileLog.d("checkKeepMedia task end time " + (System.currentTimeMillis() - j8) + " auto deleted info: files " + i11 + " size " + AndroidUtilities.formatFileSize(j7) + "   deleted by size limit info: files " + i5 + " size " + AndroidUtilities.formatFileSize(j) + " unknownTimeFiles " + i4);
                return;
            }
        }
        j = 0;
        i4 = 0;
        i5 = 0;
        file2 = new File(file, "acache");
        if (file2.exists()) {
        }
        MessagesController.getGlobalMainSettings().edit().putInt("lastKeepMediaCheckTime", SharedConfig.lastKeepMediaCheckTime).apply();
        if (BuildVars.LOGS_ENABLED) {
        }
    }

    public static /* synthetic */ int $r8$lambda$8dg4GbivFh1IfgXiPENigECyG2w(FileInfoInternal fileInfoInternal, FileInfoInternal fileInfoInternal2) {
        long j = fileInfoInternal2.lastUsageDate;
        long j2 = fileInfoInternal.lastUsageDate;
        if (j > j2) {
            return -1;
        }
        return j < j2 ? 1 : 0;
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
    static class FileInfoInternal extends CacheByChatsController.KeepMediaFile {
        final long lastUsageDate;

        private FileInfoInternal(File file) {
            super(file);
            this.lastUsageDate = Utilities.getLastUsageFileTime(file.getAbsolutePath());
        }
    }

    public static void lockFile(File file) {
        if (file == null) {
            return;
        }
        lockFile(file.getAbsolutePath());
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
