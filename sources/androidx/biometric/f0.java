package androidx.biometric;

import android.app.KeyguardManager;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class f0 {
    public static boolean a(KeyguardManager keyguardManager) {
        return keyguardManager.isKeyguardSecure();
    }
}
