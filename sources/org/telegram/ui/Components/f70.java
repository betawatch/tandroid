package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
            ((org.telegram.ui.Cells.d7) view).c(B1, B1 == org.telegram.messenger.fj.B1(g70Var.x1), null);
        } else {
            ((org.telegram.ui.Cells.h4) view).e(O0, null, str, i7 != b() - 1);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View h4Var;
        g70 g70Var = this.d;
        if (g70Var.w1 == 0) {
            h4Var = new org.telegram.ui.Cells.d7(2, this.c, null);
            h4Var.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            h4Var = new org.telegram.ui.Cells.h4(2, 0, this.c, null, false, g70Var.w1 == 2);
        }
        return new kj0(h4Var);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        f1Var.b();
        long B1 = org.telegram.messenger.fj.B1(this.d.x1);
        View view = f1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.h4)) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
            d7Var.b(B1 == d7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Object object = h4Var.getObject();
            h4Var.c(B1 == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
