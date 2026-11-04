package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n50 extends sj0 {
    public final /* synthetic */ t50 c;

    public n50(t50 t50Var) {
        this.c = t50Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 3 || i3 == 1;
    }

    public final TLObject E(int i3) {
        t50 t50Var = this.c;
        if (t50Var.e2 == null) {
            return (TLObject) t50Var.W1.get(i3 - t50Var.Q1);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) t50Var.f2.get(i3 - t50Var.Q1);
        return org.telegram.messenger.m5.E(dialog.id) ? org.telegram.messenger.hp.s1(t50Var.a).a2(Long.valueOf(dialog.id)) : org.telegram.messenger.hp.s1(t50Var.a).M0(Long.valueOf(-dialog.id));
    }

    @Override // u4.h0
    public final int b() {
        return this.c.U1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        t50 t50Var = this.c;
        if (i3 == t50Var.P1) {
            return 1;
        }
        t50Var.getClass();
        if (i3 == 0) {
            return 2;
        }
        if (i3 >= t50Var.Q1 && i3 < t50Var.R1) {
            return 3;
        }
        if (i3 == t50Var.T1) {
            return 4;
        }
        return i3 == t50Var.S1 ? 5 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 2) {
            view.requestLayout();
            return;
        }
        if (i10 != 3) {
            return;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        TLObject E = E(i3);
        Object object = h4Var.getObject();
        long j10 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        t50 t50Var = this.c;
        h4Var.e(E, null, null, i3 != t50Var.R1);
        long j11 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j11 != 0) {
            a0.h hVar = t50Var.L1;
            if (hVar == null || hVar.h(j11) < 0) {
                h4Var.c(t50Var.X1.h(j11) >= 0, j10 == j11);
                h4Var.setCheckBoxEnabled(true);
            } else {
                h4Var.c(true, false);
                h4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        Context context = viewGroup.getContext();
        if (i3 != 2) {
            t50 t50Var = this.c;
            int i10 = 0;
            if (i3 == 3) {
                view = new org.telegram.ui.Cells.h4(context, 1, 0, t50Var.e2 != null);
            } else if (i3 != 4) {
                View view2 = null;
                boolean z10 = false;
                if (i3 != 5) {
                    org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(context);
                    x4Var.b(R.drawable.msg_link, 7, org.telegram.messenger.bd.M0(2131743400, null), true);
                    int i11 = org.telegram.ui.ActionBar.k6.n5;
                    x4Var.a(i11, i11);
                    view = x4Var;
                } else {
                    m50 m50Var = new m50(context, view2, i10, z10 ? 1 : 0, 0);
                    m50Var.setLayoutParams(new u4.p0(-1, -1));
                    m50Var.e.setVisibility(8);
                    org.telegram.ui.ur urVar = t50Var.e2;
                    yh.l lVar = m50Var.d;
                    if (urVar != null) {
                        lVar.setText(org.telegram.messenger.bd.M0(2131750727, null));
                    } else {
                        lVar.setText(org.telegram.messenger.bd.M0(2131748231, null));
                    }
                    m50Var.setAnimateLayoutChange(true);
                    view = m50Var;
                }
            } else {
                view = new View(context);
            }
        } else {
            view = new ai.x2(20, context, this);
        }
        return new bj0(view);
    }
}
