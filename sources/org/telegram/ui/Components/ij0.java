package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ij0 extends f2.p0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ pj0 h;

    public ij0(pj0 pj0Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this.h = pj0Var;
        this.c = i10;
        this.d = context;
        this.e = c6Var;
        this.f = z10;
    }

    @Override // f2.p0
    public final int h() {
        pj0 pj0Var = this.h;
        return pj0Var.n.size() + ((pj0Var.D.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        if (n1Var.f == 0) {
            ((org.telegram.ui.Cells.l6) n1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout l6Var;
        if (i10 != 0) {
            pj0 pj0Var = this.h;
            qa0 qa0Var = pj0Var.F;
            if (qa0Var == null) {
                pj0Var.i();
            } else if (qa0Var.getParent() != null) {
                ((ViewGroup) pj0Var.F.getParent()).removeView(pj0Var.F);
            }
            Context context = this.d;
            l6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, this.e)));
            l6Var.addView(view, i7.f6.c(8.0f, -1));
            l6Var.addView(pj0Var.F, i7.f6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            l6Var = new org.telegram.ui.Cells.l6(0, this.c, this.d, this.e, true, this.f);
        }
        return new vk0(l6Var);
    }
}
