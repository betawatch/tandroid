package org.telegram.messenger;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class NativeLoader {
    private static final String LIB_NAME = "tmessages.49";
    private static final String LIB_SO_NAME = "libtmessages.49.so";
    private static final int LIB_VERSION = 49;
    private static final String LOCALE_LIB_SO_NAME = "libtmessages.49loc.so";
    public static StringBuilder log = new StringBuilder();
    private static volatile boolean nativeLoaded = false;

    public static String getAbiFolder() {
        String str = "mips";
        String str2 = "armeabi";
        try {
            String str3 = Build.CPU_ABI;
            if (str3.equalsIgnoreCase("x86_64")) {
                str = "x86_64";
            } else if (str3.equalsIgnoreCase("arm64-v8a")) {
                str = "arm64-v8a";
            } else if (str3.equalsIgnoreCase("armeabi-v7a")) {
                str = "armeabi-v7a";
            } else {
                if (!str3.equalsIgnoreCase("armeabi")) {
                    if (str3.equalsIgnoreCase("x86")) {
                        str = "x86";
                    } else if (!str3.equalsIgnoreCase("mips")) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("Unsupported arch: " + str3);
                        }
                    }
                }
                str = "armeabi";
            }
            str2 = str;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        String property = System.getProperty("os.arch");
        return (property == null || !property.contains("686")) ? str2 : "x86";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static File getNativeLibraryDir(Context context) {
        File file;
        if (context != null) {
            try {
                file = new File((String) ApplicationInfo.class.getField("nativeLibraryDir").get(context.getApplicationInfo()));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            if (file == null) {
                file = new File(context.getApplicationInfo().dataDir, "lib");
            }
            if (file.isDirectory()) {
                return null;
            }
            return file;
        }
        file = null;
        if (file == null) {
        }
        if (file.isDirectory()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:11:0x000e, B:13:0x001a, B:27:0x0027, B:36:0x0058, B:38:0x005c, B:39:0x0064, B:29:0x007f, B:31:0x0083, B:32:0x00a8, B:44:0x006f), top: B:10:0x000e, outer: #2, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void initNativeLibs(Context context) {
        synchronized (NativeLoader.class) {
            if (nativeLoaded) {
                return;
            }
            try {
                try {
                    System.loadLibrary(LIB_NAME);
                    nativeLoaded = true;
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("loaded normal lib");
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    StringBuilder sb2 = log;
                    sb2.append("176: ");
                    sb2.append(th2);
                    sb2.append("\n");
                    try {
                        System.loadLibrary(LIB_NAME);
                        nativeLoaded = true;
                    } catch (Error e10) {
                        FileLog.e(e10);
                        StringBuilder sb3 = log;
                        sb3.append("184: ");
                        sb3.append(e10);
                        sb3.append("\n");
                    }
                }
            } catch (Error e11) {
                FileLog.e(e11);
                StringBuilder sb4 = log;
                sb4.append("128: ");
                sb4.append(e11);
                sb4.append("\n");
                String abiFolder = getAbiFolder();
                File file = new File(context.getFilesDir(), "lib");
                file.mkdirs();
                File file2 = new File(file, LOCALE_LIB_SO_NAME);
                if (file2.exists()) {
                    try {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("Load local lib");
                        }
                        System.load(file2.getAbsolutePath());
                        nativeLoaded = true;
                        return;
                    } catch (Error e12) {
                        StringBuilder sb5 = log;
                        sb5.append(e12);
                        sb5.append("\n");
                        FileLog.e(e12);
                        file2.delete();
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("Library not found, arch = " + abiFolder);
                            StringBuilder sb6 = log;
                            sb6.append("Library not found, arch = " + abiFolder);
                            sb6.append("\n");
                        }
                        if (loadFromZip(context, file, file2, abiFolder)) {
                            return;
                        }
                        System.loadLibrary(LIB_NAME);
                        nativeLoaded = true;
                    }
                }
                if (BuildVars.LOGS_ENABLED) {
                }
                if (loadFromZip(context, file, file2, abiFolder)) {
                }
                System.loadLibrary(LIB_NAME);
                nativeLoaded = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean loadFromZip(Context context, File file, File file2, String str) {
        ZipFile zipFile;
        ZipFile zipFile2;
        int length;
        try {
            File[] listFiles = file.listFiles();
            length = listFiles.length;
            for (File file3 : listFiles) {
                file3.delete();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        InputStream inputStream = null;
        try {
            try {
                zipFile2 = new ZipFile(context.getApplicationInfo().sourceDir);
                try {
                    ZipEntry entry = zipFile2.getEntry("lib/" + str + "/" + LIB_SO_NAME);
                    if (entry == null) {
                        throw new Exception("Unable to find file in apk:lib/" + str + "/" + LIB_NAME);
                    }
                    InputStream inputStream2 = zipFile2.getInputStream(entry);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        Thread.yield();
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                    file2.setReadable(true, false);
                    file2.setExecutable(true, false);
                    file2.setWritable(true);
                    try {
                        System.load(file2.getAbsolutePath());
                        nativeLoaded = true;
                    } catch (Error e11) {
                        FileLog.e(e11);
                    }
                    try {
                        inputStream2.close();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    try {
                        zipFile2.close();
                    } catch (Exception e13) {
                        FileLog.e(e13);
                    }
                    return true;
                } catch (Exception e14) {
                    e = e14;
                    FileLog.e(e);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Exception e15) {
                            FileLog.e(e15);
                        }
                    }
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (Exception e16) {
                            FileLog.e(e16);
                        }
                    }
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                zipFile = length;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Exception e17) {
                        FileLog.e(e17);
                    }
                }
                if (zipFile != null) {
                    throw th;
                }
                try {
                    zipFile.close();
                    throw th;
                } catch (Exception e18) {
                    FileLog.e(e18);
                    throw th;
                }
            }
        } catch (Exception e19) {
            e = e19;
            zipFile2 = null;
        } catch (Throwable th3) {
            th = th3;
            zipFile = null;
            if (0 != 0) {
            }
            if (zipFile != null) {
            }
        }
    }

    public static boolean loaded() {
        return nativeLoaded;
    }
}
