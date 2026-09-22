package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class vj0 extends s4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ck0 h;

    public vj0(ck0 ck0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.h = ck0Var;
        this.c = i10;
        this.d = context;
        this.e = f6Var;
        this.f = z10;
    }

    @Override // s4.h0
    public final int h() {
        ck0 ck0Var = this.h;
        return ck0Var.n.size() + ((ck0Var.H.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            ((org.telegram.ui.Cells.p6) c1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout p6Var;
        if (i10 != 0) {
            ck0 ck0Var = this.h;
            eb0 eb0Var = ck0Var.J;
            if (eb0Var == null) {
                ck0Var.i();
            } else if (eb0Var.getParent() != null) {
                ((ViewGroup) ck0Var.J.getParent()).removeView(ck0Var.J);
            }
            Context context = this.d;
            p6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.e)));
            p6Var.addView(view, w7.y5.c(8.0f, -1));
            p6Var.addView(ck0Var.J, w7.y5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            p6Var = new org.telegram.ui.Cells.p6(0, this.c, this.d, this.e, true, this.f);
        }
        return new il0(p6Var);
    }
}
