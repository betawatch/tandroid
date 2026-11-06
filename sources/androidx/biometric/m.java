package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class m {
    public static void a(BiometricPrompt.Builder builder, boolean z9) {
        builder.setConfirmationRequired(z9);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z9) {
        builder.setDeviceCredentialAllowed(z9);
    }
}
