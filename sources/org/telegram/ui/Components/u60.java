package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class u60 extends tj0 {
    public final Context c;
    public final /* synthetic */ v60 d;

    public u60(v60 v60Var, Context context) {
        this.d = v60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.t1.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        TLObject M0;
        String str;
        View view = e1Var.a;
        v60 v60Var = this.d;
        long B1 = org.telegram.messenger.gj.B1((TLRPC.Peer) v60Var.t1.get(i7));
        if (B1 > 0) {
            M0 = org.telegram.messenger.np.s1(v60Var.a).a2(Long.valueOf(B1));
            str = org.telegram.messenger.hd.M0(2131743349, null);
        } else {
            M0 = org.telegram.messenger.np.s1(v60Var.a).M0(Long.valueOf(-B1));
            str = null;
        }
        if (v60Var.w1 == 0) {
            ((org.telegram.ui.Cells.c7) view).c(B1, B1 == org.telegram.messenger.gj.B1(v60Var.x1), null);
        } else {
            ((org.telegram.ui.Cells.h4) view).e(M0, null, str, i7 != b() - 1);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View h4Var;
        v60 v60Var = this.d;
        if (v60Var.w1 == 0) {
            h4Var = new org.telegram.ui.Cells.c7(2, this.c, null);
            h4Var.setLayoutParams(new v4.p0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            h4Var = new org.telegram.ui.Cells.h4(2, 0, this.c, null, false, v60Var.w1 == 2);
        }
        return new cj0(h4Var);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        e1Var.b();
        long B1 = org.telegram.messenger.gj.B1(this.d.x1);
        View view = e1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.h4)) {
            org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
            c7Var.b(B1 == c7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Object object = h4Var.getObject();
            h4Var.c(B1 == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
