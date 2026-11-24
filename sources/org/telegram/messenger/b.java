package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                Boolean valueOf = Boolean.valueOf(cy4.e.c(a.b, dy4.a) == 0);
                this.a = valueOf;
                bool = valueOf;
            } catch (Exception e) {
                fa4.g(e, true);
                bool = Boolean.FALSE;
                this.a = bool;
            }
        }
        return bool.booleanValue();
    }

    @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(gba.f)) {
            boolean z = w01.a;
        } else if (w01.a) {
            fa4.b("FCM Registration not found.");
        }
        Utilities.e.c(new sr8(this, (byte) 4));
    }
}
