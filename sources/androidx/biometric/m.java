package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class m {
    public static void a(BiometricPrompt.Builder builder, boolean z9) {
        builder.setConfirmationRequired(z9);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z9) {
        builder.setDeviceCredentialAllowed(z9);
    }
}
