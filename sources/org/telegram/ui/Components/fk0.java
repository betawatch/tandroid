package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class fk0 extends s4.g0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ mk0 h;

    public fk0(mk0 mk0Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this.h = mk0Var;
        this.c = i10;
        this.d = context;
        this.e = d6Var;
        this.f = z10;
    }

    @Override // s4.g0
    public final int h() {
        mk0 mk0Var = this.h;
        return mk0Var.n.size() + ((mk0Var.H.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f == 0) {
            ((org.telegram.ui.Cells.n6) b1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n6Var;
        if (i10 != 0) {
            mk0 mk0Var = this.h;
            ob0 ob0Var = mk0Var.J;
            if (ob0Var == null) {
                mk0Var.i();
            } else if (ob0Var.getParent() != null) {
                ((ViewGroup) mk0Var.J.getParent()).removeView(mk0Var.J);
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, this.e)));
            n6Var.addView(view, w7.z5.d(8.0f, -1));
            n6Var.addView(mk0Var.J, w7.z5.a(-1.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 0));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.c, this.d, this.e, true, this.f);
        }
        return new sl0(n6Var);
    }
}
