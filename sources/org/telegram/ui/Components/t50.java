package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class t50 extends tj0 {
    public final /* synthetic */ a60 c;

    public t50(a60 a60Var) {
        this.c = a60Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 3 || i7 == 1;
    }

    public final TLObject E(int i7) {
        a60 a60Var = this.c;
        if (a60Var.h2 == null) {
            return (TLObject) a60Var.Z1.get(i7 - a60Var.T1);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) a60Var.i2.get(i7 - a60Var.T1);
        return org.telegram.messenger.m5.E(dialog.id) ? org.telegram.messenger.np.s1(a60Var.a).a2(Long.valueOf(dialog.id)) : org.telegram.messenger.np.s1(a60Var.a).M0(Long.valueOf(-dialog.id));
    }

    @Override // v4.h0
    public final int b() {
        return this.c.X1;
    }

    @Override // v4.h0
    public final int d(int i7) {
        a60 a60Var = this.c;
        if (i7 == a60Var.S1) {
            return 1;
        }
        a60Var.getClass();
        if (i7 == 0) {
            return 2;
        }
        if (i7 >= a60Var.T1 && i7 < a60Var.U1) {
            return 3;
        }
        if (i7 == a60Var.W1) {
            return 4;
        }
        return i7 == a60Var.V1 ? 5 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 == 2) {
            view.requestLayout();
            return;
        }
        if (i10 != 3) {
            return;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        TLObject E = E(i7);
        Object object = h4Var.getObject();
        long j3 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        a60 a60Var = this.c;
        h4Var.e(E, null, null, i7 != a60Var.U1);
        long j10 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j10 != 0) {
            a0.h hVar = a60Var.O1;
            if (hVar == null || hVar.h(j10) < 0) {
                h4Var.c(a60Var.a2.h(j10) >= 0, j3 == j10);
                h4Var.setCheckBoxEnabled(true);
            } else {
                h4Var.c(true, false);
                h4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        if (i7 != 2) {
            a60 a60Var = this.c;
            int i10 = 0;
            if (i7 == 3) {
                view = new org.telegram.ui.Cells.h4(context, 1, 0, a60Var.h2 != null);
            } else if (i7 != 4) {
                View view2 = null;
                boolean z10 = false;
                if (i7 != 5) {
                    org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(context);
                    x4Var.b(R.drawable.msg_link, 7, org.telegram.messenger.hd.M0(2131743390, null), true);
                    int i11 = org.telegram.ui.ActionBar.j6.n5;
                    x4Var.a(i11, i11);
                    view = x4Var;
                } else {
                    s50 s50Var = new s50(context, view2, i10, z10 ? 1 : 0, 0);
                    s50Var.setLayoutParams(new v4.p0(-1, -1));
                    s50Var.e.setVisibility(8);
                    org.telegram.ui.zr zrVar = a60Var.h2;
                    xh.l lVar = s50Var.d;
                    if (zrVar != null) {
                        lVar.setText(org.telegram.messenger.hd.M0(2131750726, null));
                    } else {
                        lVar.setText(org.telegram.messenger.hd.M0(2131748223, null));
                    }
                    s50Var.setAnimateLayoutChange(true);
                    view = s50Var;
                }
            } else {
                view = new View(context);
            }
        } else {
            view = new bi.o2(20, context, this);
        }
        return new cj0(view);
    }
}
