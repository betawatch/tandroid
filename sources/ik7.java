// default package

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ik7 {
    public static volatile boolean a = false;
    public static final StringBuilder b = new StringBuilder();
    public static final int[] c = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static String a() {
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
                        if (e21.a) {
                            fc4.d("Unsupported arch: ".concat(str3));
                        }
                    }
                }
                str = "armeabi";
            }
            str2 = str;
        } catch (Exception e) {
            fc4.g(e, true);
        }
        String property = System.getProperty("os.arch");
        return (property == null || !property.contains("686")) ? str2 : "x86";
    }

    public static void b(int i, yw7 yw7Var) {
        yw7Var.K(7);
        byte[] bArr = yw7Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & nm7.d4);
        bArr[5] = (byte) ((i >> 8) & nm7.d4);
        bArr[6] = (byte) (i & nm7.d4);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:11:0x0010, B:13:0x001b, B:27:0x0023, B:36:0x0054, B:38:0x0058, B:39:0x005d, B:29:0x0079, B:31:0x007d, B:32:0x0090, B:43:0x0069), top: B:10:0x0010, outer: #2, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void c(Context context) {
        StringBuilder sb = b;
        synchronized (ik7.class) {
            if (a) {
                return;
            }
            try {
                try {
                    System.loadLibrary("tmessages.49");
                    a = true;
                    if (e21.a) {
                        fc4.b("loaded normal lib");
                    }
                } catch (Error e) {
                    fc4.g(e, true);
                    StringBuilder sb2 = b;
                    sb2.append("128: ");
                    sb2.append(e);
                    sb2.append("\n");
                    String a2 = a();
                    File file = new File(context.getFilesDir(), "lib");
                    file.mkdirs();
                    File file2 = new File(file, "libtmessages.49loc.so");
                    if (file2.exists()) {
                        try {
                            if (e21.a) {
                                fc4.b("Load local lib");
                            }
                            System.load(file2.getAbsolutePath());
                            a = true;
                            return;
                        } catch (Error e2) {
                            StringBuilder sb3 = b;
                            sb3.append(e2);
                            sb3.append("\n");
                            fc4.g(e2, true);
                            file2.delete();
                            if (e21.a) {
                                fc4.d("Library not found, arch = ".concat(a2));
                                sb.append("Library not found, arch = ".concat(a2));
                                sb.append("\n");
                            }
                            if (d(context, file, file2, a2)) {
                                return;
                            }
                            System.loadLibrary("tmessages.49");
                            a = true;
                        }
                    }
                    if (e21.a) {
                    }
                    if (d(context, file, file2, a2)) {
                    }
                    try {
                        System.loadLibrary("tmessages.49");
                        a = true;
                    } catch (Error e3) {
                        fc4.g(e3, true);
                        StringBuilder sb4 = b;
                        sb4.append("184: ");
                        sb4.append(e3);
                        sb4.append("\n");
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                StringBuilder sb5 = b;
                sb5.append("176: ");
                sb5.append(th);
                sb5.append("\n");
                System.loadLibrary("tmessages.49");
                a = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(Context context, File file, File file2, String str) {
        ?? r3;
        ZipFile zipFile;
        try {
            for (File file3 : file.listFiles()) {
                file3.delete();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        InputStream inputStream = null;
        try {
            try {
                zipFile = new ZipFile(context.getApplicationInfo().sourceDir);
                try {
                    ZipEntry entry = zipFile.getEntry("lib/" + str + "/libtmessages.49.so");
                    if (entry == null) {
                        throw new Exception("Unable to find file in apk:lib/" + str + "/tmessages.49");
                    }
                    InputStream inputStream2 = zipFile.getInputStream(entry);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[TLObject.FLAG_12];
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
                        a = true;
                    } catch (Error e2) {
                        fc4.g(e2, true);
                    }
                    try {
                        inputStream2.close();
                    } catch (Exception e3) {
                        fc4.g(e3, true);
                    }
                    try {
                        zipFile.close();
                    } catch (Exception e4) {
                        fc4.g(e4, true);
                    }
                    return true;
                } catch (Exception e5) {
                    e = e5;
                    fc4.g(e, true);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Exception e6) {
                            fc4.g(e6, true);
                        }
                    }
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (Exception e7) {
                            fc4.g(e7, true);
                        }
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Exception e8) {
                        fc4.g(e8, true);
                    }
                }
                if (r3 != 0) {
                    throw th;
                }
                try {
                    r3.close();
                    throw th;
                } catch (Exception e9) {
                    fc4.g(e9, true);
                    throw th;
                }
            }
        } catch (Exception e10) {
            e = e10;
            zipFile = null;
        } catch (Throwable th2) {
            th = th2;
            r3 = 0;
            if (0 != 0) {
            }
            if (r3 != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r9 == 11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        if (r9 != 11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008a, code lost:
    
        if (r9 != 8) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i4 e(ye1 ye1Var) {
        int i;
        int i2;
        int f = ye1Var.f(16);
        int f2 = ye1Var.f(16);
        if (f2 == 65535) {
            f2 = ye1Var.f(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = f2 + i;
        if (f == 44097) {
            i3 += 2;
        }
        if (ye1Var.f(2) == 3) {
            do {
                ye1Var.f(2);
            } while (ye1Var.e());
        }
        int f3 = ye1Var.f(10);
        if (ye1Var.e() && ye1Var.f(3) > 0) {
            ye1Var.n(2);
        }
        int i4 = ye1Var.e() ? 48000 : 44100;
        int f4 = ye1Var.f(4);
        int[] iArr = c;
        if (i4 == 44100 && f4 == 13) {
            i2 = iArr[f4];
        } else if (i4 != 48000 || f4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[f4];
            int i6 = f3 % 5;
            if (i6 != 1) {
                if (i6 == 2) {
                    if (f4 != 8) {
                    }
                    i2 = i5 + 1;
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        if (f4 != 3) {
                            if (f4 != 8) {
                            }
                        }
                        i2 = i5 + 1;
                    }
                    i2 = i5;
                }
            }
            if (f4 != 3) {
            }
            i2 = i5 + 1;
        }
        return new i4(i4, i3, i2);
    }

    public static void f(ye1 ye1Var, h4 h4Var) {
        int f = ye1Var.f(5);
        ye1Var.n(2);
        if (ye1Var.e()) {
            ye1Var.n(5);
        }
        if (f >= 7 && f <= 10) {
            ye1Var.m();
        }
        if (ye1Var.e()) {
            int f2 = ye1Var.f(3);
            if (h4Var.b == -1 && f >= 0 && f <= 15 && (f2 == 0 || f2 == 1)) {
                h4Var.b = f;
            }
            if (ye1Var.e()) {
                h(ye1Var);
            }
        }
    }

    public static void g(ye1 ye1Var, h4 h4Var) {
        ye1Var.n(2);
        boolean e = ye1Var.e();
        int f = ye1Var.f(8);
        for (int i = 0; i < f; i++) {
            ye1Var.n(2);
            if (ye1Var.e()) {
                ye1Var.n(5);
            }
            if (e) {
                ye1Var.n(24);
            } else {
                if (ye1Var.e()) {
                    if (!ye1Var.e()) {
                        ye1Var.n(4);
                    }
                    h4Var.c = ye1Var.f(6) + 1;
                }
                ye1Var.n(4);
            }
        }
        if (ye1Var.e()) {
            ye1Var.n(3);
            if (ye1Var.e()) {
                h(ye1Var);
            }
        }
    }

    public static void h(ye1 ye1Var) {
        int f = ye1Var.f(6);
        if (f < 2 || f > 42) {
            throw bx7.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(f)));
        }
        ye1Var.n(f << 3);
    }
}
