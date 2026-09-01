package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tj0 extends f2.p0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ak0 h;

    public tj0(ak0 ak0Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        this.h = ak0Var;
        this.c = i10;
        this.d = context;
        this.e = g6Var;
        this.f = z4;
    }

    @Override // f2.p0
    public final int h() {
        ak0 ak0Var = this.h;
        return ak0Var.n.size() + ((ak0Var.E.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        if (m1Var.f == 0) {
            ((org.telegram.ui.Cells.n6) m1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n6Var;
        if (i10 != 0) {
            ak0 ak0Var = this.h;
            xa0 xa0Var = ak0Var.G;
            if (xa0Var == null) {
                ak0Var.i();
            } else if (xa0Var.getParent() != null) {
                ((ViewGroup) ak0Var.G.getParent()).removeView(ak0Var.G);
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, this.e)));
            n6Var.addView(view, k7.c6.c(8.0f, -1));
            n6Var.addView(ak0Var.G, k7.c6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.c, this.d, this.e, true, this.f);
        }
        return new fl0(n6Var);
    }
}
