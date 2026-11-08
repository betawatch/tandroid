package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class s60 extends oj0 {
    public final Context c;
    public final /* synthetic */ t60 d;

    public s60(t60 t60Var, Context context) {
        this.d = t60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.p1.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLObject M0;
        String str;
        View view = d1Var.a;
        t60 t60Var = this.d;
        long C1 = org.telegram.messenger.ij.C1((TLRPC.Peer) t60Var.p1.get(i7));
        if (C1 > 0) {
            M0 = org.telegram.messenger.qp.s1(t60Var.a).a2(Long.valueOf(C1));
            str = org.telegram.messenger.id.M0(2131743352, null);
        } else {
            M0 = org.telegram.messenger.qp.s1(t60Var.a).M0(Long.valueOf(-C1));
            str = null;
        }
        if (t60Var.s1 == 0) {
            ((org.telegram.ui.Cells.d7) view).c(C1, C1 == org.telegram.messenger.ij.C1(t60Var.t1), null);
        } else {
            ((org.telegram.ui.Cells.h4) view).e(M0, null, str, i7 != b() - 1);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View h4Var;
        t60 t60Var = this.d;
        if (t60Var.s1 == 0) {
            h4Var = new org.telegram.ui.Cells.d7(2, this.c, null);
            h4Var.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            h4Var = new org.telegram.ui.Cells.h4(2, 0, this.c, null, false, t60Var.s1 == 2);
        }
        return new xi0(h4Var);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        d1Var.b();
        long C1 = org.telegram.messenger.ij.C1(this.d.t1);
        View view = d1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.h4)) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
            d7Var.b(C1 == d7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Object object = h4Var.getObject();
            h4Var.c(C1 == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
