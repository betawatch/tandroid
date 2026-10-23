package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class jk0 extends s4.g0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qk0 h;

    public jk0(qk0 qk0Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        this.h = qk0Var;
        this.c = i10;
        this.d = context;
        this.e = g6Var;
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
            pb0 pb0Var = qk0Var.J;
            if (pb0Var == null) {
                qk0Var.i();
            } else if (pb0Var.getParent() != null) {
                ((ViewGroup) qk0Var.J.getParent()).removeView(qk0Var.J);
            }
            Context context = this.d;
            o6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.r6.j(view, org.telegram.ui.ActionBar.r6.M(0.06f, org.telegram.ui.ActionBar.k6.E8), this.e);
            o6Var.addView(view, w7.z5.c(8.0f, -1));
            o6Var.addView(qk0Var.J, w7.z5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            o6Var = new org.telegram.ui.Cells.o6(0, this.c, this.d, this.e, true, this.f);
        }
        return new wl0(o6Var);
    }
}
