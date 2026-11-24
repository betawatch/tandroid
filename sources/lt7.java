// default package

import android.content.pm.PackageManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class lt7 {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
