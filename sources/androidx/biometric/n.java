package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class n {
    public static void a(BiometricPrompt.Builder builder, boolean z4) {
        builder.setConfirmationRequired(z4);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z4) {
        builder.setDeviceCredentialAllowed(z4);
    }
}
