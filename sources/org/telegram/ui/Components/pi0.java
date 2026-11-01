package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pi0 extends s4.g0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ wi0 h;

    public pi0(wi0 wi0Var, int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        this.h = wi0Var;
        this.c = i10;
        this.d = context;
        this.e = p6Var;
        this.f = z10;
    }

    @Override // s4.g0
    public final int b() {
        wi0 wi0Var = this.h;
        return wi0Var.n.size() + ((wi0Var.H.isEmpty() || org.telegram.messenger.wp.r1(this.c).A3()) ? 0 : 1);
    }

    @Override // s4.g0
    public final int d(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            ((org.telegram.ui.Cells.q6) c1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout q6Var;
        if (i10 != 0) {
            wi0 wi0Var = this.h;
            da0 da0Var = wi0Var.J;
            if (da0Var == null) {
                wi0Var.i();
            } else if (da0Var.getParent() != null) {
                ((ViewGroup) wi0Var.J.getParent()).removeView(wi0Var.J);
            }
            Context context = this.d;
            q6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.a7.j(view, org.telegram.ui.ActionBar.a7.L(0.06f, org.telegram.ui.ActionBar.t6.E8), this.e);
            q6Var.addView(view, w7.b6.c(8.0f, -1));
            q6Var.addView(wi0Var.J, w7.b6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            q6Var = new org.telegram.ui.Cells.q6(0, this.c, this.d, this.e, true, this.f);
        }
        return new dk0(q6Var);
    }
}
