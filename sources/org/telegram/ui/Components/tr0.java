package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class tr0 extends dk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ it0 f;

    public tr0(it0 it0Var, Context context) {
        this.f = it0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(boolean z10) {
        it0 it0Var = this.f;
        long j3 = it0Var.m1;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
        if (g2Var == null) {
            return;
        }
        if (org.telegram.messenger.n5.z(j3)) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(g2Var.getCurrentAccount()).O0(Long.valueOf(-j3));
            if (O0 == null || !org.telegram.messenger.v3.V(O0)) {
                return;
            }
        } else if (org.telegram.messenger.mp.u1(g2Var.getCurrentAccount()).c2(Long.valueOf(j3)) == null) {
            return;
        }
        org.telegram.messenger.no N0 = org.telegram.messenger.mp.u1(g2Var.getCurrentAccount()).N0(j3);
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
        if (!arrayList.isEmpty() && !org.telegram.messenger.i10.i(g2Var.getCurrentAccount()).q()) {
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
        org.telegram.ui.Cells.g6 g6Var;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.g6)) {
                return;
            } else {
                g6Var = (org.telegram.ui.Cells.g6) view;
            }
        } else if (i10 != 18) {
            g6Var = null;
        } else if (!(view instanceof gs0)) {
            return;
        } else {
            g6Var = ((gs0) view).b;
        }
        org.telegram.ui.Cells.g6 g6Var2 = g6Var;
        if (g6Var2 != null) {
            ArrayList arrayList = this.d;
            g6Var2.z(arrayList.get(i7), null, null, null, false, false);
            g6Var2.N = i7 != arrayList.size() - 1;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View g6Var;
        it0 it0Var = this.f;
        if (i7 == 18) {
            org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
            g6Var = new gs0(g2Var == null ? org.telegram.messenger.i10.t0 : g2Var.getCurrentAccount(), this.c, it0Var.m1 > 0, it0Var.I1, new bp0(this, 3));
        } else {
            g6Var = new org.telegram.ui.Cells.g6(this.c, it0Var.I1);
        }
        g6Var.setLayoutParams(new v4.q0(-1, -2));
        return new mj0(g6Var);
    }
}
