package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class m {
    public static void a(BiometricPrompt.Builder builder, boolean z10) {
        builder.setConfirmationRequired(z10);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z10) {
        builder.setDeviceCredentialAllowed(z10);
    }
}
