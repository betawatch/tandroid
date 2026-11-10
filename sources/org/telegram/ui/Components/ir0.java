package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ir0 extends v4.v {
    public sr0 d;
    public final /* synthetic */ ys0 e;

    public ir0(ys0 ys0Var) {
        this.e = ys0Var;
    }

    @Override // v4.v
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        v4.g0 adapter = recyclerView.getAdapter();
        vs0 vs0Var = adapter instanceof vs0 ? (vs0) adapter : null;
        if (!k() || vs0Var == null || !vs0Var.M(d1Var.b())) {
            return v4.v.l(0, 0);
        }
        tr0 tr0Var = this.e.m0[0];
        cq0 cq0Var = tr0Var != null ? tr0Var.h : null;
        this.d = cq0Var;
        if (cq0Var != null) {
            cq0Var.setItemAnimator(tr0Var.d);
        }
        return v4.v.l(15, 0);
    }

    @Override // v4.v
    public final boolean k() {
        ys0 ys0Var = this.e;
        if (ys0Var.E1) {
            return true;
        }
        yp0 yp0Var = ys0Var.b0;
        return yp0Var != null && yp0Var.f;
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        di.r6 r6Var;
        ArrayList arrayList;
        v4.g0 adapter = recyclerView.getAdapter();
        vs0 vs0Var = adapter instanceof vs0 ? (vs0) adapter : null;
        if (vs0Var == null || !vs0Var.M(d1Var.b()) || !vs0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = vs0Var.D;
        if (!vs0Var.h && (r6Var = vs0Var.s) != null && b10 >= 0 && b10 < r6Var.i.size() && b11 >= 0 && b11 < vs0Var.s.i.size()) {
            if ((vs0Var.s instanceof di.k6) || vs0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < vs0Var.s.i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.ij) vs0Var.s.i.get(i7)).e1()));
                }
            } else {
                arrayList = new ArrayList(vs0Var.s.g);
            }
            if (!vs0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                vs0Var.E = true;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) vs0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(ijVar.e1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(ijVar.e1()));
            vs0Var.s.C(arrayList, false);
            vs0Var.j(b10, b11);
        }
        return true;
    }

    @Override // v4.v
    public final void p(v4.d1 d1Var, int i7) {
        di.r6 r6Var;
        ArrayList arrayList;
        sr0 sr0Var = this.d;
        if (sr0Var != null && d1Var != null) {
            sr0Var.d1(false);
        }
        if (i7 != 0) {
            sr0 sr0Var2 = this.d;
            if (sr0Var2 != null) {
                sr0Var2.I0(false);
            }
            if (d1Var != null) {
                d1Var.a.setPressed(true);
                return;
            }
            return;
        }
        sr0 sr0Var3 = this.d;
        if (sr0Var3 != null && (sr0Var3.getAdapter() instanceof vs0)) {
            vs0 vs0Var = (vs0) this.d.getAdapter();
            ArrayList arrayList2 = vs0Var.D;
            if (!vs0Var.h && (r6Var = vs0Var.s) != null && vs0Var.E) {
                if ((r6Var instanceof di.k6) || vs0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < vs0Var.s.i.size(); i10++) {
                        arrayList.add(Integer.valueOf(((org.telegram.messenger.ij) vs0Var.s.i.get(i10)).e1()));
                    }
                } else {
                    arrayList = r6Var.g;
                }
                boolean z9 = arrayList2.size() != arrayList.size();
                if (!z9) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList2.size()) {
                            break;
                        }
                        if (arrayList2.get(i11) != arrayList.get(i11)) {
                            z9 = true;
                            break;
                        }
                        i11++;
                    }
                }
                if (z9) {
                    vs0Var.s.C(arrayList, true);
                }
                vs0Var.E = false;
            }
        }
        sr0 sr0Var4 = this.d;
        if (sr0Var4 != null) {
            sr0Var4.setItemAnimator(null);
        }
    }

    @Override // v4.v
    public final void q(v4.d1 d1Var) {
    }
}
