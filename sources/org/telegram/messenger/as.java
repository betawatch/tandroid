package org.telegram.messenger;

import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Process;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class as {
    public static volatile boolean a = false;
    public static final StringBuilder b = new StringBuilder();
    public static final byte[] c = {-1, -40, -1, -32, 0, 16, 74, 70, 73, 70, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, -1, -37, 0, 67, 0, 40, 28, 30, 35, 30, 25, 40, 35, 33, 35, 45, 43, 40, 48, 60, 100, 65, 60, 55, 55, 60, 123, 88, 93, 73, 100, -111, Byte.MIN_VALUE, -103, -106, -113, Byte.MIN_VALUE, -116, -118, -96, -76, -26, -61, -96, -86, -38, -83, -118, -116, -56, -1, -53, -38, -18, -11, -1, -1, -1, -101, -63, -1, -1, -1, -6, -1, -26, -3, -1, -8, -1, -37, 0, 67, 1, 43, 45, 45, 60, 53, 60, 118, 65, 65, 118, -8, -91, -116, -91, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -8, -1, -64, 0, 17, 8, 0, 30, 0, 40, 3, 1, 34, 0, 2, 17, 1, 3, 17, 1, -1, -60, 0, 31, 0, 0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 16, 0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 125, 1, 2, 3, 0, 4, 17, 5, 18, 33, 49, 65, 6, 19, 81, 97, 7, 34, 113, 20, 50, -127, -111, -95, 8, 35, 66, -79, -63, 21, 82, -47, -16, 36, 51, 98, 114, -126, 9, 10, 22, 23, 24, 25, 26, 37, 38, 39, 40, 41, 42, 52, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -60, 0, 31, 1, 0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 17, 0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 119, 0, 1, 2, 3, 17, 4, 5, 33, 49, 6, 18, 65, 81, 7, 97, 113, 19, 34, 50, -127, 8, 20, 66, -111, -95, -79, -63, 9, 35, 51, 82, -16, 21, 98, 114, -47, 10, 22, 36, 52, -31, 37, -15, 23, 24, 25, 26, 38, 39, 40, 41, 42, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -126, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -38, 0, 12, 3, 1, 0, 2, 17, 3, 17, 0, 63, 0};
    public static final byte[] d = {-1, -39};
    public static KeyStore e;
    public static KeyPairGenerator f;
    public static Boolean g;
    public static Boolean h;
    public static int i;
    public static SharedPreferences j;

    public static boolean a() {
        Boolean bool = g;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding").init(2, e.getKey("tmessages_passcode", null));
            g = Boolean.FALSE;
            return false;
        } catch (KeyPermanentlyInvalidatedException unused) {
            g = Boolean.TRUE;
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            g = Boolean.FALSE;
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(boolean z9) {
        boolean z10;
        boolean z11;
        FingerprintManager fingerprintManager;
        FingerprintManager fingerprintManager2;
        if (h()) {
            return;
        }
        Typeface typeface = g0.a;
        if (!((KeyguardManager) t0.b.getSystemService("keyguard")).isKeyguardSecure()) {
            return;
        }
        int i7 = 0;
        try {
            fingerprintManager2 = (FingerprintManager) t0.b.getSystemService("fingerprint");
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (fingerprintManager2 != null) {
            z10 = fingerprintManager2.isHardwareDetected();
            if (z10) {
                return;
            }
            try {
                fingerprintManager = (FingerprintManager) t0.b.getSystemService("fingerprint");
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            if (fingerprintManager != null) {
                z11 = fingerprintManager.hasEnrolledFingerprints();
                if (z11) {
                    return;
                }
                Utilities.e.c(new d9(i7, z9));
                return;
            }
            z11 = false;
            if (z11) {
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    public static Bitmap c(int i7, int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        return createBitmap;
    }

    public static String d() {
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
                        if (r2.a) {
                            a8.d("Unsupported arch: ".concat(str3));
                        }
                    }
                }
                str = "armeabi";
            }
            str2 = str;
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        String property = System.getProperty("os.arch");
        return (property == null || !property.contains("686")) ? str2 : "x86";
    }

    public static KeyStore e() {
        KeyStore keyStore = e;
        if (keyStore != null) {
            return keyStore;
        }
        try {
            KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
            e = keyStore2;
            keyStore2.load(null);
            return e;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[Catch: all -> 0x001f, TryCatch #4 {all -> 0x001f, blocks: (B:11:0x000e, B:13:0x0019, B:18:0x0026, B:35:0x0057, B:37:0x005b, B:38:0x0063, B:20:0x007e, B:22:0x0082, B:23:0x0097, B:43:0x006e), top: B:10:0x000e, outer: #2, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void f(Context context) {
        synchronized (as.class) {
            if (a) {
                return;
            }
            try {
                try {
                    System.loadLibrary("tmessages.49");
                    a = true;
                    if (r2.a) {
                        a8.b("loaded normal lib");
                    }
                } catch (Error e10) {
                    a8.g(e10, true);
                    StringBuilder sb2 = b;
                    sb2.append("128: ");
                    sb2.append(e10);
                    sb2.append("\n");
                    String d2 = d();
                    File file = new File(context.getFilesDir(), "lib");
                    file.mkdirs();
                    File file2 = new File(file, "libtmessages.49loc.so");
                    if (file2.exists()) {
                        try {
                            if (r2.a) {
                                a8.b("Load local lib");
                            }
                            System.load(file2.getAbsolutePath());
                            a = true;
                            return;
                        } catch (Error e11) {
                            StringBuilder sb3 = b;
                            sb3.append(e11);
                            sb3.append("\n");
                            a8.g(e11, true);
                            file2.delete();
                            if (r2.a) {
                                a8.d("Library not found, arch = ".concat(d2));
                                StringBuilder sb4 = b;
                                sb4.append("Library not found, arch = ".concat(d2));
                                sb4.append("\n");
                            }
                            if (k(context, file, file2, d2)) {
                                return;
                            }
                            System.loadLibrary("tmessages.49");
                            a = true;
                        }
                    }
                    if (r2.a) {
                    }
                    if (k(context, file, file2, d2)) {
                    }
                    try {
                        System.loadLibrary("tmessages.49");
                        a = true;
                    } catch (Error e12) {
                        a8.g(e12, true);
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

    public static boolean g() {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) t0.b.getSystemService("appops");
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke(appOpsManager, 10020, Integer.valueOf(Process.myUid()), t0.b.getPackageName())).intValue() == 0;
        } catch (Exception e10) {
            a8.g(e10, true);
            return true;
        }
    }

    public static boolean h() {
        try {
            return e().containsAlias("tmessages_passcode");
        } catch (KeyStoreException e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static boolean i() {
        return !TextUtils.isEmpty(g0.k1("ro.miui.ui.version.name"));
    }

    public static boolean j() {
        int intValue;
        Boolean bool = h;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Field declaredField = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT");
            declaredField.setAccessible(true);
            intValue = ((Integer) declaredField.get(null)).intValue();
        } catch (Exception unused) {
            h = Boolean.FALSE;
        }
        if (intValue < 100000) {
            return false;
        }
        i = intValue - 90000;
        h = Boolean.TRUE;
        return h.booleanValue();
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
        } catch (Exception e10) {
            a8.g(e10, true);
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
                    } catch (Error e11) {
                        a8.g(e11, true);
                    }
                    try {
                        inputStream2.close();
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                    try {
                        zipFile2.close();
                    } catch (Exception e13) {
                        a8.g(e13, true);
                    }
                    return true;
                } catch (Exception e14) {
                    e = e14;
                    a8.g(e, true);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Exception e15) {
                            a8.g(e15, true);
                        }
                    }
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (Exception e16) {
                            a8.g(e16, true);
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
                        a8.g(e17, true);
                    }
                }
                if (zipFile != null) {
                    throw th;
                }
                try {
                    zipFile.close();
                    throw th;
                } catch (Exception e18) {
                    a8.g(e18, true);
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
}
