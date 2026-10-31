package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class is0 extends s4.u {
    public rs0 d;
    public final /* synthetic */ zt0 e;

    public is0(zt0 zt0Var) {
        this.e = zt0Var;
    }

    @Override // s4.u
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.u
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        s4.g0 adapter = recyclerView.getAdapter();
        wt0 wt0Var = adapter instanceof wt0 ? (wt0) adapter : null;
        if (!k() || wt0Var == null || !wt0Var.M(c1Var.b())) {
            return s4.u.l(0, 0);
        }
        ss0 ss0Var = this.e.m0[0];
        dr0 dr0Var = ss0Var != null ? ss0Var.h : null;
        this.d = dr0Var;
        if (dr0Var != null) {
            dr0Var.setItemAnimator(ss0Var.d);
        }
        return s4.u.l(15, 0);
    }

    @Override // s4.u
    public final boolean k() {
        zt0 zt0Var = this.e;
        if (zt0Var.E1) {
            return true;
        }
        zq0 zq0Var = zt0Var.b0;
        return zq0Var != null && zq0Var.f;
    }

    @Override // s4.u
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        th.x4 x4Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        wt0 wt0Var = adapter instanceof wt0 ? (wt0) adapter : null;
        if (wt0Var == null || !wt0Var.M(c1Var.b()) || !wt0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = wt0Var.D;
        if (!wt0Var.h && (x4Var = wt0Var.s) != null && b10 >= 0 && b10 < x4Var.i.size() && b11 >= 0 && b11 < wt0Var.s.i.size()) {
            if ((wt0Var.s instanceof th.q4) || wt0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < wt0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.jj) wt0Var.s.i.get(i10)).f1()));
                }
            } else {
                arrayList = new ArrayList(wt0Var.s.g);
            }
            if (!wt0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                wt0Var.E = true;
            }
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) wt0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(jjVar.f1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(jjVar.f1()));
            wt0Var.s.C(arrayList, false);
            wt0Var.j(b10, b11);
        }
        return true;
    }

    @Override // s4.u
    public final void p(s4.c1 c1Var, int i10) {
        th.x4 x4Var;
        ArrayList arrayList;
        rs0 rs0Var = this.d;
        if (rs0Var != null && c1Var != null) {
            rs0Var.d1(false);
        }
        if (i10 != 0) {
            rs0 rs0Var2 = this.d;
            if (rs0Var2 != null) {
                rs0Var2.I0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        rs0 rs0Var3 = this.d;
        if (rs0Var3 != null && (rs0Var3.getAdapter() instanceof wt0)) {
            wt0 wt0Var = (wt0) this.d.getAdapter();
            ArrayList arrayList2 = wt0Var.D;
            if (!wt0Var.h && (x4Var = wt0Var.s) != null && wt0Var.E) {
                if ((x4Var instanceof th.q4) || wt0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < wt0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((org.telegram.messenger.jj) wt0Var.s.i.get(i11)).f1()));
                    }
                } else {
                    arrayList = x4Var.g;
                }
                boolean z10 = arrayList2.size() != arrayList.size();
                if (!z10) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        if (arrayList2.get(i12) != arrayList.get(i12)) {
                            z10 = true;
                            break;
                        }
                        i12++;
                    }
                }
                if (z10) {
                    wt0Var.s.C(arrayList, true);
                }
                wt0Var.E = false;
            }
        }
        rs0 rs0Var4 = this.d;
        if (rs0Var4 != null) {
            rs0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.u
    public final void q(s4.c1 c1Var) {
    }
}
