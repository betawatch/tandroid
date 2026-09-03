package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sj0 extends f2.p0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ zj0 h;

    public sj0(zj0 zj0Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        this.h = zj0Var;
        this.c = i10;
        this.d = context;
        this.e = g6Var;
        this.f = z4;
    }

    @Override // f2.p0
    public final int h() {
        zj0 zj0Var = this.h;
        return zj0Var.n.size() + ((zj0Var.E.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
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
            zj0 zj0Var = this.h;
            xa0 xa0Var = zj0Var.G;
            if (xa0Var == null) {
                zj0Var.i();
            } else if (xa0Var.getParent() != null) {
                ((ViewGroup) zj0Var.G.getParent()).removeView(zj0Var.G);
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, this.e)));
            n6Var.addView(view, k7.c6.c(8.0f, -1));
            n6Var.addView(zj0Var.G, k7.c6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.c, this.d, this.e, true, this.f);
        }
        return new el0(n6Var);
    }
}
