package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b implements PushListenerController.IPushListenerServiceProvider {
    public static final b b = new b();
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
        Boolean bool = this.a;
        if (bool == null) {
            try {
                Boolean valueOf = Boolean.valueOf(d05.e.c(a.b, e05.a) == 0);
                this.a = valueOf;
                bool = valueOf;
            } catch (Exception e) {
                fc4.g(e, true);
                bool = Boolean.FALSE;
                this.a = bool;
            }
        }
        return bool.booleanValue();
    }

    @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(gda.f)) {
            boolean z = e21.a;
        } else if (e21.a) {
            fc4.b("FCM Registration not found.");
        }
        Utilities.e.c(new pp8(this, (byte) 12));
    }
}
