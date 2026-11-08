package org.telegram.messenger;

import android.telephony.PhoneStateListener;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
