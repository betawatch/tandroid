package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qc extends org.telegram.ui.Components.pm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ sc f;

    public qc(sc scVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f = scVar;
        this.c = context;
        this.d = e6Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override // s4.i0
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        rc rcVar = (rc) d1Var.a;
        rcVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, this.d));
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

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.am0(new rc(this.f, this.c));
    }
}
