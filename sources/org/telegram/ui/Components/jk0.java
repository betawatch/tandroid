package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jk0 extends s4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qk0 h;

    public jk0(qk0 qk0Var, int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        this.h = qk0Var;
        this.c = i10;
        this.d = context;
        this.e = u6Var;
        this.f = z10;
    }

    @Override // s4.h0
    public final int h() {
        qk0 qk0Var = this.h;
        return qk0Var.n.size() + ((qk0Var.H.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        if (e1Var.f == 0) {
            ((org.telegram.ui.Cells.s6) e1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout s6Var;
        if (i10 != 0) {
            qk0 qk0Var = this.h;
            nb0 nb0Var = qk0Var.J;
            if (nb0Var == null) {
                qk0Var.i();
            } else if (nb0Var.getParent() != null) {
                ((ViewGroup) qk0Var.J.getParent()).removeView(qk0Var.J);
            }
            Context context = this.d;
            s6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.f7.j(view, org.telegram.ui.ActionBar.f7.L(0.06f, org.telegram.ui.ActionBar.y6.E8), this.e);
            s6Var.addView(view, kb1.g(8.0f, -1));
            s6Var.addView(qk0Var.J, kb1.h(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            s6Var = new org.telegram.ui.Cells.s6(0, this.c, this.d, this.e, true, this.f);
        }
        return new wl0(s6Var);
    }
}
