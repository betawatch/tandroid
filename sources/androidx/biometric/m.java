package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class m {
    public static void a(BiometricPrompt.Builder builder, boolean z9) {
        builder.setConfirmationRequired(z9);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z9) {
        builder.setDeviceCredentialAllowed(z9);
    }
}
