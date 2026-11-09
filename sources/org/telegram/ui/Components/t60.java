package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t60 extends pj0 {
    public final Context c;
    public final /* synthetic */ u60 d;

    public t60(u60 u60Var, Context context) {
        this.d = u60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pj0
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
        u60 u60Var = this.d;
        long B1 = org.telegram.messenger.ij.B1((TLRPC.Peer) u60Var.p1.get(i7));
        if (B1 > 0) {
            M0 = org.telegram.messenger.qp.s1(u60Var.a).a2(Long.valueOf(B1));
            str = org.telegram.messenger.id.M0(2131743349, null);
        } else {
            M0 = org.telegram.messenger.qp.s1(u60Var.a).M0(Long.valueOf(-B1));
            str = null;
        }
        if (u60Var.s1 == 0) {
            ((org.telegram.ui.Cells.d7) view).c(B1, B1 == org.telegram.messenger.ij.B1(u60Var.t1), null);
        } else {
            ((org.telegram.ui.Cells.h4) view).e(M0, null, str, i7 != b() - 1);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View h4Var;
        u60 u60Var = this.d;
        if (u60Var.s1 == 0) {
            h4Var = new org.telegram.ui.Cells.d7(2, this.c, null);
            h4Var.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            h4Var = new org.telegram.ui.Cells.h4(2, 0, this.c, null, false, u60Var.s1 == 2);
        }
        return new yi0(h4Var);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        d1Var.b();
        long B1 = org.telegram.messenger.ij.B1(this.d.t1);
        View view = d1Var.a;
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
