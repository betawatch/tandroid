package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class xh0 extends v4.i0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ei0 h;

    public xh0(ei0 ei0Var, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        this.h = ei0Var;
        this.c = i7;
        this.d = context;
        this.e = i6Var;
        this.f = z10;
    }

    @Override // v4.i0
    public final int b() {
        ei0 ei0Var = this.h;
        return ei0Var.n.size() + ((ei0Var.I.isEmpty() || org.telegram.messenger.mp.u1(this.c).K3()) ? 0 : 1);
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 < this.h.n.size() ? 0 : 1;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f == 0) {
            ((org.telegram.ui.Cells.n6) f1Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i7));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout n6Var;
        if (i7 != 0) {
            ei0 ei0Var = this.h;
            y90 y90Var = ei0Var.K;
            if (y90Var == null) {
                ei0Var.i();
            } else if (y90Var.getParent() != null) {
                ((ViewGroup) ei0Var.K.getParent()).removeView(ei0Var.K);
            }
            Context context = this.d;
            n6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.u6.i(view, org.telegram.ui.ActionBar.u6.K(0.06f, org.telegram.ui.ActionBar.n6.E8), this.e);
            n6Var.addView(view, c8.ma.c(8.0f, -1));
            n6Var.addView(ei0Var.K, c8.ma.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            n6Var = new org.telegram.ui.Cells.n6(0, this.c, this.d, this.e, true, this.f);
        }
        return new kj0(n6Var);
    }
}
