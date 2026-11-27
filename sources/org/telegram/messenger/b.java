package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
                Boolean valueOf = Boolean.valueOf(i05.e.c(a.b, j05.a) == 0);
                this.a = valueOf;
                bool = valueOf;
            } catch (Exception e) {
                cc4.g(e, true);
                bool = Boolean.FALSE;
                this.a = bool;
            }
        }
        return bool.booleanValue();
    }

    @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(xea.f)) {
            boolean z = f11.a;
        } else if (f11.a) {
            cc4.b("FCM Registration not found.");
        }
        Utilities.e.c(new uk8(this, (byte) 20));
    }
}
