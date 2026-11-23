package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e70 extends dk0 {
    public final Context c;
    public final /* synthetic */ f70 d;

    public e70(f70 f70Var, Context context) {
        this.d = f70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
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
        f70 f70Var = this.d;
        long B1 = org.telegram.messenger.fj.B1((TLRPC.Peer) f70Var.t1.get(i7));
        if (B1 > 0) {
            O0 = org.telegram.messenger.mp.u1(f70Var.a).c2(Long.valueOf(B1));
            str = org.telegram.messenger.gd.N0(2131743099, null);
        } else {
            O0 = org.telegram.messenger.mp.u1(f70Var.a).O0(Long.valueOf(-B1));
            str = null;
        }
        if (f70Var.w1 == 0) {
            ((org.telegram.ui.Cells.d7) view).c(B1, B1 == org.telegram.messenger.fj.B1(f70Var.x1), null);
        } else {
            ((org.telegram.ui.Cells.i4) view).e(O0, null, str, i7 != b() - 1);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View i4Var;
        f70 f70Var = this.d;
        if (f70Var.w1 == 0) {
            i4Var = new org.telegram.ui.Cells.d7(2, this.c, null);
            i4Var.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            i4Var = new org.telegram.ui.Cells.i4(2, 0, this.c, null, false, f70Var.w1 == 2);
        }
        return new mj0(i4Var);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        f1Var.b();
        long B1 = org.telegram.messenger.fj.B1(this.d.x1);
        View view = f1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.i4)) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
            d7Var.b(B1 == d7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            Object object = i4Var.getObject();
            i4Var.c(B1 == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
