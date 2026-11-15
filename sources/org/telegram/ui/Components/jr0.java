package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jr0 extends v4.v {
    public sr0 d;
    public final /* synthetic */ ys0 e;

    public jr0(ys0 ys0Var) {
        this.e = ys0Var;
    }

    @Override // v4.v
    public final void a(RecyclerView recyclerView, v4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.a.setPressed(false);
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, v4.e1 e1Var) {
        v4.h0 adapter = recyclerView.getAdapter();
        vs0 vs0Var = adapter instanceof vs0 ? (vs0) adapter : null;
        if (!k() || vs0Var == null || !vs0Var.M(e1Var.b())) {
            return v4.v.l(0, 0);
        }
        tr0 tr0Var = this.e.n0[0];
        dq0 dq0Var = tr0Var != null ? tr0Var.h : null;
        this.d = dq0Var;
        if (dq0Var != null) {
            dq0Var.setItemAnimator(tr0Var.d);
        }
        return v4.v.l(15, 0);
    }

    @Override // v4.v
    public final boolean k() {
        ys0 ys0Var = this.e;
        if (ys0Var.F1) {
            return true;
        }
        zp0 zp0Var = ys0Var.c0;
        return zp0Var != null && zp0Var.f;
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        fi.k6 k6Var;
        ArrayList arrayList;
        v4.h0 adapter = recyclerView.getAdapter();
        vs0 vs0Var = adapter instanceof vs0 ? (vs0) adapter : null;
        if (vs0Var == null || !vs0Var.M(e1Var.b()) || !vs0Var.M(e1Var2.b())) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        ArrayList arrayList2 = vs0Var.E;
        if (!vs0Var.h && (k6Var = vs0Var.s) != null && b10 >= 0 && b10 < k6Var.i.size() && b11 >= 0 && b11 < vs0Var.s.i.size()) {
            if ((vs0Var.s instanceof fi.c6) || vs0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < vs0Var.s.i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.gj) vs0Var.s.i.get(i7)).e1()));
                }
            } else {
                arrayList = new ArrayList(vs0Var.s.g);
            }
            if (!vs0Var.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                vs0Var.F = true;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) vs0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(gjVar.e1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(gjVar.e1()));
            vs0Var.s.C(arrayList, false);
            vs0Var.j(b10, b11);
        }
        return true;
    }

    @Override // v4.v
    public final void p(v4.e1 e1Var, int i7) {
        fi.k6 k6Var;
        ArrayList arrayList;
        sr0 sr0Var = this.d;
        if (sr0Var != null && e1Var != null) {
            sr0Var.d1(false);
        }
        if (i7 != 0) {
            sr0 sr0Var2 = this.d;
            if (sr0Var2 != null) {
                sr0Var2.I0(false);
            }
            if (e1Var != null) {
                e1Var.a.setPressed(true);
                return;
            }
            return;
        }
        sr0 sr0Var3 = this.d;
        if (sr0Var3 != null && (sr0Var3.getAdapter() instanceof vs0)) {
            vs0 vs0Var = (vs0) this.d.getAdapter();
            ArrayList arrayList2 = vs0Var.E;
            if (!vs0Var.h && (k6Var = vs0Var.s) != null && vs0Var.F) {
                if ((k6Var instanceof fi.c6) || vs0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < vs0Var.s.i.size(); i10++) {
                        arrayList.add(Integer.valueOf(((org.telegram.messenger.gj) vs0Var.s.i.get(i10)).e1()));
                    }
                } else {
                    arrayList = k6Var.g;
                }
                boolean z10 = arrayList2.size() != arrayList.size();
                if (!z10) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList2.size()) {
                            break;
                        }
                        if (arrayList2.get(i11) != arrayList.get(i11)) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                }
                if (z10) {
                    vs0Var.s.C(arrayList, true);
                }
                vs0Var.F = false;
            }
        }
        sr0 sr0Var4 = this.d;
        if (sr0Var4 != null) {
            sr0Var4.setItemAnimator(null);
        }
    }

    @Override // v4.v
    public final void q(v4.e1 e1Var) {
    }
}
