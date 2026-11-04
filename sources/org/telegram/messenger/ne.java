package org.telegram.messenger;

import android.telephony.PhoneStateListener;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ne extends PhoneStateListener {
    public final /* synthetic */ MediaController a;

    public ne(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i3, String str) {
        g0.h3(new x0(this, i3, 4));
    }
}
