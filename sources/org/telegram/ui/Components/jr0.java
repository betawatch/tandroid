package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class jr0 extends s4.v {
    public pt0 d;
    public final /* synthetic */ xu0 e;

    public jr0(xu0 xu0Var) {
        this.e = xu0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        s4.h0 adapter = recyclerView.getAdapter();
        uu0 uu0Var = adapter instanceof uu0 ? (uu0) adapter : null;
        if (!k() || uu0Var == null || !uu0Var.M(c1Var.b())) {
            return s4.v.l(0, 0);
        }
        qt0 qt0Var = this.e.k0[0];
        wr0 wr0Var = qt0Var != null ? qt0Var.h : null;
        this.d = wr0Var;
        if (wr0Var != null) {
            wr0Var.setItemAnimator(qt0Var.d);
        }
        return s4.v.l(15, 0);
    }

    @Override // s4.v
    public final boolean k() {
        xu0 xu0Var = this.e;
        if (xu0Var.C1) {
            return true;
        }
        sr0 sr0Var = xu0Var.W;
        return sr0Var != null && sr0Var.w;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        bi.l8 l8Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        uu0 uu0Var = adapter instanceof uu0 ? (uu0) adapter : null;
        if (uu0Var == null || !uu0Var.M(c1Var.b()) || !uu0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = uu0Var.y;
        if (!uu0Var.h && (l8Var = uu0Var.s) != null && b10 >= 0 && b10 < l8Var.i.size() && b11 >= 0 && b11 < uu0Var.s.i.size()) {
            if ((uu0Var.s instanceof bi.b8) || uu0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < uu0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) uu0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(uu0Var.s.g);
            }
            if (!uu0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                uu0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) uu0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            uu0Var.s.C(arrayList, false);
            uu0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        bi.l8 l8Var;
        ArrayList arrayList;
        pt0 pt0Var = this.d;
        if (pt0Var != null && c1Var != null) {
            pt0Var.c1(false);
        }
        if (i10 != 0) {
            pt0 pt0Var2 = this.d;
            if (pt0Var2 != null) {
                pt0Var2.I0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        pt0 pt0Var3 = this.d;
        if (pt0Var3 != null && (pt0Var3.getAdapter() instanceof uu0)) {
            uu0 uu0Var = (uu0) this.d.getAdapter();
            ArrayList arrayList2 = uu0Var.y;
            if (!uu0Var.h && (l8Var = uu0Var.s) != null && uu0Var.E) {
                if ((l8Var instanceof bi.b8) || uu0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < uu0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) uu0Var.s.i.get(i11)).getId()));
                    }
                } else {
                    arrayList = l8Var.g;
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
                    uu0Var.s.C(arrayList, true);
                }
                uu0Var.E = false;
            }
        }
        pt0 pt0Var4 = this.d;
        if (pt0Var4 != null) {
            pt0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
