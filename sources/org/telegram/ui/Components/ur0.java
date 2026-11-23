package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ur0 extends dk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ jt0 f;

    public ur0(jt0 jt0Var, Context context) {
        this.f = jt0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(boolean z10) {
        jt0 jt0Var = this.f;
        long j3 = jt0Var.m1;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.y1;
        if (g2Var == null) {
            return;
        }
        if (org.telegram.messenger.n5.z(j3)) {
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(g2Var.getCurrentAccount()).O0(Long.valueOf(-j3));
            if (O0 == null || !org.telegram.messenger.v3.V(O0)) {
                return;
            }
        } else if (org.telegram.messenger.np.u1(g2Var.getCurrentAccount()).c2(Long.valueOf(j3)) == null) {
            return;
        }
        org.telegram.messenger.oo N0 = org.telegram.messenger.np.u1(g2Var.getCurrentAccount()).N0(j3);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i7 = 0;
        if (N0 != null) {
            ArrayList arrayList2 = N0.b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLObject tLObject = (TLObject) arrayList2.get(i10);
                if ((tLObject instanceof TLRPC.Chat) && org.telegram.messenger.v3.r0((TLRPC.Chat) tLObject)) {
                    arrayList.add(tLObject);
                } else {
                    arrayList.add(tLObject);
                }
            }
        }
        if (!arrayList.isEmpty() && !org.telegram.messenger.k10.i(g2Var.getCurrentAccount()).q()) {
            i7 = N0.c;
        }
        this.e = i7;
        if (z10) {
            f();
        }
    }

    @Override // v4.i0
    public final int b() {
        return this.d.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return (this.e <= 0 || i7 != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Cells.h6 h6Var;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.h6)) {
                return;
            } else {
                h6Var = (org.telegram.ui.Cells.h6) view;
            }
        } else if (i10 != 18) {
            h6Var = null;
        } else if (!(view instanceof hs0)) {
            return;
        } else {
            h6Var = ((hs0) view).b;
        }
        org.telegram.ui.Cells.h6 h6Var2 = h6Var;
        if (h6Var2 != null) {
            ArrayList arrayList = this.d;
            h6Var2.x(arrayList.get(i7), null, null, null, false, false);
            h6Var2.N = i7 != arrayList.size() - 1;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View h6Var;
        jt0 jt0Var = this.f;
        if (i7 == 18) {
            org.telegram.ui.ActionBar.g2 g2Var = jt0Var.y1;
            h6Var = new hs0(g2Var == null ? org.telegram.messenger.k10.t0 : g2Var.getCurrentAccount(), this.c, jt0Var.m1 > 0, jt0Var.I1, new cp0(this, 3));
        } else {
            h6Var = new org.telegram.ui.Cells.h6(this.c, jt0Var.I1);
        }
        h6Var.setLayoutParams(new v4.q0(-1, -2));
        return new mj0(h6Var);
    }
}
