package org.telegram.messenger;

import android.telephony.PhoneStateListener;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class te extends PhoneStateListener {
    public final /* synthetic */ MediaController a;

    public te(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i10, String str) {
        i0.g3(new a1(this, i10, 4));
    }
}
