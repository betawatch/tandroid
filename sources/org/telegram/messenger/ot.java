package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class ot implements PushListenerController.IPushListenerServiceProvider {
    public static final ot b = new ot();
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
        if (!TextUtils.isEmpty(cz.g)) {
            boolean z10 = s2.a;
        } else if (s2.a) {
            a8.b("FCM Registration not found.");
        }
        Utilities.e.c(new yr(this, 3));
    }
}
