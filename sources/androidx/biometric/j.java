package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Intent;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class j {
    public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }
}
