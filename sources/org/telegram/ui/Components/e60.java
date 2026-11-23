package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class e60 extends dk0 {
    public final /* synthetic */ l60 c;

    public e60(l60 l60Var) {
        this.c = l60Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 3 || i7 == 1;
    }

    public final TLObject E(int i7) {
        l60 l60Var = this.c;
        if (l60Var.h2 == null) {
            return (TLObject) l60Var.Z1.get(i7 - l60Var.T1);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) l60Var.i2.get(i7 - l60Var.T1);
        return org.telegram.messenger.n5.E(dialog.id) ? org.telegram.messenger.np.u1(l60Var.a).c2(Long.valueOf(dialog.id)) : org.telegram.messenger.np.u1(l60Var.a).O0(Long.valueOf(-dialog.id));
    }

    @Override // v4.i0
    public final int b() {
        return this.c.X1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        l60 l60Var = this.c;
        if (i7 == l60Var.S1) {
            return 1;
        }
        l60Var.getClass();
        if (i7 == 0) {
            return 2;
        }
        if (i7 >= l60Var.T1 && i7 < l60Var.U1) {
            return 3;
        }
        if (i7 == l60Var.W1) {
            return 4;
        }
        return i7 == l60Var.V1 ? 5 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 2) {
            view.requestLayout();
            return;
        }
        if (i10 != 3) {
            return;
        }
        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
        TLObject E = E(i7);
        Object object = i4Var.getObject();
        long j3 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        l60 l60Var = this.c;
        i4Var.e(E, null, null, i7 != l60Var.U1);
        long j10 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j10 != 0) {
            a0.h hVar = l60Var.O1;
            if (hVar == null || hVar.h(j10) < 0) {
                i4Var.c(l60Var.a2.h(j10) >= 0, j3 == j10);
                i4Var.setCheckBoxEnabled(true);
            } else {
                i4Var.c(true, false);
                i4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        if (i7 != 2) {
            l60 l60Var = this.c;
            int i10 = 0;
            if (i7 == 3) {
                view = new org.telegram.ui.Cells.i4(context, 1, 0, l60Var.h2 != null);
            } else if (i7 != 4) {
                View view2 = null;
                boolean z10 = false;
                if (i7 != 5) {
                    org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(context);
                    y4Var.b(R.drawable.msg_link, 7, org.telegram.messenger.hd.N0(2131743145, null), true);
                    int i11 = org.telegram.ui.ActionBar.m6.n5;
                    y4Var.a(i11, i11);
                    view = y4Var;
                } else {
                    d60 d60Var = new d60(context, view2, i10, z10 ? 1 : 0, 0);
                    d60Var.setLayoutParams(new v4.q0(-1, -1));
                    d60Var.e.setVisibility(8);
                    org.telegram.ui.zr zrVar = l60Var.h2;
                    xh.l lVar = d60Var.d;
                    if (zrVar != null) {
                        lVar.setText(org.telegram.messenger.hd.N0(2131750714, null));
                    } else {
                        lVar.setText(org.telegram.messenger.hd.N0(2131748030, null));
                    }
                    d60Var.setAnimateLayoutChange(true);
                    view = d60Var;
                }
            } else {
                view = new View(context);
            }
        } else {
            view = new bi.m3(20, context, this);
        }
        return new mj0(view);
    }
}
