package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xi0 extends f2.r0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ej0 h;

    public xi0(ej0 ej0Var, int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        this.h = ej0Var;
        this.c = i9;
        this.d = context;
        this.e = b6Var;
        this.f = z10;
    }

    @Override // f2.r0
    public final int h() {
        ej0 ej0Var = this.h;
        return ej0Var.n.size() + ((ej0Var.D.isEmpty() || MessagesController.getInstance(this.c).premiumFeaturesBlocked()) ? 0 : 1);
    }

    @Override // f2.r0
    public final int j(int i9) {
        return i9 < this.h.n.size() ? 0 : 1;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (q1Var.f == 0) {
            ((org.telegram.ui.Cells.n6) q1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i9));
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout n6Var;
        if (i9 != 0) {
            ej0 ej0Var = this.h;
            ca0 ca0Var = ej0Var.F;
            if (ca0Var == null) {
                ej0Var.i();
            } else if (ca0Var.getParent() != null) {
                ((ViewGroup) ej0Var.F.getParent()).removeView(ej0Var.F);
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, this.e)));
            n6Var.addView(view, g7.e6.c(8.0f, -1));
            n6Var.addView(ej0Var.F, g7.e6.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.c, this.d, this.e, true, this.f);
        }
        return new ik0(n6Var);
    }
}
