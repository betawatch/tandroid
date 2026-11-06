package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class jr0 extends oj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ xs0 f;

    public jr0(xs0 xs0Var, Context context) {
        this.f = xs0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final void E(boolean z9) {
        xs0 xs0Var = this.f;
        long j3 = xs0Var.l1;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
        if (f2Var == null) {
            return;
        }
        if (org.telegram.messenger.m5.z(j3)) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).M0(Long.valueOf(-j3));
            if (M0 == null || !org.telegram.messenger.t3.V(M0)) {
                return;
            }
        } else if (org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).a2(Long.valueOf(j3)) == null) {
            return;
        }
        org.telegram.messenger.ro L0 = org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).L0(j3);
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
        if (!arrayList.isEmpty() && !org.telegram.messenger.p10.i(f2Var.getCurrentAccount()).q()) {
            i7 = L0.c;
        }
        this.e = i7;
        if (z9) {
            f();
        }
    }

    @Override // v4.g0
    public final int b() {
        return this.d.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return (this.e <= 0 || i7 != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.ui.Cells.g6 g6Var;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.g6)) {
                return;
            } else {
                g6Var = (org.telegram.ui.Cells.g6) view;
            }
        } else if (i10 != 18) {
            g6Var = null;
        } else if (!(view instanceof vr0)) {
            return;
        } else {
            g6Var = ((vr0) view).b;
        }
        org.telegram.ui.Cells.g6 g6Var2 = g6Var;
        if (g6Var2 != null) {
            ArrayList arrayList = this.d;
            g6Var2.x(arrayList.get(i7), null, null, null, false, false);
            g6Var2.M = i7 != arrayList.size() - 1;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View g6Var;
        xs0 xs0Var = this.f;
        if (i7 == 18) {
            org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
            g6Var = new vr0(f2Var == null ? org.telegram.messenger.p10.s0 : f2Var.getCurrentAccount(), this.c, xs0Var.l1 > 0, xs0Var.H1, new ir0(this, 0));
        } else {
            g6Var = new org.telegram.ui.Cells.g6(this.c, xs0Var.H1);
        }
        g6Var.setLayoutParams(new v4.o0(-1, -2));
        return new xi0(g6Var);
    }
}
