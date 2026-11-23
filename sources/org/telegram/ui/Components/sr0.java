package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sr0 extends v4.w {
    public cs0 d;
    public final /* synthetic */ it0 e;

    public sr0(it0 it0Var) {
        this.e = it0Var;
    }

    @Override // v4.w
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.a.setPressed(false);
    }

    @Override // v4.w
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        v4.i0 adapter = recyclerView.getAdapter();
        ft0 ft0Var = adapter instanceof ft0 ? (ft0) adapter : null;
        if (!k() || ft0Var == null || !ft0Var.M(f1Var.b())) {
            return v4.w.l(0, 0);
        }
        ds0 ds0Var = this.e.n0[0];
        mq0 mq0Var = ds0Var != null ? ds0Var.h : null;
        this.d = mq0Var;
        if (mq0Var != null) {
            mq0Var.setItemAnimator(ds0Var.d);
        }
        return v4.w.l(15, 0);
    }

    @Override // v4.w
    public final boolean k() {
        it0 it0Var = this.e;
        if (it0Var.F1) {
            return true;
        }
        iq0 iq0Var = it0Var.c0;
        return iq0Var != null && iq0Var.f;
    }

    @Override // v4.w
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        fi.h6 h6Var;
        ArrayList arrayList;
        v4.i0 adapter = recyclerView.getAdapter();
        ft0 ft0Var = adapter instanceof ft0 ? (ft0) adapter : null;
        if (ft0Var == null || !ft0Var.M(f1Var.b()) || !ft0Var.M(f1Var2.b())) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        ArrayList arrayList2 = ft0Var.E;
        if (!ft0Var.h && (h6Var = ft0Var.s) != null && b10 >= 0 && b10 < h6Var.i.size() && b11 >= 0 && b11 < ft0Var.s.i.size()) {
            if ((ft0Var.s instanceof fi.a6) || ft0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i7 = 0; i7 < ft0Var.s.i.size(); i7++) {
                    arrayList.add(Integer.valueOf(((org.telegram.messenger.fj) ft0Var.s.i.get(i7)).e1()));
                }
            } else {
                arrayList = new ArrayList(ft0Var.s.g);
            }
            if (!ft0Var.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                ft0Var.F = true;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) ft0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(fjVar.e1()));
            arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(fjVar.e1()));
            ft0Var.s.C(arrayList, false);
            ft0Var.j(b10, b11);
        }
        return true;
    }

    @Override // v4.w
    public final void p(v4.f1 f1Var, int i7) {
        fi.h6 h6Var;
        ArrayList arrayList;
        cs0 cs0Var = this.d;
        if (cs0Var != null && f1Var != null) {
            cs0Var.d1(false);
        }
        if (i7 != 0) {
            cs0 cs0Var2 = this.d;
            if (cs0Var2 != null) {
                cs0Var2.I0(false);
            }
            if (f1Var != null) {
                f1Var.a.setPressed(true);
                return;
            }
            return;
        }
        cs0 cs0Var3 = this.d;
        if (cs0Var3 != null && (cs0Var3.getAdapter() instanceof ft0)) {
            ft0 ft0Var = (ft0) this.d.getAdapter();
            ArrayList arrayList2 = ft0Var.E;
            if (!ft0Var.h && (h6Var = ft0Var.s) != null && ft0Var.F) {
                if ((h6Var instanceof fi.a6) || ft0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < ft0Var.s.i.size(); i10++) {
                        arrayList.add(Integer.valueOf(((org.telegram.messenger.fj) ft0Var.s.i.get(i10)).e1()));
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
                    ft0Var.s.C(arrayList, true);
                }
                ft0Var.F = false;
            }
        }
        cs0 cs0Var4 = this.d;
        if (cs0Var4 != null) {
            cs0Var4.setItemAnimator(null);
        }
    }

    @Override // v4.w
    public final void q(v4.f1 f1Var) {
    }
}
