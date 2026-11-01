package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class js0 extends s4.u {
    public ss0 d;
    public final /* synthetic */ au0 e;

    public js0(au0 au0Var) {
        this.e = au0Var;
    }

    @Override // s4.u
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.u
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        s4.g0 adapter = recyclerView.getAdapter();
        xt0 xt0Var = adapter instanceof xt0 ? (xt0) adapter : null;
        if (!k() || xt0Var == null || !xt0Var.M(c1Var.b())) {
            return s4.u.l(0, 0);
        }
        ts0 ts0Var = this.e.m0[0];
        er0 er0Var = ts0Var != null ? ts0Var.h : null;
        this.d = er0Var;
        if (er0Var != null) {
            er0Var.setItemAnimator(ts0Var.d);
        }
        return s4.u.l(15, 0);
    }

    @Override // s4.u
    public final boolean k() {
        au0 au0Var = this.e;
        if (au0Var.E1) {
            return true;
        }
        ar0 ar0Var = au0Var.b0;
        return ar0Var != null && ar0Var.f;
    }

    @Override // s4.u
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        th.x4 x4Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        xt0 xt0Var = adapter instanceof xt0 ? (xt0) adapter : null;
        if (xt0Var == null || !xt0Var.M(c1Var.b()) || !xt0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = xt0Var.D;
        if (!xt0Var.h && (x4Var = xt0Var.s) != null && b10 >= 0 && b10 < x4Var.i.size() && b11 >= 0 && b11 < xt0Var.s.i.size()) {
            if ((xt0Var.s instanceof th.q4) || xt0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < xt0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.kj) xt0Var.s.i.get(i10)).f1()));
                }
            } else {
                arrayList = new ArrayList(xt0Var.s.g);
            }
            if (!xt0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                xt0Var.E = true;
            }
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) xt0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(kjVar.f1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(kjVar.f1()));
            xt0Var.s.C(arrayList, false);
            xt0Var.j(b10, b11);
        }
        return true;
    }

    @Override // s4.u
    public final void p(s4.c1 c1Var, int i10) {
        th.x4 x4Var;
        ArrayList arrayList;
        ss0 ss0Var = this.d;
        if (ss0Var != null && c1Var != null) {
            ss0Var.d1(false);
        }
        if (i10 != 0) {
            ss0 ss0Var2 = this.d;
            if (ss0Var2 != null) {
                ss0Var2.I0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        ss0 ss0Var3 = this.d;
        if (ss0Var3 != null && (ss0Var3.getAdapter() instanceof xt0)) {
            xt0 xt0Var = (xt0) this.d.getAdapter();
            ArrayList arrayList2 = xt0Var.D;
            if (!xt0Var.h && (x4Var = xt0Var.s) != null && xt0Var.E) {
                if ((x4Var instanceof th.q4) || xt0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < xt0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((org.telegram.messenger.kj) xt0Var.s.i.get(i11)).f1()));
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
                    xt0Var.s.C(arrayList, true);
                }
                xt0Var.E = false;
            }
        }
        ss0 ss0Var4 = this.d;
        if (ss0Var4 != null) {
            ss0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.u
    public final void q(s4.c1 c1Var) {
    }
}
