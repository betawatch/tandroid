package com.google.firebase.crashlytics.internal.persistence;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class FileStore {
    private final File crashlyticsDir;
    private final File filesDir;
    private final File nativeReportsDir;
    private final File priorityReportsDir;
    private final File reportsDir;
    private final File sessionsDir;

    public FileStore(Context context) {
        String str;
        String processName;
        File filesDir = context.getFilesDir();
        this.filesDir = filesDir;
        if (useV2FileSystem()) {
            StringBuilder sb = new StringBuilder();
            sb.append(".com.google.firebase.crashlytics.files.v2");
            sb.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb.append(sanitizeName(processName));
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File prepareBaseDir = prepareBaseDir(new File(filesDir, str));
        this.crashlyticsDir = prepareBaseDir;
        this.sessionsDir = prepareBaseDir(new File(prepareBaseDir, "open-sessions"));
        this.reportsDir = prepareBaseDir(new File(prepareBaseDir, "reports"));
        this.priorityReportsDir = prepareBaseDir(new File(prepareBaseDir, "priority-reports"));
        this.nativeReportsDir = prepareBaseDir(new File(prepareBaseDir, "native-reports"));
    }

    public void cleanupPreviousFileSystems() {
        cleanupDir(new File(this.filesDir, ".com.google.firebase.crashlytics"));
        cleanupDir(new File(this.filesDir, ".com.google.firebase.crashlytics-ndk"));
        if (useV2FileSystem()) {
            cleanupDir(new File(this.filesDir, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    private void cleanupDir(File file) {
        if (file.exists() && recursiveDelete(file)) {
            Logger.getLogger().d("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    static boolean recursiveDelete(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                recursiveDelete(file2);
            }
        }
        return file.delete();
    }

    public File getCommonFile(String str) {
        return new File(this.crashlyticsDir, str);
    }

    public List getCommonFiles(FilenameFilter filenameFilter) {
        return safeArrayToList(this.crashlyticsDir.listFiles(filenameFilter));
    }

    private File getSessionDir(String str) {
        return prepareDir(new File(this.sessionsDir, str));
    }

    public File getSessionFile(String str, String str2) {
        return new File(getSessionDir(str), str2);
    }

    public List getSessionFiles(String str, FilenameFilter filenameFilter) {
        return safeArrayToList(getSessionDir(str).listFiles(filenameFilter));
    }

    public File getNativeSessionDir(String str) {
        return prepareDir(new File(getSessionDir(str), "native"));
    }

    public boolean deleteSessionFiles(String str) {
        return recursiveDelete(new File(this.sessionsDir, str));
    }

    public List getAllOpenSessionIds() {
        return safeArrayToList(this.sessionsDir.list());
    }

    public File getReport(String str) {
        return new File(this.reportsDir, str);
    }

    public List getReports() {
        return safeArrayToList(this.reportsDir.listFiles());
    }

    public File getPriorityReport(String str) {
        return new File(this.priorityReportsDir, str);
    }

    public List getPriorityReports() {
        return safeArrayToList(this.priorityReportsDir.listFiles());
    }

    public File getNativeReport(String str) {
        return new File(this.nativeReportsDir, str);
    }

    public List getNativeReports() {
        return safeArrayToList(this.nativeReportsDir.listFiles());
    }

    private static File prepareDir(File file) {
        file.mkdirs();
        return file;
    }

    private static synchronized File prepareBaseDir(File file) {
        synchronized (FileStore.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    Logger.getLogger().d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Logger.getLogger().e("Could not create Crashlytics-specific directory: " + file);
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static List safeArrayToList(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    private static boolean useV2FileSystem() {
        return Build.VERSION.SDK_INT >= 28;
    }

    static String sanitizeName(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }
}
