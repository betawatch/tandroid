package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class r50 extends pj0 {
    public final /* synthetic */ y50 c;

    public r50(y50 y50Var) {
        this.c = y50Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 3 || i7 == 1;
    }

    public final TLObject E(int i7) {
        y50 y50Var = this.c;
        if (y50Var.d2 == null) {
            return (TLObject) y50Var.V1.get(i7 - y50Var.P1);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) y50Var.e2.get(i7 - y50Var.P1);
        return org.telegram.messenger.m5.E(dialog.id) ? org.telegram.messenger.qp.s1(y50Var.a).a2(Long.valueOf(dialog.id)) : org.telegram.messenger.qp.s1(y50Var.a).M0(Long.valueOf(-dialog.id));
    }

    @Override // v4.g0
    public final int b() {
        return this.c.T1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        y50 y50Var = this.c;
        if (i7 == y50Var.O1) {
            return 1;
        }
        y50Var.getClass();
        if (i7 == 0) {
            return 2;
        }
        if (i7 >= y50Var.P1 && i7 < y50Var.Q1) {
            return 3;
        }
        if (i7 == y50Var.S1) {
            return 4;
        }
        return i7 == y50Var.R1 ? 5 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
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
        TLObject E = E(i7);
        Object object = h4Var.getObject();
        long j3 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        y50 y50Var = this.c;
        h4Var.e(E, null, null, i7 != y50Var.Q1);
        long j10 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j10 != 0) {
            a0.h hVar = y50Var.K1;
            if (hVar == null || hVar.h(j10) < 0) {
                h4Var.c(y50Var.W1.h(j10) >= 0, j3 == j10);
                h4Var.setCheckBoxEnabled(true);
            } else {
                h4Var.c(true, false);
                h4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        if (i7 != 2) {
            y50 y50Var = this.c;
            int i10 = 0;
            if (i7 == 3) {
                view = new org.telegram.ui.Cells.h4(context, 1, 0, y50Var.d2 != null);
            } else if (i7 != 4) {
                View view2 = null;
                boolean z9 = false;
                if (i7 != 5) {
                    org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(context);
                    x4Var.b(R.drawable.msg_link, 7, org.telegram.messenger.id.M0(2131743390, null), true);
                    int i11 = org.telegram.ui.ActionBar.l6.n5;
                    x4Var.a(i11, i11);
                    view = x4Var;
                } else {
                    q50 q50Var = new q50(context, view2, i10, z9 ? 1 : 0, 0);
                    q50Var.setLayoutParams(new v4.o0(-1, -1));
                    q50Var.e.setVisibility(8);
                    org.telegram.ui.yr yrVar = y50Var.d2;
                    xh.l lVar = q50Var.d;
                    if (yrVar != null) {
                        lVar.setText(org.telegram.messenger.id.M0(2131750726, null));
                    } else {
                        lVar.setText(org.telegram.messenger.id.M0(2131748223, null));
                    }
                    q50Var.setAnimateLayoutChange(true);
                    view = q50Var;
                }
            } else {
                view = new View(context);
            }
        } else {
            view = new bi.ec(19, context, this);
        }
        return new yi0(view);
    }
}
