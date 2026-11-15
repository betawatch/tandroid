package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class rp implements vt0 {
    public final /* synthetic */ pp a;
    public final /* synthetic */ tp b;

    public rp(tp tpVar, pp ppVar) {
        this.b = tpVar;
        this.a = ppVar;
    }

    @Override // org.telegram.ui.Components.vt0
    public final void l(int i7) {
        tp tpVar = this.b;
        tpVar.u1 = i7;
        tpVar.J0(true);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void p() {
        int measuredHeight = this.b.o1.getMeasuredHeight();
        pp ppVar = this.a;
        ppVar.z(0 - ppVar.getScrollX(), measuredHeight - ppVar.getScrollY(), false);
    }
}
