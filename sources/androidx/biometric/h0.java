package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class h0 {
    public static KeyguardManager a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
