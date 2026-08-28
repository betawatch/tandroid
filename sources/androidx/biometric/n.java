package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class n {
    public static void a(BiometricPrompt.Builder builder, int i9) {
        builder.setAllowedAuthenticators(i9);
    }
}
