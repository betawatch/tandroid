package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class js0 extends sk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ zt0 f;

    public js0(zt0 zt0Var, Context context) {
        this.f = zt0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(boolean z10) {
        zt0 zt0Var = this.f;
        long j10 = zt0Var.l1;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
        if (k2Var == null) {
            return;
        }
        if (org.telegram.messenger.o5.z(j10)) {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).L0(Long.valueOf(-j10));
            if (L0 == null || !org.telegram.messenger.w3.V(L0)) {
                return;
            }
        } else if (org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).Z1(Long.valueOf(j10)) == null) {
            return;
        }
        org.telegram.messenger.wo K0 = org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).K0(j10);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        if (K0 != null) {
            ArrayList arrayList2 = K0.b;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TLObject tLObject = (TLObject) arrayList2.get(i11);
                if ((tLObject instanceof TLRPC.Chat) && org.telegram.messenger.w3.r0((TLRPC.Chat) tLObject)) {
                    arrayList.add(tLObject);
                } else {
                    arrayList.add(tLObject);
                }
            }
        }
        if (!arrayList.isEmpty() && !org.telegram.messenger.d20.i(k2Var.getCurrentAccount()).q()) {
            i10 = K0.c;
        }
        this.e = i10;
        if (z10) {
            f();
        }
    }

    @Override // s4.g0
    public final int b() {
        return this.d.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return (this.e <= 0 || i10 != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.k6 k6Var;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.k6)) {
                return;
            } else {
                k6Var = (org.telegram.ui.Cells.k6) view;
            }
        } else if (i11 != 18) {
            k6Var = null;
        } else if (!(view instanceof vs0)) {
            return;
        } else {
            k6Var = ((vs0) view).b;
        }
        org.telegram.ui.Cells.k6 k6Var2 = k6Var;
        if (k6Var2 != null) {
            ArrayList arrayList = this.d;
            k6Var2.z(arrayList.get(i10), null, null, null, false, false);
            k6Var2.M = i10 != arrayList.size() - 1;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View k6Var;
        zt0 zt0Var = this.f;
        if (i10 == 18) {
            org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
            k6Var = new vs0(k2Var == null ? org.telegram.messenger.d20.s0 : k2Var.getCurrentAccount(), this.c, zt0Var.l1 > 0, zt0Var.H1, new uo0(this, 5));
        } else {
            k6Var = new org.telegram.ui.Cells.k6(this.c, zt0Var.H1);
        }
        k6Var.setLayoutParams(new s4.o0(-1, -2));
        return new ck0(k6Var);
    }
}
