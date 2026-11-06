package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class hr0 extends v4.v {
    public rr0 d;
    public final /* synthetic */ xs0 e;

    public hr0(xs0 xs0Var) {
        this.e = xs0Var;
    }

    @Override // v4.v
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        v4.g0 adapter = recyclerView.getAdapter();
        us0 us0Var = adapter instanceof us0 ? (us0) adapter : null;
        if (!k() || us0Var == null || !us0Var.M(d1Var.b())) {
            return v4.v.l(0, 0);
        }
        sr0 sr0Var = this.e.m0[0];
        cq0 cq0Var = sr0Var != null ? sr0Var.h : null;
        this.d = cq0Var;
        if (cq0Var != null) {
            cq0Var.setItemAnimator(sr0Var.d);
        }
        return v4.v.l(15, 0);
    }

    @Override // v4.v
    public final boolean k() {
        xs0 xs0Var = this.e;
        if (xs0Var.E1) {
            return true;
        }
        yp0 yp0Var = xs0Var.b0;
        return yp0Var != null && yp0Var.f;
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        di.q6 q6Var;
        ArrayList arrayList;
        v4.g0 adapter = recyclerView.getAdapter();
        us0 us0Var = adapter instanceof us0 ? (us0) adapter : null;
        if (us0Var == null || !us0Var.M(d1Var.b()) || !us0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = us0Var.D;
        if (!us0Var.h && (q6Var = us0Var.s) != null && b10 >= 0 && b10 < q6Var.i.size() && b11 >= 0 && b11 < us0Var.s.i.size()) {
            if ((us0Var.s instanceof di.j6) || us0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < us0Var.s.i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.ij) us0Var.s.i.get(i7)).f1()));
                }
            } else {
                arrayList = new ArrayList(us0Var.s.g);
            }
            if (!us0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                us0Var.E = true;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) us0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(ijVar.f1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(ijVar.f1()));
            us0Var.s.C(arrayList, false);
            us0Var.j(b10, b11);
        }
        return true;
    }

    @Override // v4.v
    public final void p(v4.d1 d1Var, int i7) {
        di.q6 q6Var;
        ArrayList arrayList;
        rr0 rr0Var = this.d;
        if (rr0Var != null && d1Var != null) {
            rr0Var.d1(false);
        }
        if (i7 != 0) {
            rr0 rr0Var2 = this.d;
            if (rr0Var2 != null) {
                rr0Var2.I0(false);
            }
            if (d1Var != null) {
                d1Var.a.setPressed(true);
                return;
            }
            return;
        }
        rr0 rr0Var3 = this.d;
        if (rr0Var3 != null && (rr0Var3.getAdapter() instanceof us0)) {
            us0 us0Var = (us0) this.d.getAdapter();
            ArrayList arrayList2 = us0Var.D;
            if (!us0Var.h && (q6Var = us0Var.s) != null && us0Var.E) {
                if ((q6Var instanceof di.j6) || us0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < us0Var.s.i.size(); i10++) {
                        arrayList.add(Integer.valueOf(((org.telegram.messenger.ij) us0Var.s.i.get(i10)).f1()));
                    }
                } else {
                    arrayList = q6Var.g;
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
                    us0Var.s.C(arrayList, true);
                }
                us0Var.E = false;
            }
        }
        rr0 rr0Var4 = this.d;
        if (rr0Var4 != null) {
            rr0Var4.setItemAnimator(null);
        }
    }

    @Override // v4.v
    public final void q(v4.d1 d1Var) {
    }
}
