package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jj0 extends s4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qj0 h;

    public jj0(qj0 qj0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.h = qj0Var;
        this.c = i10;
        this.d = context;
        this.e = f6Var;
        this.f = z10;
    }

    @Override // s4.h0
    public final int h() {
        qj0 qj0Var = this.h;
        return qj0Var.n.size() + ((qj0Var.H.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            ((org.telegram.ui.Cells.n6) c1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n6Var;
        if (i10 != 0) {
            qj0 qj0Var = this.h;
            ta0 ta0Var = qj0Var.J;
            if (ta0Var == null) {
                qj0Var.i();
            } else if (ta0Var.getParent() != null) {
                ((ViewGroup) qj0Var.J.getParent()).removeView(qj0Var.J);
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.e)));
            n6Var.addView(view, w7.x5.c(8.0f, -1));
            n6Var.addView(qj0Var.J, w7.x5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.c, this.d, this.e, true, this.f);
        }
        return new wk0(n6Var);
    }
}
