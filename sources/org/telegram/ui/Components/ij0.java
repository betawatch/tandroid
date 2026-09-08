package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ij0 extends s4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ pj0 h;

    public ij0(pj0 pj0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.h = pj0Var;
        this.c = i10;
        this.d = context;
        this.e = f6Var;
        this.f = z10;
    }

    @Override // s4.h0
    public final int h() {
        pj0 pj0Var = this.h;
        return pj0Var.n.size() + ((pj0Var.H.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            ((org.telegram.ui.Cells.n6) c1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n6Var;
        if (i10 != 0) {
            pj0 pj0Var = this.h;
            ua0 ua0Var = pj0Var.J;
            if (ua0Var == null) {
                pj0Var.i();
            } else if (ua0Var.getParent() != null) {
                ((ViewGroup) pj0Var.J.getParent()).removeView(pj0Var.J);
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.e)));
            n6Var.addView(view, w7.x5.c(8.0f, -1));
            n6Var.addView(pj0Var.J, w7.x5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.c, this.d, this.e, true, this.f);
        }
        return new vk0(n6Var);
    }
}
