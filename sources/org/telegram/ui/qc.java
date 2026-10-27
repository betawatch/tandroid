package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qc extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ sc f;

    public qc(sc scVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        this.f = scVar;
        this.c = context;
        this.d = u6Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
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
    public final void v(s4.e1 e1Var, int i10) {
        rc rcVar = (rc) e1Var.a;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, rcVar, this.d);
        boolean z10 = i10 == this.f.e;
        rcVar.s = z10;
        rcVar.v.f(z10, true);
        rcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) {
            return;
        }
        rcVar.a(peerColors.colors.get(i10));
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.wl0(new rc(this.f, this.c));
    }
}
