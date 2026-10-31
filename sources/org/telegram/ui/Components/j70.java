package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j70 extends sk0 {
    public final Context c;
    public final /* synthetic */ k70 d;

    public j70(k70 k70Var, Context context) {
        this.d = k70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.p1.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLObject L0;
        String str;
        View view = c1Var.a;
        k70 k70Var = this.d;
        long C1 = org.telegram.messenger.jj.C1((TLRPC.Peer) k70Var.p1.get(i10));
        if (C1 > 0) {
            L0 = org.telegram.messenger.vp.r1(k70Var.a).Z1(Long.valueOf(C1));
            str = org.telegram.messenger.cd.L0(2131743375, null);
        } else {
            L0 = org.telegram.messenger.vp.r1(k70Var.a).L0(Long.valueOf(-C1));
            str = null;
        }
        if (k70Var.s1 == 0) {
            ((org.telegram.ui.Cells.h7) view).c(C1, C1 == org.telegram.messenger.jj.C1(k70Var.t1), null);
        } else {
            ((org.telegram.ui.Cells.j4) view).e(L0, null, str, i10 != b() - 1);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View j4Var;
        k70 k70Var = this.d;
        if (k70Var.s1 == 0) {
            j4Var = new org.telegram.ui.Cells.h7(2, this.c, null);
            j4Var.setLayoutParams(new s4.o0(org.telegram.messenger.i0.L(80.0f), org.telegram.messenger.i0.L(100.0f)));
        } else {
            j4Var = new org.telegram.ui.Cells.j4(2, 0, this.c, null, false, k70Var.s1 == 2);
        }
        return new ck0(j4Var);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        c1Var.b();
        long C1 = org.telegram.messenger.jj.C1(this.d.t1);
        View view = c1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.j4)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            h7Var.b(C1 == h7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            Object object = j4Var.getObject();
            j4Var.c(C1 == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
