// default package

import android.hardware.biometrics.BiometricManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class cj0 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
