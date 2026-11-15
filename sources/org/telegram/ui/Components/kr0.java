package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class kr0 extends tj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ ys0 f;

    public kr0(ys0 ys0Var, Context context) {
        this.f = ys0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final void E(boolean z10) {
        ys0 ys0Var = this.f;
        long j3 = ys0Var.m1;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
        if (e2Var == null) {
            return;
        }
        if (org.telegram.messenger.m5.z(j3)) {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).M0(Long.valueOf(-j3));
            if (M0 == null || !org.telegram.messenger.t3.V(M0)) {
                return;
            }
        } else if (org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).a2(Long.valueOf(j3)) == null) {
            return;
        }
        org.telegram.messenger.oo L0 = org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).L0(j3);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i7 = 0;
        if (L0 != null) {
            ArrayList arrayList2 = L0.b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLObject tLObject = (TLObject) arrayList2.get(i10);
                if ((tLObject instanceof TLRPC.Chat) && org.telegram.messenger.t3.r0((TLRPC.Chat) tLObject)) {
                    arrayList.add(tLObject);
                } else {
                    arrayList.add(tLObject);
                }
            }
        }
        if (!arrayList.isEmpty() && !org.telegram.messenger.m10.i(e2Var.getCurrentAccount()).q()) {
            i7 = L0.c;
        }
        this.e = i7;
        if (z10) {
            f();
        }
    }

    @Override // v4.h0
    public final int b() {
        return this.d.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return (this.e <= 0 || i7 != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        org.telegram.ui.Cells.f6 f6Var;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.f6)) {
                return;
            } else {
                f6Var = (org.telegram.ui.Cells.f6) view;
            }
        } else if (i10 != 18) {
            f6Var = null;
        } else if (!(view instanceof wr0)) {
            return;
        } else {
            f6Var = ((wr0) view).b;
        }
        org.telegram.ui.Cells.f6 f6Var2 = f6Var;
        if (f6Var2 != null) {
            ArrayList arrayList = this.d;
            f6Var2.x(arrayList.get(i7), null, null, null, false, false);
            f6Var2.N = i7 != arrayList.size() - 1;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View f6Var;
        ys0 ys0Var = this.f;
        if (i7 == 18) {
            org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
            f6Var = new wr0(e2Var == null ? org.telegram.messenger.m10.t0 : e2Var.getCurrentAccount(), this.c, ys0Var.m1 > 0, ys0Var.I1, new ro0(this, 3));
        } else {
            f6Var = new org.telegram.ui.Cells.f6(this.c, ys0Var.I1);
        }
        f6Var.setLayoutParams(new v4.p0(-1, -2));
        return new cj0(f6Var);
    }
}
