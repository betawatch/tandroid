package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class fu implements PushListenerController.IPushListenerServiceProvider {
    public static final fu b = new fu();
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
                this.a = Boolean.valueOf(k6.d.d.d(w0.b, k6.e.a) == 0);
            } catch (Exception e) {
                f8.g(e, true);
                this.a = Boolean.FALSE;
            }
        }
        return this.a.booleanValue();
    }

    @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(uz.g)) {
            boolean z10 = v2.a;
        } else if (v2.a) {
            f8.b("FCM Registration not found.");
        }
        Utilities.e.c(new ns(this, 4));
    }
}
