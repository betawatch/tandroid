package androidx.biometric;

import android.content.pm.PackageManager;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class h0 {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
