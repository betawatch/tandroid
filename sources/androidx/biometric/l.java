package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public abstract class l {
    public static void a(BiometricPrompt.Builder builder, boolean z10) {
        builder.setConfirmationRequired(z10);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z10) {
        builder.setDeviceCredentialAllowed(z10);
    }
}
