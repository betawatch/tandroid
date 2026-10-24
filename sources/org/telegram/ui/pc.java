package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class pc extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ rc f;

    public pc(rc rcVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f = rcVar;
        this.c = context;
        this.d = g6Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        qc qcVar = (qc) b1Var.a;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, qcVar, this.d);
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

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.wl0(new qc(this.f, this.c));
    }
}
