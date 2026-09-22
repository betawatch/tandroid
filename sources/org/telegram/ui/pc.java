package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pc extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ rc f;

    public pc(rc rcVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f = rcVar;
        this.c = context;
        this.d = e6Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Components.kl0
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
        qcVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, this.d));
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
        return new org.telegram.ui.Components.vk0(new qc(this.f, this.c));
    }
}
