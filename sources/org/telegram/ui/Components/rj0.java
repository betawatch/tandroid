package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rj0 extends f2.o0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ yj0 h;

    public rj0(yj0 yj0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        this.h = yj0Var;
        this.c = i10;
        this.d = context;
        this.e = f6Var;
        this.f = z4;
    }

    @Override // f2.o0
    public final int h() {
        yj0 yj0Var = this.h;
        return yj0Var.n.size() + ((yj0Var.E.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // f2.o0
    public final int j(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (l1Var.f == 0) {
            ((org.telegram.ui.Cells.m6) l1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout m6Var;
        if (i10 != 0) {
            yj0 yj0Var = this.h;
            wa0 wa0Var = yj0Var.G;
            if (wa0Var == null) {
                yj0Var.i();
            } else if (wa0Var.getParent() != null) {
                ((ViewGroup) yj0Var.G.getParent()).removeView(yj0Var.G);
            }
            Context context = this.d;
            m6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.e)));
            m6Var.addView(view, k7.b6.c(8.0f, -1));
            m6Var.addView(yj0Var.G, k7.b6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            m6Var = new org.telegram.ui.Cells.m6(0, this.c, this.d, this.e, true, this.f);
        }
        return new dl0(m6Var);
    }
}
