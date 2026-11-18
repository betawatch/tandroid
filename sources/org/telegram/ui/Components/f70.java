package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class f70 extends bk0 {
    public final Context c;
    public final /* synthetic */ g70 d;

    public f70(g70 g70Var, Context context) {
        this.d = g70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.t1.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLObject O0;
        String str;
        View view = f1Var.a;
        g70 g70Var = this.d;
        long B1 = org.telegram.messenger.fj.B1((TLRPC.Peer) g70Var.t1.get(i7));
        if (B1 > 0) {
            O0 = org.telegram.messenger.mp.u1(g70Var.a).c2(Long.valueOf(B1));
            str = org.telegram.messenger.gd.M0(2131743112, null);
        } else {
            O0 = org.telegram.messenger.mp.u1(g70Var.a).O0(Long.valueOf(-B1));
            str = null;
        }
        if (g70Var.w1 == 0) {
            ((org.telegram.ui.Cells.e7) view).c(B1, B1 == org.telegram.messenger.fj.B1(g70Var.x1), null);
        } else {
            ((org.telegram.ui.Cells.i4) view).e(O0, null, str, i7 != b() - 1);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View i4Var;
        g70 g70Var = this.d;
        if (g70Var.w1 == 0) {
            i4Var = new org.telegram.ui.Cells.e7(2, this.c, null);
            i4Var.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            i4Var = new org.telegram.ui.Cells.i4(2, 0, this.c, null, false, g70Var.w1 == 2);
        }
        return new kj0(i4Var);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        f1Var.b();
        long B1 = org.telegram.messenger.fj.B1(this.d.x1);
        View view = f1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.i4)) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
            e7Var.b(B1 == e7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            Object object = i4Var.getObject();
            i4Var.c(B1 == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
