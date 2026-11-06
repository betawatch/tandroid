package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class tt implements PushListenerController.IPushListenerServiceProvider {
    public static final tt b = new tt();
    public Boolean a;

    @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
    public final String getLogTitle() {
        return "Google Play Services";
    }

    @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
    public final int getPushType() {
        return 2;
    }

    @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
    public final boolean hasServices() {
        if (this.a == null) {
            try {
                this.a = Boolean.valueOf(n6.d.e.d(t0.b, n6.e.a) == 0);
            } catch (Exception e10) {
                a8.g(e10, true);
                this.a = Boolean.FALSE;
            }
        }
        return this.a.booleanValue();
    }

    @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(iz.g)) {
            boolean z9 = r2.a;
        } else if (r2.a) {
            a8.b("FCM Registration not found.");
        }
        Utilities.e.c(new ds(this, 3));
    }
}
