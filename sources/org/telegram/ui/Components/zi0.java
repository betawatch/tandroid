package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zi0 extends f2.q0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ gj0 h;

    public zi0(gj0 gj0Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this.h = gj0Var;
        this.c = i10;
        this.d = context;
        this.e = c6Var;
        this.f = z10;
    }

    @Override // f2.q0
    public final int h() {
        gj0 gj0Var = this.h;
        return gj0Var.n.size() + ((gj0Var.D.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // f2.q0
    public final int j(int i10) {
        return i10 < this.h.n.size() ? 0 : 1;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f == 0) {
            ((org.telegram.ui.Cells.k6) o1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i10));
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout k6Var;
        if (i10 != 0) {
            gj0 gj0Var = this.h;
            ga0 ga0Var = gj0Var.F;
            if (ga0Var == null) {
                gj0Var.i();
            } else if (ga0Var.getParent() != null) {
                ((ViewGroup) gj0Var.F.getParent()).removeView(gj0Var.F);
            }
            Context context = this.d;
            k6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, this.e)));
            k6Var.addView(view, h7.z5.c(8.0f, -1));
            k6Var.addView(gj0Var.F, h7.z5.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            k6Var = new org.telegram.ui.Cells.k6(0, this.c, this.d, this.e, true, this.f);
        }
        return new lk0(k6Var);
    }
}
