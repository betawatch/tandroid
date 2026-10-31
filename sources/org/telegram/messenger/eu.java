package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class eu implements PushListenerController.IPushListenerServiceProvider {
    public static final eu b = new eu();
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
        if (!TextUtils.isEmpty(tz.g)) {
            boolean z10 = v2.a;
        } else if (v2.a) {
            f8.b("FCM Registration not found.");
        }
        Utilities.e.c(new ms(this, 4));
    }
}
