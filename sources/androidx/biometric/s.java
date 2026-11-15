package androidx.biometric;

import android.hardware.biometrics.BiometricManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class s {
    public static int a(BiometricManager biometricManager, int i7) {
        return biometricManager.canAuthenticate(i7);
    }
}
