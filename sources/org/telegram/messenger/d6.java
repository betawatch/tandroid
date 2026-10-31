package org.telegram.messenger;

import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.ArrayList;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class d6 {
    public static double a;
    public static long b;
    public static final String[] c = {"bluestacks", "memuhyperv", "virtualbox"};
    public static KeyStore d;
    public static KeyPairGenerator e;
    public static Boolean f;
    public static Boolean g;
    public static int h;
    public static SharedPreferences i;

    public static boolean a() {
        Boolean bool = f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding").init(2, d.getKey("tmessages_passcode", null));
            f = Boolean.FALSE;
            return false;
        } catch (KeyPermanentlyInvalidatedException unused) {
            f = Boolean.TRUE;
            return true;
        } catch (Exception e7) {
            f8.g(e7, true);
            f = Boolean.FALSE;
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
    public static void b(boolean z10) {
        boolean z11;
        boolean z12;
        FingerprintManager fingerprintManager;
        FingerprintManager fingerprintManager2;
        if (h()) {
            return;
        }
        Typeface typeface = i0.a;
        if (!((KeyguardManager) w0.b.getSystemService("keyguard")).isKeyguardSecure()) {
            return;
        }
        int i10 = 0;
        try {
            fingerprintManager2 = (FingerprintManager) w0.b.getSystemService("fingerprint");
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        if (fingerprintManager2 != null) {
            z11 = fingerprintManager2.isHardwareDetected();
            if (z11) {
                return;
            }
            try {
                fingerprintManager = (FingerprintManager) w0.b.getSystemService("fingerprint");
            } catch (Exception e10) {
                f8.g(e10, true);
            }
            if (fingerprintManager != null) {
                z12 = fingerprintManager.hasEnrolledFingerprints();
                if (z12) {
                    return;
                }
                Utilities.e.c(new i9(i10, z10));
                return;
            }
            z12 = false;
            if (z12) {
            }
        }
        z11 = false;
        if (z11) {
        }
    }

    public static boolean c() {
        File file = new File("/proc/bus/input/devices");
        ArrayList arrayList = null;
        if (file.canRead()) {
            try {
                ArrayList arrayList2 = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith("N: Name=\"")) {
                        String substring = readLine.substring(9, readLine.length() - 1);
                        if (!TextUtils.isEmpty(substring)) {
                            arrayList2.add(substring);
                        }
                    }
                }
                bufferedReader.close();
                arrayList = arrayList2;
            } catch (IOException e7) {
                f8.g(e7, true);
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                for (int i11 = 0; i11 < 3; i11++) {
                    if (str.toLowerCase().contains(c[i11])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static synchronized long d() {
        synchronized (d6.class) {
            if (b == 0 || SystemClock.elapsedRealtime() - b > 60000) {
                return y2.f.c(w0.b).a();
            }
            return (long) a;
        }
    }

    public static KeyStore e() {
        KeyStore keyStore = d;
        if (keyStore != null) {
            return keyStore;
        }
        try {
            KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
            d = keyStore2;
            keyStore2.load(null);
            return d;
        } catch (Exception e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public static boolean f() {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) w0.b.getSystemService("appops");
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke(appOpsManager, 10020, Integer.valueOf(Process.myUid()), w0.b.getPackageName())).intValue() == 0;
        } catch (Exception e7) {
            f8.g(e7, true);
            return true;
        }
    }

    public static boolean g() {
        return d() >= 3000000;
    }

    public static boolean h() {
        try {
            return e().containsAlias("tmessages_passcode");
        } catch (KeyStoreException e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static boolean i() {
        return !TextUtils.isEmpty(i0.k1("ro.miui.ui.version.name"));
    }

    public static boolean j() {
        int intValue;
        Boolean bool = g;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Field declaredField = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT");
            declaredField.setAccessible(true);
            intValue = ((Integer) declaredField.get(null)).intValue();
        } catch (Exception unused) {
            g = Boolean.FALSE;
        }
        if (intValue < 100000) {
            return false;
        }
        h = intValue - 90000;
        g = Boolean.TRUE;
        return g.booleanValue();
    }
}
