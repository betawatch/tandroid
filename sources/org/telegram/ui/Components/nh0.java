package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nh0 extends u4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ uh0 h;

    public nh0(uh0 uh0Var, int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.h = uh0Var;
        this.c = i3;
        this.d = context;
        this.e = e6Var;
        this.f = z10;
    }

    @Override // u4.h0
    public final int b() {
        uh0 uh0Var = this.h;
        return uh0Var.n.size() + ((uh0Var.I.isEmpty() || org.telegram.messenger.hp.s1(this.c).D3()) ? 0 : 1);
    }

    @Override // u4.h0
    public final int d(int i3) {
        return i3 < this.h.n.size() ? 0 : 1;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (d1Var.f == 0) {
            ((org.telegram.ui.Cells.l6) d1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i3));
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout l6Var;
        if (i3 != 0) {
            uh0 uh0Var = this.h;
            h90 h90Var = uh0Var.K;
            if (h90Var == null) {
                uh0Var.i();
            } else if (h90Var.getParent() != null) {
                ((ViewGroup) uh0Var.K.getParent()).removeView(uh0Var.K);
            }
            Context context = this.d;
            l6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.r6.j(view, org.telegram.ui.ActionBar.r6.L(0.06f, org.telegram.ui.ActionBar.k6.E8), this.e);
            l6Var.addView(view, b8.mf.c(8.0f, -1));
            l6Var.addView(uh0Var.K, b8.mf.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            l6Var = new org.telegram.ui.Cells.l6(0, this.c, this.d, this.e, true, this.f);
        }
        return new bj0(l6Var);
    }
}
