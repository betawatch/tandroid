package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nk0 extends s4.i0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ uk0 h;

    public nk0(uk0 uk0Var, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.h = uk0Var;
        this.c = i10;
        this.d = context;
        this.e = e6Var;
        this.f = z10;
    }

    @Override // s4.i0
    public final int h() {
        uk0 uk0Var = this.h;
        return uk0Var.n.size() + ((uk0Var.H.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // s4.i0
    public final int j(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f == 0) {
            ((org.telegram.ui.Cells.o6) d1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout o6Var;
        if (i10 != 0) {
            uk0 uk0Var = this.h;
            vb0 vb0Var = uk0Var.J;
            if (vb0Var == null) {
                uk0Var.i();
            } else if (vb0Var.getParent() != null) {
                ((ViewGroup) uk0Var.J.getParent()).removeView(uk0Var.J);
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, this.e)));
            o6Var.addView(view, w7.x5.d(8.0f, -1));
            o6Var.addView(uk0Var.J, w7.x5.a(-1.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 0));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.c, this.d, this.e, true, this.f);
        }
        return new am0(o6Var);
    }
}
