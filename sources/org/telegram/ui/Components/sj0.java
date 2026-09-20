package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class sj0 extends s4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ zj0 h;

    public sj0(zj0 zj0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.h = zj0Var;
        this.c = i10;
        this.d = context;
        this.e = f6Var;
        this.f = z10;
    }

    @Override // s4.h0
    public final int h() {
        zj0 zj0Var = this.h;
        return zj0Var.n.size() + ((zj0Var.H.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
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
            zj0 zj0Var = this.h;
            bb0 bb0Var = zj0Var.J;
            if (bb0Var == null) {
                zj0Var.i();
            } else if (bb0Var.getParent() != null) {
                ((ViewGroup) zj0Var.J.getParent()).removeView(zj0Var.J);
            }
            Context context = this.d;
            p6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.e)));
            p6Var.addView(view, w7.y5.c(8.0f, -1));
            p6Var.addView(zj0Var.J, w7.y5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            p6Var = new org.telegram.ui.Cells.p6(0, this.c, this.d, this.e, true, this.f);
        }
        return new fl0(p6Var);
    }
}
