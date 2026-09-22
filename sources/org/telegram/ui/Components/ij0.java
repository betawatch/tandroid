package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ij0 extends s4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ pj0 h;

    public ij0(pj0 pj0Var, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.h = pj0Var;
        this.c = i10;
        this.d = context;
        this.e = e6Var;
        this.f = z10;
    }

    @Override // s4.h0
    public final int h() {
        pj0 pj0Var = this.h;
        return pj0Var.n.size() + ((pj0Var.H.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            ((org.telegram.ui.Cells.o6) c1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout o6Var;
        if (i10 != 0) {
            pj0 pj0Var = this.h;
            ta0 ta0Var = pj0Var.J;
            if (ta0Var == null) {
                pj0Var.i();
            } else if (ta0Var.getParent() != null) {
                ((ViewGroup) pj0Var.J.getParent()).removeView(pj0Var.J);
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, this.e)));
            o6Var.addView(view, w7.x5.c(8.0f, -1));
            o6Var.addView(pj0Var.J, w7.x5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.c, this.d, this.e, true, this.f);
        }
        return new vk0(o6Var);
    }
}
