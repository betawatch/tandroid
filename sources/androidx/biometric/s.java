package androidx.biometric;

import android.hardware.biometrics.BiometricManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class s {
    public static int a(BiometricManager biometricManager, int i9) {
        return biometricManager.canAuthenticate(i9);
    }
}
