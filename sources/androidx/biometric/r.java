package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class r {
    public static int a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager b(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    public static Method c() {
        try {
            return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
