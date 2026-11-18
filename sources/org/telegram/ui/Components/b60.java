package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b60 extends bk0 {
    public final /* synthetic */ j60 c;

    public b60(j60 j60Var) {
        this.c = j60Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 3 || i7 == 1;
    }

    public final TLObject E(int i7) {
        j60 j60Var = this.c;
        if (j60Var.h2 == null) {
            return (TLObject) j60Var.Z1.get(i7 - j60Var.T1);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) j60Var.i2.get(i7 - j60Var.T1);
        return org.telegram.messenger.n5.E(dialog.id) ? org.telegram.messenger.mp.u1(j60Var.a).c2(Long.valueOf(dialog.id)) : org.telegram.messenger.mp.u1(j60Var.a).O0(Long.valueOf(-dialog.id));
    }

    @Override // v4.i0
    public final int b() {
        return this.c.X1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        j60 j60Var = this.c;
        if (i7 == j60Var.S1) {
            return 1;
        }
        j60Var.getClass();
        if (i7 == 0) {
            return 2;
        }
        if (i7 >= j60Var.T1 && i7 < j60Var.U1) {
            return 3;
        }
        if (i7 == j60Var.W1) {
            return 4;
        }
        return i7 == j60Var.V1 ? 5 : 0;
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
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        TLObject E = E(i7);
        Object object = h4Var.getObject();
        long j3 = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
        j60 j60Var = this.c;
        h4Var.e(E, null, null, i7 != j60Var.U1);
        long j10 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
        if (j10 != 0) {
            a0.h hVar = j60Var.O1;
            if (hVar == null || hVar.h(j10) < 0) {
                h4Var.c(j60Var.a2.h(j10) >= 0, j3 == j10);
                h4Var.setCheckBoxEnabled(true);
            } else {
                h4Var.c(true, false);
                h4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        if (i7 != 2) {
            j60 j60Var = this.c;
            int i10 = 0;
            if (i7 == 3) {
                view = new org.telegram.ui.Cells.h4(context, 1, 0, j60Var.h2 != null);
            } else if (i7 != 4) {
                View view2 = null;
                boolean z10 = false;
                if (i7 != 5) {
                    org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(context);
                    x4Var.b(R.drawable.msg_link, 7, org.telegram.messenger.gd.M0(2131743153, null), true);
                    int i11 = org.telegram.ui.ActionBar.n6.n5;
                    x4Var.a(i11, i11);
                    view = x4Var;
                } else {
                    a60 a60Var = new a60(context, view2, i10, z10 ? 1 : 0, 0);
                    a60Var.setLayoutParams(new v4.q0(-1, -1));
                    a60Var.e.setVisibility(8);
                    org.telegram.ui.zr zrVar = j60Var.h2;
                    xh.l lVar = a60Var.d;
                    if (zrVar != null) {
                        lVar.setText(org.telegram.messenger.gd.M0(2131750715, null));
                    } else {
                        lVar.setText(org.telegram.messenger.gd.M0(2131748031, null));
                    }
                    a60Var.setAnimateLayoutChange(true);
                    view = a60Var;
                }
            } else {
                view = new View(context);
            }
        } else {
            view = new bi.i3(20, context, this);
        }
        return new kj0(view);
    }
}
