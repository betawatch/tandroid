package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class zh0 extends v4.i0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ gi0 h;

    public zh0(gi0 gi0Var, int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        this.h = gi0Var;
        this.c = i7;
        this.d = context;
        this.e = h6Var;
        this.f = z10;
    }

    @Override // v4.i0
    public final int b() {
        gi0 gi0Var = this.h;
        return gi0Var.n.size() + ((gi0Var.I.isEmpty() || org.telegram.messenger.np.u1(this.c).K3()) ? 0 : 1);
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 < this.h.n.size() ? 0 : 1;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f == 0) {
            ((org.telegram.ui.Cells.n6) f1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i7));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout n6Var;
        if (i7 != 0) {
            gi0 gi0Var = this.h;
            aa0 aa0Var = gi0Var.K;
            if (aa0Var == null) {
                gi0Var.i();
            } else if (aa0Var.getParent() != null) {
                ((ViewGroup) gi0Var.K.getParent()).removeView(gi0Var.K);
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.t6.i(view, org.telegram.ui.ActionBar.t6.K(0.06f, org.telegram.ui.ActionBar.m6.E8), this.e);
            n6Var.addView(view, c8.ma.c(8.0f, -1));
            n6Var.addView(gi0Var.K, c8.ma.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.c, this.d, this.e, true, this.f);
        }
        return new mj0(n6Var);
    }
}
