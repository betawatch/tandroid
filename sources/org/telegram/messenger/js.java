package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.LongSparseArray;
import com.google.android.gms.tasks.TaskExecutors;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class js {
    public static volatile boolean a = false;
    public static final StringBuilder b = new StringBuilder();
    public static final byte[] c = {-1, -40, -1, -32, 0, 16, 74, 70, 73, 70, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, -1, -37, 0, 67, 0, 40, 28, 30, 35, 30, 25, 40, 35, 33, 35, 45, 43, 40, 48, 60, 100, 65, 60, 55, 55, 60, 123, 88, 93, 73, 100, -111, Byte.MIN_VALUE, -103, -106, -113, Byte.MIN_VALUE, -116, -118, -96, -76, -26, -61, -96, -86, -38, -83, -118, -116, -56, -1, -53, -38, -18, -11, -1, -1, -1, -101, -63, -1, -1, -1, -6, -1, -26, -3, -1, -8, -1, -37, 0, 67, 1, 43, 45, 45, 60, 53, 60, 118, 65, 65, 118, -8, -91, -116, -91, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -1, -64, 0, 17, 8, 0, 30, 0, 40, 3, 1, 34, 0, 2, 17, 1, 3, 17, 1, -1, -60, 0, 31, 0, 0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 16, 0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 125, 1, 2, 3, 0, 4, 17, 5, 18, 33, 49, 65, 6, 19, 81, 97, 7, 34, 113, 20, 50, -127, -111, -95, 8, 35, 66, -79, -63, 21, 82, -47, -16, 36, 51, 98, 114, -126, 9, 10, 22, 23, 24, 25, 26, 37, 38, 39, 40, 41, 42, 52, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -60, 0, 31, 1, 0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 17, 0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 119, 0, 1, 2, 3, 17, 4, 5, 33, 49, 6, 18, 65, 81, 7, 97, 113, 19, 34, 50, -127, 8, 20, 66, -111, -95, -79, -63, 9, 35, 51, 82, -16, 21, 98, 114, -47, 10, 22, 36, 52, -31, 37, -15, 23, 24, 25, 26, 38, 39, 40, 41, 42, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -126, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -38, 0, 12, 3, 1, 0, 2, 17, 3, 17, 0, 63, 0};
    public static final byte[] d = {-1, -39};
    public static HashMap e;
    public static dw f;
    public static dw g;
    public static dw h;
    public static SharedPreferences i;

    public static void a(int i10) {
        SharedPreferences sharedPreferences = i;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : i.getAll().keySet()) {
                if (str.startsWith("confirm_shown_" + i10 + "_")) {
                    edit.remove(str);
                }
            }
            edit.apply();
        }
    }

    public static Bitmap b(int i10, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        return createBitmap;
    }

    public static void c(String str, qc qcVar, pc pcVar) {
        d(str, qcVar, pcVar, false);
    }

    public static void d(String str, qc qcVar, pc pcVar, boolean z10) {
        if (z10) {
            try {
                Context context = w0.b;
                synchronized (jb.g.b) {
                    jb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e7) {
                if (!z10) {
                    d(str, qcVar, pcVar, true);
                    return;
                } else {
                    pcVar.q(e7);
                    f8.g(e7, false);
                    return;
                }
            } catch (Exception e10) {
                pcVar.q(e10);
                f8.g(e10, true);
                return;
            } catch (Throwable th2) {
                pcVar.q(null);
                f8.g(th2, false);
                return;
            }
        }
        w7.m.a().g(str).addOnSuccessListener(new s1(qcVar, 8)).addOnFailureListener(new s1(pcVar, 9));
    }

    public static String e() {
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
                        if (v2.a) {
                            f8.d("Unsupported arch: ".concat(str3));
                        }
                    }
                }
                str = "armeabi";
            }
            str2 = str;
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        String property = System.getProperty("os.arch");
        return (property == null || !property.contains("686")) ? str2 : "x86";
    }

    public static dw f(int i10) {
        if (i10 == 1) {
            return f;
        }
        if (i10 == 2) {
            return g;
        }
        if (i10 == 4) {
            return h;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[Catch: all -> 0x001f, TryCatch #4 {all -> 0x001f, blocks: (B:11:0x000e, B:13:0x0019, B:18:0x0026, B:35:0x0057, B:37:0x005b, B:38:0x0063, B:20:0x007e, B:22:0x0082, B:23:0x0097, B:43:0x006e), top: B:10:0x000e, outer: #2, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void g(Context context) {
        synchronized (js.class) {
            if (a) {
                return;
            }
            try {
                try {
                    System.loadLibrary("tmessages.49");
                    a = true;
                    if (v2.a) {
                        f8.b("loaded normal lib");
                    }
                } catch (Error e7) {
                    f8.g(e7, true);
                    StringBuilder sb2 = b;
                    sb2.append("128: ");
                    sb2.append(e7);
                    sb2.append("\n");
                    String e10 = e();
                    File file = new File(context.getFilesDir(), "lib");
                    file.mkdirs();
                    File file2 = new File(file, "libtmessages.49loc.so");
                    if (file2.exists()) {
                        try {
                            if (v2.a) {
                                f8.b("Load local lib");
                            }
                            System.load(file2.getAbsolutePath());
                            a = true;
                            return;
                        } catch (Error e11) {
                            StringBuilder sb3 = b;
                            sb3.append(e11);
                            sb3.append("\n");
                            f8.g(e11, true);
                            file2.delete();
                            if (v2.a) {
                                f8.d("Library not found, arch = ".concat(e10));
                                StringBuilder sb4 = b;
                                sb4.append("Library not found, arch = ".concat(e10));
                                sb4.append("\n");
                            }
                            if (k(context, file, file2, e10)) {
                                return;
                            }
                            System.loadLibrary("tmessages.49");
                            a = true;
                        }
                    }
                    if (v2.a) {
                    }
                    if (k(context, file, file2, e10)) {
                    }
                    try {
                        System.loadLibrary("tmessages.49");
                        a = true;
                    } catch (Error e12) {
                        f8.g(e12, true);
                        StringBuilder sb5 = b;
                        sb5.append("184: ");
                        sb5.append(e12);
                        sb5.append("\n");
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                StringBuilder sb6 = b;
                sb6.append("176: ");
                sb6.append(th2);
                sb6.append("\n");
                System.loadLibrary("tmessages.49");
                a = true;
            }
        }
    }

    public static boolean h(int i10, long j10) {
        return i.getBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i10), Long.valueOf(j10)), false);
    }

    public static void i(SharedPreferences sharedPreferences) {
        int i10 = (sharedPreferences.getBoolean("save_gallery", false) && v2.b) ? 7 : sharedPreferences.getInt("save_gallery_flags", -1);
        if (i10 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            dw dwVar = new dw();
            f = dwVar;
            boolean z10 = (i10 & 1) != 0;
            dwVar.b = z10;
            dwVar.a = z10;
            dwVar.c = 104857600L;
            dw.c(dwVar, "user", sharedPreferences);
            dw dwVar2 = new dw();
            g = dwVar2;
            dw dwVar3 = f;
            boolean z11 = (i10 & 2) != 0;
            dwVar3.b = z11;
            dwVar2.a = z11;
            dwVar2.c = 104857600L;
            dw.c(dwVar2, "groups", sharedPreferences);
            dw dwVar4 = new dw();
            h = dwVar4;
            boolean z12 = (i10 & 4) != 0;
            dwVar4.b = z12;
            dwVar4.a = z12;
            dwVar4.c = 104857600L;
            dw.c(dwVar4, "channels", sharedPreferences);
        } else {
            f = dw.d("user", sharedPreferences);
            g = dw.d("groups", sharedPreferences);
            h = dw.d("channels", sharedPreferences);
        }
        f.d = 1;
        g.d = 2;
        h.d = 4;
    }

    public static LongSparseArray j(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i10 = sharedPreferences.getInt("count", 0);
        for (int i11 = 0; i11 < i10; i11++) {
            bw bwVar = new bw();
            bwVar.d = sharedPreferences.getLong(i11 + "_dialog_id", 0L);
            bwVar.a = sharedPreferences.getBoolean(i11 + "_photo", false);
            bwVar.b = sharedPreferences.getBoolean(i11 + "_video", false);
            bwVar.c = sharedPreferences.getLong(i11 + "_limitVideo", 104857600L);
            long j10 = bwVar.d;
            if (j10 != 0) {
                longSparseArray.put(j10, bwVar);
            }
        }
        return longSparseArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(Context context, File file, File file2, String str) {
        ZipFile zipFile;
        ZipFile zipFile2;
        int length;
        try {
            File[] listFiles = file.listFiles();
            length = listFiles.length;
            for (File file3 : listFiles) {
                file3.delete();
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        InputStream inputStream = null;
        try {
            try {
                zipFile2 = new ZipFile(context.getApplicationInfo().sourceDir);
                try {
                    ZipEntry entry = zipFile2.getEntry("lib/" + str + "/libtmessages.49.so");
                    if (entry == null) {
                        throw new Exception("Unable to find file in apk:lib/" + str + "/tmessages.49");
                    }
                    InputStream inputStream2 = zipFile2.getInputStream(entry);
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
                    } catch (Error e10) {
                        f8.g(e10, true);
                    }
                    try {
                        inputStream2.close();
                    } catch (Exception e11) {
                        f8.g(e11, true);
                    }
                    try {
                        zipFile2.close();
                    } catch (Exception e12) {
                        f8.g(e12, true);
                    }
                    return true;
                } catch (Exception e13) {
                    e = e13;
                    f8.g(e, true);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Exception e14) {
                            f8.g(e14, true);
                        }
                    }
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (Exception e15) {
                            f8.g(e15, true);
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
                    } catch (Exception e16) {
                        f8.g(e16, true);
                    }
                }
                if (zipFile != null) {
                    throw th;
                }
                try {
                    zipFile.close();
                    throw th;
                } catch (Exception e17) {
                    f8.g(e17, true);
                    throw th;
                }
            }
        } catch (Exception e18) {
            e = e18;
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

    public static boolean l(int i10, j8 j8Var, jj jjVar, int i11) {
        dw dwVar;
        if (i10 == 1) {
            dwVar = f;
        } else {
            if (i10 != 4) {
                if (i10 == 2) {
                    dwVar = g;
                }
                return false;
            }
            dwVar = h;
        }
        dwVar.getClass();
        bw bwVar = (bw) d20.i(i11).m(dwVar.d).get(j8Var.a);
        if (jjVar == null || (!jjVar.P3() && !jjVar.l4())) {
            boolean z10 = (jjVar != null && jj.L4(jjVar.k)) || j8Var.c == 3;
            long T1 = jjVar != null ? jjVar.T1() : j8Var.d;
            boolean z11 = dwVar.b;
            boolean z12 = dwVar.a;
            long j10 = dwVar.c;
            if (bwVar != null) {
                z11 = bwVar.b;
                z12 = bwVar.a;
                j10 = bwVar.c;
            }
            if (!z10 ? z12 : !(!z11 || (j10 != -1 && T1 >= j10))) {
                return true;
            }
        }
        return false;
    }

    public static void m(SharedPreferences sharedPreferences, LongSparseArray longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            bw bwVar = (bw) longSparseArray.valueAt(i10);
            edit.putLong(a1.g.k(i10, "_dialog_id"), bwVar.d);
            edit.putBoolean(i10 + "_photo", bwVar.a);
            edit.putBoolean(i10 + "_video", bwVar.b);
            edit.putLong(i10 + "_limitVideo", bwVar.c);
        }
        edit.apply();
    }

    public static void n(int i10) {
        SharedPreferences sharedPreferences = w0.b.getSharedPreferences("mainconfig", 0);
        if (i10 == 1) {
            dw.c(f, "user", sharedPreferences);
        } else if (i10 == 2) {
            dw.c(g, "groups", sharedPreferences);
        } else if (i10 == 4) {
            dw.c(h, "channels", sharedPreferences);
        }
    }

    public static void o(int i10, long j10) {
        i.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i10), Long.valueOf(j10)), true).apply();
    }
}
