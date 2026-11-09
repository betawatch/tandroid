package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class lh0 extends v4.g0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ sh0 h;

    public lh0(sh0 sh0Var, int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        this.h = sh0Var;
        this.c = i7;
        this.d = context;
        this.e = g6Var;
        this.f = z9;
    }

    @Override // v4.g0
    public final int b() {
        sh0 sh0Var = this.h;
        return sh0Var.n.size() + ((sh0Var.H.isEmpty() || org.telegram.messenger.qp.s1(this.c).D3()) ? 0 : 1);
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
            sh0 sh0Var = this.h;
            m90 m90Var = sh0Var.J;
            if (m90Var == null) {
                sh0Var.i();
            } else if (m90Var.getParent() != null) {
                ((ViewGroup) sh0Var.J.getParent()).removeView(sh0Var.J);
            }
            Context context = this.d;
            m6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.s6.i(view, org.telegram.ui.ActionBar.s6.K(0.06f, org.telegram.ui.ActionBar.l6.E8), this.e);
            m6Var.addView(view, c8.ha.c(8.0f, -1));
            m6Var.addView(sh0Var.J, c8.ha.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            m6Var = new org.telegram.ui.Cells.m6(0, this.c, this.d, this.e, true, this.f);
        }
        return new yi0(m6Var);
    }
}
