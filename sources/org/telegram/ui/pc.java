package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class pc extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ rc f;

    public pc(rc rcVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f = rcVar;
        this.c = context;
        this.d = d6Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        qc qcVar = (qc) c1Var.a;
        qcVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, this.d));
        boolean z10 = i10 == this.f.e;
        qcVar.s = z10;
        qcVar.v.f(z10, true);
        qcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) {
            return;
        }
        qcVar.a(peerColors.colors.get(i10));
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.gl0(new qc(this.f, this.c));
    }
}
