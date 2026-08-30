package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class n {
    public static void a(BiometricPrompt.Builder builder, boolean z4) {
        builder.setConfirmationRequired(z4);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z4) {
        builder.setDeviceCredentialAllowed(z4);
    }
}
