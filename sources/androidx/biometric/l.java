package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class l {
    public static void a(BiometricPrompt.Builder builder, boolean z10) {
        builder.setConfirmationRequired(z10);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z10) {
        builder.setDeviceCredentialAllowed(z10);
    }
}
