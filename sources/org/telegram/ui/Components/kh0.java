package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class kh0 extends v4.g0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ rh0 h;

    public kh0(rh0 rh0Var, int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        this.h = rh0Var;
        this.c = i7;
        this.d = context;
        this.e = f6Var;
        this.f = z9;
    }

    @Override // v4.g0
    public final int b() {
        rh0 rh0Var = this.h;
        return rh0Var.n.size() + ((rh0Var.H.isEmpty() || org.telegram.messenger.qp.s1(this.c).D3()) ? 0 : 1);
    }

    @Override // v4.g0
    public final int d(int i7) {
        return i7 < this.h.n.size() ? 0 : 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f == 0) {
            ((org.telegram.ui.Cells.m6) d1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i7));
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout m6Var;
        if (i7 != 0) {
            rh0 rh0Var = this.h;
            l90 l90Var = rh0Var.J;
            if (l90Var == null) {
                rh0Var.i();
            } else if (l90Var.getParent() != null) {
                ((ViewGroup) rh0Var.J.getParent()).removeView(rh0Var.J);
            }
            Context context = this.d;
            m6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.r6.j(view, org.telegram.ui.ActionBar.r6.L(0.06f, org.telegram.ui.ActionBar.k6.E8), this.e);
            m6Var.addView(view, c8.ha.c(8.0f, -1));
            m6Var.addView(rh0Var.J, c8.ha.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            m6Var = new org.telegram.ui.Cells.m6(0, this.c, this.d, this.e, true, this.f);
        }
        return new xi0(m6Var);
    }
}
