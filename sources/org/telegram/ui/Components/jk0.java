package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jk0 extends s4.g0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qk0 h;

    public jk0(qk0 qk0Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this.h = qk0Var;
        this.c = i10;
        this.d = context;
        this.e = c6Var;
        this.f = z10;
    }

    @Override // s4.g0
    public final int h() {
        qk0 qk0Var = this.h;
        return qk0Var.n.size() + ((qk0Var.H.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f == 0) {
            ((org.telegram.ui.Cells.o6) b1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout o6Var;
        if (i10 != 0) {
            qk0 qk0Var = this.h;
            ub0 ub0Var = qk0Var.J;
            if (ub0Var == null) {
                qk0Var.i();
            } else if (ub0Var.getParent() != null) {
                ((ViewGroup) qk0Var.J.getParent()).removeView(qk0Var.J);
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, this.e)));
            o6Var.addView(view, w7.z5.d(8.0f, -1));
            o6Var.addView(qk0Var.J, w7.z5.a(-1.0f, 0.0f, 8.0f, 0.0f, 0.0f, -1, 0));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.c, this.d, this.e, true, this.f);
        }
        return new wl0(o6Var);
    }
}
