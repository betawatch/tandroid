package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tr0 extends s4.v {
    public zt0 d;
    public final /* synthetic */ iv0 e;

    public tr0(iv0 iv0Var) {
        this.e = iv0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        s4.h0 adapter = recyclerView.getAdapter();
        fv0 fv0Var = adapter instanceof fv0 ? (fv0) adapter : null;
        if (!k() || fv0Var == null || !fv0Var.M(c1Var.b())) {
            return s4.v.l(0, 0);
        }
        au0 au0Var = this.e.k0[0];
        gs0 gs0Var = au0Var != null ? au0Var.h : null;
        this.d = gs0Var;
        if (gs0Var != null) {
            gs0Var.setItemAnimator(au0Var.d);
        }
        return s4.v.l(15, 0);
    }

    @Override // s4.v
    public final boolean k() {
        iv0 iv0Var = this.e;
        if (iv0Var.C1) {
            return true;
        }
        cs0 cs0Var = iv0Var.W;
        return cs0Var != null && cs0Var.w;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        zh.a5 a5Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        fv0 fv0Var = adapter instanceof fv0 ? (fv0) adapter : null;
        if (fv0Var == null || !fv0Var.M(c1Var.b()) || !fv0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = fv0Var.y;
        if (!fv0Var.h && (a5Var = fv0Var.s) != null && b10 >= 0 && b10 < a5Var.i.size() && b11 >= 0 && b11 < fv0Var.s.i.size()) {
            if ((fv0Var.s instanceof zh.s4) || fv0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < fv0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) fv0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(fv0Var.s.g);
            }
            if (!fv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                fv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) fv0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            fv0Var.s.C(arrayList, false);
            fv0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        zh.a5 a5Var;
        ArrayList arrayList;
        zt0 zt0Var = this.d;
        if (zt0Var != null && c1Var != null) {
            zt0Var.c1(false);
        }
        if (i10 != 0) {
            zt0 zt0Var2 = this.d;
            if (zt0Var2 != null) {
                zt0Var2.I0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        zt0 zt0Var3 = this.d;
        if (zt0Var3 != null && (zt0Var3.getAdapter() instanceof fv0)) {
            fv0 fv0Var = (fv0) this.d.getAdapter();
            ArrayList arrayList2 = fv0Var.y;
            if (!fv0Var.h && (a5Var = fv0Var.s) != null && fv0Var.E) {
                if ((a5Var instanceof zh.s4) || fv0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < fv0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) fv0Var.s.i.get(i11)).getId()));
                    }
                } else {
                    arrayList = a5Var.g;
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
                    fv0Var.s.C(arrayList, true);
                }
                fv0Var.E = false;
            }
        }
        zt0 zt0Var4 = this.d;
        if (zt0Var4 != null) {
            zt0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
