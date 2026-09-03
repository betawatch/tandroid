package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pc extends org.telegram.ui.Components.rl0 {
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

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        qc qcVar = (qc) m1Var.a;
        qcVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, this.d));
        boolean z4 = i10 == this.f.e;
        qcVar.s = z4;
        qcVar.v.f(z4, true);
        qcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) {
            return;
        }
        qcVar.a(peerColors.colors.get(i10));
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.el0(new qc(this.f, this.c));
    }
}
