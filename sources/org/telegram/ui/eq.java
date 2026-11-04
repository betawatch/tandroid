package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class eq extends org.telegram.ui.Components.a10 {
    public final /* synthetic */ nq k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(nq nqVar, Activity activity, nq nqVar2) {
        super(activity, nqVar2);
        this.k1 = nqVar;
    }

    @Override // org.telegram.ui.Components.a10
    public final void J0() {
        nq nqVar = this.k1;
        nqVar.getMessagesController().S(nqVar.getParentActivity(), nqVar.n, nqVar, new x0(this, 27));
    }

    @Override // org.telegram.ui.Components.a10
    public final void I0() {
    }
}
