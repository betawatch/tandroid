package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ik0 extends s4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ pk0 h;

    public ik0(pk0 pk0Var, int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        this.h = pk0Var;
        this.c = i10;
        this.d = context;
        this.e = u6Var;
        this.f = z10;
    }

    @Override // s4.h0
    public final int h() {
        pk0 pk0Var = this.h;
        return pk0Var.n.size() + ((pk0Var.H.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
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
            pk0 pk0Var = this.h;
            mb0 mb0Var = pk0Var.J;
            if (mb0Var == null) {
                pk0Var.i();
            } else if (mb0Var.getParent() != null) {
                ((ViewGroup) pk0Var.J.getParent()).removeView(pk0Var.J);
            }
            Context context = this.d;
            s6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.f7.j(view, org.telegram.ui.ActionBar.f7.L(0.06f, org.telegram.ui.ActionBar.y6.E8), this.e);
            s6Var.addView(view, gb1.g(8.0f, -1));
            s6Var.addView(pk0Var.J, gb1.h(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            s6Var = new org.telegram.ui.Cells.s6(0, this.c, this.d, this.e, true, this.f);
        }
        return new vl0(s6Var);
    }
}
