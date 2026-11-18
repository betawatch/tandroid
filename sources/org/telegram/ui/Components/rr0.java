package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rr0 extends v4.w {
    public as0 d;
    public final /* synthetic */ gt0 e;

    public rr0(gt0 gt0Var) {
        this.e = gt0Var;
    }

    @Override // v4.w
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.a.setPressed(false);
    }

    @Override // v4.w
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        v4.i0 adapter = recyclerView.getAdapter();
        dt0 dt0Var = adapter instanceof dt0 ? (dt0) adapter : null;
        if (!k() || dt0Var == null || !dt0Var.M(f1Var.b())) {
            return v4.w.l(0, 0);
        }
        bs0 bs0Var = this.e.n0[0];
        lq0 lq0Var = bs0Var != null ? bs0Var.h : null;
        this.d = lq0Var;
        if (lq0Var != null) {
            lq0Var.setItemAnimator(bs0Var.d);
        }
        return v4.w.l(15, 0);
    }

    @Override // v4.w
    public final boolean k() {
        gt0 gt0Var = this.e;
        if (gt0Var.F1) {
            return true;
        }
        hq0 hq0Var = gt0Var.c0;
        return hq0Var != null && hq0Var.f;
    }

    @Override // v4.w
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        fi.h6 h6Var;
        ArrayList arrayList;
        v4.i0 adapter = recyclerView.getAdapter();
        dt0 dt0Var = adapter instanceof dt0 ? (dt0) adapter : null;
        if (dt0Var == null || !dt0Var.M(f1Var.b()) || !dt0Var.M(f1Var2.b())) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        ArrayList arrayList2 = dt0Var.E;
        if (!dt0Var.h && (h6Var = dt0Var.s) != null && b10 >= 0 && b10 < h6Var.i.size() && b11 >= 0 && b11 < dt0Var.s.i.size()) {
            if ((dt0Var.s instanceof fi.z5) || dt0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < dt0Var.s.i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.fj) dt0Var.s.i.get(i7)).e1()));
                }
            } else {
                arrayList = new ArrayList(dt0Var.s.g);
            }
            if (!dt0Var.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                dt0Var.F = true;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) dt0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(fjVar.e1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(fjVar.e1()));
            dt0Var.s.C(arrayList, false);
            dt0Var.j(b10, b11);
        }
        return true;
    }

    @Override // v4.w
    public final void p(v4.f1 f1Var, int i7) {
        fi.h6 h6Var;
        ArrayList arrayList;
        as0 as0Var = this.d;
        if (as0Var != null && f1Var != null) {
            as0Var.d1(false);
        }
        if (i7 != 0) {
            as0 as0Var2 = this.d;
            if (as0Var2 != null) {
                as0Var2.I0(false);
            }
            if (f1Var != null) {
                f1Var.a.setPressed(true);
                return;
            }
            return;
        }
        as0 as0Var3 = this.d;
        if (as0Var3 != null && (as0Var3.getAdapter() instanceof dt0)) {
            dt0 dt0Var = (dt0) this.d.getAdapter();
            ArrayList arrayList2 = dt0Var.E;
            if (!dt0Var.h && (h6Var = dt0Var.s) != null && dt0Var.F) {
                if ((h6Var instanceof fi.z5) || dt0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < dt0Var.s.i.size(); i10++) {
                        arrayList.add(Integer.valueOf(((org.telegram.messenger.fj) dt0Var.s.i.get(i10)).e1()));
                    }
                } else {
                    arrayList = h6Var.g;
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
                    dt0Var.s.C(arrayList, true);
                }
                dt0Var.F = false;
            }
        }
        as0 as0Var4 = this.d;
        if (as0Var4 != null) {
            as0Var4.setItemAnimator(null);
        }
    }

    @Override // v4.w
    public final void q(v4.f1 f1Var) {
    }
}
