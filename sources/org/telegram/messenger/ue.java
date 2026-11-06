package org.telegram.messenger;

import android.telephony.PhoneStateListener;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class ue extends PhoneStateListener {
    public final /* synthetic */ MediaController a;

    public ue(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i7, String str) {
        g0.h3(new x0(this, i7, 4));
    }
}
