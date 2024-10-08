package org.telegram.messenger;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class NativeLoader {
    private static final String LIB_NAME = "tmessages.49";
    private static final String LIB_SO_NAME = "libtmessages.49.so";
    private static final int LIB_VERSION = 49;
    private static final String LOCALE_LIB_SO_NAME = "libtmessages.49loc.so";
    public static StringBuilder log = new StringBuilder();
    private static volatile boolean nativeLoaded = false;

    public static String getAbiFolder() {
        String str;
        String str2 = "mips";
        String str3 = "armeabi";
        try {
            str = Build.CPU_ABI;
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (str.equalsIgnoreCase("x86_64")) {
            str2 = "x86_64";
        } else if (str.equalsIgnoreCase("arm64-v8a")) {
            str2 = "arm64-v8a";
        } else if (str.equalsIgnoreCase("armeabi-v7a")) {
            str2 = "armeabi-v7a";
        } else if (str.equalsIgnoreCase("armeabi")) {
            str2 = "armeabi";
        } else if (str.equalsIgnoreCase("x86")) {
            str2 = "x86";
        } else if (!str.equalsIgnoreCase("mips")) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Unsupported arch: " + str);
            }
            String property = System.getProperty("os.arch");
            return (property == null && property.contains("686")) ? "x86" : str3;
        }
        str3 = str2;
        String property2 = System.getProperty("os.arch");
        if (property2 == null) {
        }
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
            } catch (Throwable th) {
                th.printStackTrace();
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

    private static native void init(String str, boolean z);

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[Catch: all -> 0x001b, TryCatch #3 {all -> 0x001b, blocks: (B:11:0x000a, B:13:0x0015, B:18:0x0022, B:36:0x0053, B:38:0x0057, B:39:0x005f, B:20:0x007a, B:22:0x007e, B:23:0x00ad, B:44:0x006a), top: B:10:0x000a, outer: #4, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[RETURN] */
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
                } catch (Error e) {
                    FileLog.e(e);
                    StringBuilder sb = log;
                    sb.append("128: ");
                    sb.append(e);
                    sb.append("\n");
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
                        } catch (Error e2) {
                            StringBuilder sb2 = log;
                            sb2.append(e2);
                            sb2.append("\n");
                            FileLog.e(e2);
                            file2.delete();
                            if (BuildVars.LOGS_ENABLED) {
                            }
                            if (loadFromZip(context, file, file2, abiFolder)) {
                            }
                            System.loadLibrary(LIB_NAME);
                            nativeLoaded = true;
                        }
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("Library not found, arch = " + abiFolder);
                        StringBuilder sb3 = log;
                        sb3.append("Library not found, arch = " + abiFolder);
                        sb3.append("\n");
                    }
                    if (loadFromZip(context, file, file2, abiFolder)) {
                        return;
                    }
                    try {
                        System.loadLibrary(LIB_NAME);
                        nativeLoaded = true;
                    } catch (Error e3) {
                        FileLog.e(e3);
                        StringBuilder sb4 = log;
                        sb4.append("184: ");
                        sb4.append(e3);
                        sb4.append("\n");
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                StringBuilder sb5 = log;
                sb5.append("176: ");
                sb5.append(th);
                sb5.append("\n");
                System.loadLibrary(LIB_NAME);
                nativeLoaded = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean loadFromZip(Context context, File file, File file2, String str) {
        InputStream inputStream;
        ?? r2;
        ?? r22;
        try {
            for (File file3 : file.listFiles()) {
                file3.delete();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        InputStream inputStream2 = null;
        try {
            ZipFile zipFile = new ZipFile(context.getApplicationInfo().sourceDir);
            try {
                ZipEntry entry = zipFile.getEntry("lib/" + str + "/" + LIB_SO_NAME);
                if (entry == null) {
                    throw new Exception("Unable to find file in apk:lib/" + str + "/" + LIB_NAME);
                }
                InputStream inputStream3 = zipFile.getInputStream(entry);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM];
                while (true) {
                    int read = inputStream3.read(bArr);
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
                } catch (Error e2) {
                    FileLog.e(e2);
                }
                try {
                    inputStream3.close();
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                try {
                    zipFile.close();
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
                return true;
            } catch (Exception e5) {
                e = e5;
                r2 = zipFile;
                try {
                    FileLog.e(e);
                    if (0 != 0) {
                        try {
                            inputStream2.close();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    }
                    if (r2 != 0) {
                        try {
                            r2.close();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    inputStream = null;
                    inputStream2 = r2;
                    r22 = inputStream2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception e8) {
                            FileLog.e(e8);
                        }
                    }
                    if (r22 == 0) {
                        throw th;
                    }
                    try {
                        r22.close();
                        throw th;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r22 = zipFile;
                if (inputStream2 != null) {
                }
                if (r22 == 0) {
                }
            }
        } catch (Exception e10) {
            e = e10;
            r2 = 0;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            r22 = inputStream2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
            }
            if (r22 == 0) {
            }
        }
    }

    public static boolean loaded() {
        return nativeLoaded;
    }
}
