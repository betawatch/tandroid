package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jr0 extends v4.v {
    public tr0 d;
    public final /* synthetic */ zs0 e;

    public jr0(zs0 zs0Var) {
        this.e = zs0Var;
    }

    @Override // v4.v
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        v4.g0 adapter = recyclerView.getAdapter();
        ws0 ws0Var = adapter instanceof ws0 ? (ws0) adapter : null;
        if (!k() || ws0Var == null || !ws0Var.M(d1Var.b())) {
            return v4.v.l(0, 0);
        }
        ur0 ur0Var = this.e.m0[0];
        dq0 dq0Var = ur0Var != null ? ur0Var.h : null;
        this.d = dq0Var;
        if (dq0Var != null) {
            dq0Var.setItemAnimator(ur0Var.d);
        }
        return v4.v.l(15, 0);
    }

    @Override // v4.v
    public final boolean k() {
        zs0 zs0Var = this.e;
        if (zs0Var.E1) {
            return true;
        }
        zp0 zp0Var = zs0Var.b0;
        return zp0Var != null && zp0Var.f;
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        di.r6 r6Var;
        ArrayList arrayList;
        v4.g0 adapter = recyclerView.getAdapter();
        ws0 ws0Var = adapter instanceof ws0 ? (ws0) adapter : null;
        if (ws0Var == null || !ws0Var.M(d1Var.b()) || !ws0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = ws0Var.D;
        if (!ws0Var.h && (r6Var = ws0Var.s) != null && b10 >= 0 && b10 < r6Var.i.size() && b11 >= 0 && b11 < ws0Var.s.i.size()) {
            if ((ws0Var.s instanceof di.k6) || ws0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < ws0Var.s.i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.ij) ws0Var.s.i.get(i7)).e1()));
                }
            } else {
                arrayList = new ArrayList(ws0Var.s.g);
            }
            if (!ws0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                ws0Var.E = true;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) ws0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(ijVar.e1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(ijVar.e1()));
            ws0Var.s.C(arrayList, false);
            ws0Var.j(b10, b11);
        }
        return true;
    }

    @Override // v4.v
    public final void p(v4.d1 d1Var, int i7) {
        di.r6 r6Var;
        ArrayList arrayList;
        tr0 tr0Var = this.d;
        if (tr0Var != null && d1Var != null) {
            tr0Var.d1(false);
        }
        if (i7 != 0) {
            tr0 tr0Var2 = this.d;
            if (tr0Var2 != null) {
                tr0Var2.I0(false);
            }
            if (d1Var != null) {
                d1Var.a.setPressed(true);
                return;
            }
            return;
        }
        tr0 tr0Var3 = this.d;
        if (tr0Var3 != null && (tr0Var3.getAdapter() instanceof ws0)) {
            ws0 ws0Var = (ws0) this.d.getAdapter();
            ArrayList arrayList2 = ws0Var.D;
            if (!ws0Var.h && (r6Var = ws0Var.s) != null && ws0Var.E) {
                if ((r6Var instanceof di.k6) || ws0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < ws0Var.s.i.size(); i10++) {
                        arrayList.add(Integer.valueOf(((org.telegram.messenger.ij) ws0Var.s.i.get(i10)).e1()));
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
                    ws0Var.s.C(arrayList, true);
                }
                ws0Var.E = false;
            }
        }
        tr0 tr0Var4 = this.d;
        if (tr0Var4 != null) {
            tr0Var4.setItemAnimator(null);
        }
    }

    @Override // v4.v
    public final void q(v4.d1 d1Var) {
    }
}
