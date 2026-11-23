package org.telegram.messenger;

import android.telephony.PhoneStateListener;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class te extends PhoneStateListener {
    public final /* synthetic */ MediaController a;

    public te(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i7, String str) {
        g0.g3(new x0(this, i7, 4));
    }
}
