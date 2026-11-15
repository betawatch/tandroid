package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class oh0 extends v4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ vh0 h;

    public oh0(vh0 vh0Var, int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.h = vh0Var;
        this.c = i7;
        this.d = context;
        this.e = e6Var;
        this.f = z10;
    }

    @Override // v4.h0
    public final int b() {
        vh0 vh0Var = this.h;
        return vh0Var.n.size() + ((vh0Var.I.isEmpty() || org.telegram.messenger.np.s1(this.c).D3()) ? 0 : 1);
    }

    @Override // v4.h0
    public final int d(int i7) {
        return i7 < this.h.n.size() ? 0 : 1;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        if (e1Var.f == 0) {
            ((org.telegram.ui.Cells.l6) e1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i7));
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout l6Var;
        if (i7 != 0) {
            vh0 vh0Var = this.h;
            o90 o90Var = vh0Var.K;
            if (o90Var == null) {
                vh0Var.i();
            } else if (o90Var.getParent() != null) {
                ((ViewGroup) vh0Var.K.getParent()).removeView(vh0Var.K);
            }
            Context context = this.d;
            l6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.q6.i(view, org.telegram.ui.ActionBar.q6.K(0.06f, org.telegram.ui.ActionBar.j6.E8), this.e);
            l6Var.addView(view, c8.ja.c(8.0f, -1));
            l6Var.addView(vh0Var.K, c8.ja.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            l6Var = new org.telegram.ui.Cells.l6(0, this.c, this.d, this.e, true, this.f);
        }
        return new cj0(l6Var);
    }
}
