package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g60 extends sk0 {
    public final /* synthetic */ m60 c;

    public g60(m60 m60Var) {
        this.c = m60Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 1;
    }

    public final TLObject E(int i10) {
        m60 m60Var = this.c;
        if (m60Var.d2 == null) {
            return (TLObject) m60Var.V1.get(i10 - m60Var.P1);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) m60Var.e2.get(i10 - m60Var.P1);
        return org.telegram.messenger.o5.E(dialog.id) ? org.telegram.messenger.vp.r1(m60Var.a).Z1(Long.valueOf(dialog.id)) : org.telegram.messenger.vp.r1(m60Var.a).L0(Long.valueOf(-dialog.id));
    }

    @Override // s4.g0
    public final int b() {
        return this.c.T1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        m60 m60Var = this.c;
        if (i10 == m60Var.O1) {
            return 1;
        }
        m60Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= m60Var.P1 && i10 < m60Var.Q1) {
            return 3;
        }
        if (i10 == m60Var.S1) {
            return 4;
        }
        return i10 == m60Var.R1 ? 5 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 2) {
            view.requestLayout();
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
        TLObject E = E(i10);
        Object object = j4Var.getObject();
        long j10 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        m60 m60Var = this.c;
        j4Var.e(E, null, null, i10 != m60Var.Q1);
        long j11 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j11 != 0) {
            a0.h hVar = m60Var.K1;
            if (hVar == null || hVar.h(j11) < 0) {
                j4Var.c(m60Var.W1.h(j11) >= 0, j10 == j11);
                j4Var.setCheckBoxEnabled(true);
            } else {
                j4Var.c(true, false);
                j4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            m60 m60Var = this.c;
            int i11 = 0;
            if (i10 == 3) {
                view = new org.telegram.ui.Cells.j4(context, 1, 0, m60Var.d2 != null);
            } else if (i10 != 4) {
                View view2 = null;
                boolean z10 = false;
                if (i10 != 5) {
                    org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(context);
                    b5Var.b(R.drawable.msg_link, 7, org.telegram.messenger.cd.L0(2131743416, null), true);
                    int i12 = org.telegram.ui.ActionBar.t6.n5;
                    b5Var.a(i12, i12);
                    view = b5Var;
                } else {
                    f60 f60Var = new f60(context, view2, i11, z10 ? 1 : 0, 0);
                    f60Var.setLayoutParams(new s4.o0(-1, -1));
                    f60Var.e.setVisibility(8);
                    org.telegram.ui.tt ttVar = m60Var.d2;
                    nh.p pVar = f60Var.d;
                    if (ttVar != null) {
                        pVar.setText(org.telegram.messenger.cd.L0(2131750727, null));
                    } else {
                        pVar.setText(org.telegram.messenger.cd.L0(2131748240, null));
                    }
                    f60Var.setAnimateLayoutChange(true);
                    view = f60Var;
                }
            } else {
                view = new View(context);
            }
        } else {
            view = new bi.t0(this, context, 14);
        }
        return new ck0(view);
    }
}
