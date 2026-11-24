// default package

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class eg4 {
    public static boolean a(Context context) {
        try {
            FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
            if (fingerprintManager == null) {
                return false;
            }
            return fingerprintManager.hasEnrolledFingerprints();
        } catch (Exception e) {
            fa4.g(e, true);
            return false;
        }
    }

    public static boolean b(Context context) {
        try {
            FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
            if (fingerprintManager == null) {
                return false;
            }
            return fingerprintManager.isHardwareDetected();
        } catch (Exception e) {
            fa4.g(e, true);
            return false;
        }
    }
}
