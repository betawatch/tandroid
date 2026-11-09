package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class m {
    public static void a(BiometricPrompt.Builder builder, boolean z9) {
        builder.setConfirmationRequired(z9);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z9) {
        builder.setDeviceCredentialAllowed(z9);
    }
}
