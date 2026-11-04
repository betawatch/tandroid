package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hr0 extends u4.v {
    public qr0 d;
    public final /* synthetic */ ws0 e;

    public hr0(ws0 ws0Var) {
        this.e = ws0Var;
    }

    @Override // u4.v
    public final void a(RecyclerView recyclerView, u4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // u4.v
    public final int e(RecyclerView recyclerView, u4.d1 d1Var) {
        u4.h0 adapter = recyclerView.getAdapter();
        ts0 ts0Var = adapter instanceof ts0 ? (ts0) adapter : null;
        if (!k() || ts0Var == null || !ts0Var.M(d1Var.b())) {
            return u4.v.l(0, 0);
        }
        rr0 rr0Var = this.e.n0[0];
        cq0 cq0Var = rr0Var != null ? rr0Var.h : null;
        this.d = cq0Var;
        if (cq0Var != null) {
            cq0Var.setItemAnimator(rr0Var.d);
        }
        return u4.v.l(15, 0);
    }

    @Override // u4.v
    public final boolean k() {
        ws0 ws0Var = this.e;
        if (ws0Var.F1) {
            return true;
        }
        yp0 yp0Var = ws0Var.c0;
        return yp0Var != null && yp0Var.f;
    }

    @Override // u4.v
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        ei.r6 r6Var;
        ArrayList arrayList;
        u4.h0 adapter = recyclerView.getAdapter();
        ts0 ts0Var = adapter instanceof ts0 ? (ts0) adapter : null;
        if (ts0Var == null || !ts0Var.M(d1Var.b()) || !ts0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = ts0Var.E;
        if (!ts0Var.h && (r6Var = ts0Var.s) != null && b10 >= 0 && b10 < r6Var.i.size() && b11 >= 0 && b11 < ts0Var.s.i.size()) {
            if ((ts0Var.s instanceof ei.k6) || ts0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i3 = 0; i3 < ts0Var.s.i.size(); i3++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.zi) ts0Var.s.i.get(i3)).f1()));
                }
            } else {
                arrayList = new ArrayList(ts0Var.s.g);
            }
            if (!ts0Var.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                ts0Var.F = true;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) ts0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(ziVar.f1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(ziVar.f1()));
            ts0Var.s.C(arrayList, false);
            ts0Var.j(b10, b11);
        }
        return true;
    }

    @Override // u4.v
    public final void p(u4.d1 d1Var, int i3) {
        ei.r6 r6Var;
        ArrayList arrayList;
        qr0 qr0Var = this.d;
        if (qr0Var != null && d1Var != null) {
            qr0Var.d1(false);
        }
        if (i3 != 0) {
            qr0 qr0Var2 = this.d;
            if (qr0Var2 != null) {
                qr0Var2.I0(false);
            }
            if (d1Var != null) {
                d1Var.a.setPressed(true);
                return;
            }
            return;
        }
        qr0 qr0Var3 = this.d;
        if (qr0Var3 != null && (qr0Var3.getAdapter() instanceof ts0)) {
            ts0 ts0Var = (ts0) this.d.getAdapter();
            ArrayList arrayList2 = ts0Var.E;
            if (!ts0Var.h && (r6Var = ts0Var.s) != null && ts0Var.F) {
                if ((r6Var instanceof ei.k6) || ts0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < ts0Var.s.i.size(); i10++) {
                        arrayList.add(Integer.valueOf(((org.telegram.messenger.zi) ts0Var.s.i.get(i10)).f1()));
                    }
                } else {
                    arrayList = r6Var.g;
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
                    ts0Var.s.C(arrayList, true);
                }
                ts0Var.F = false;
            }
        }
        qr0 qr0Var4 = this.d;
        if (qr0Var4 != null) {
            qr0Var4.setItemAnimator(null);
        }
    }

    @Override // u4.v
    public final void q(u4.d1 d1Var) {
    }
}
