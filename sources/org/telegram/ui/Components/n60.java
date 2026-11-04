package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n60 extends sj0 {
    public final Context c;
    public final /* synthetic */ o60 d;

    public n60(o60 o60Var, Context context) {
        this.d = o60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.q1.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        TLObject M0;
        String str;
        View view = d1Var.a;
        o60 o60Var = this.d;
        long C1 = org.telegram.messenger.zi.C1((TLRPC.Peer) o60Var.q1.get(i3));
        if (C1 > 0) {
            M0 = org.telegram.messenger.hp.s1(o60Var.a).a2(Long.valueOf(C1));
            str = org.telegram.messenger.bd.M0(2131743359, null);
        } else {
            M0 = org.telegram.messenger.hp.s1(o60Var.a).M0(Long.valueOf(-C1));
            str = null;
        }
        if (o60Var.t1 == 0) {
            ((org.telegram.ui.Cells.c7) view).c(C1, C1 == org.telegram.messenger.zi.C1(o60Var.u1), null);
        } else {
            ((org.telegram.ui.Cells.h4) view).e(M0, null, str, i3 != b() - 1);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View h4Var;
        o60 o60Var = this.d;
        if (o60Var.t1 == 0) {
            h4Var = new org.telegram.ui.Cells.c7(2, this.c, null);
            h4Var.setLayoutParams(new u4.p0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(100.0f)));
        } else {
            h4Var = new org.telegram.ui.Cells.h4(2, 0, this.c, null, false, o60Var.t1 == 2);
        }
        return new bj0(h4Var);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        d1Var.b();
        long C1 = org.telegram.messenger.zi.C1(this.d.u1);
        View view = d1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.h4)) {
            org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
            c7Var.b(C1 == c7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Object object = h4Var.getObject();
            h4Var.c(C1 == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
