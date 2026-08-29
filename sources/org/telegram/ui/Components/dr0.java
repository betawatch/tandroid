package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dr0 extends f2.b0 {
    public ht0 d;
    public final /* synthetic */ qu0 e;

    public dr0(qu0 qu0Var) {
        this.e = qu0Var;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        n1Var.a.setPressed(false);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        f2.p0 adapter = recyclerView.getAdapter();
        nu0 nu0Var = adapter instanceof nu0 ? (nu0) adapter : null;
        if (!k() || nu0Var == null || !nu0Var.M(n1Var.b())) {
            return f2.b0.l(0, 0);
        }
        it0 it0Var = this.e.g0[0];
        or0 or0Var = it0Var != null ? it0Var.h : null;
        this.d = or0Var;
        if (or0Var != null) {
            or0Var.setItemAnimator(it0Var.d);
        }
        return f2.b0.l(15, 0);
    }

    @Override // f2.b0
    public final boolean k() {
        qu0 qu0Var = this.e;
        if (qu0Var.y1) {
            return true;
        }
        kr0 kr0Var = qu0Var.S;
        return kr0Var != null && kr0Var.w;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        lh.k6 k6Var;
        ArrayList arrayList;
        f2.p0 adapter = recyclerView.getAdapter();
        nu0 nu0Var = adapter instanceof nu0 ? (nu0) adapter : null;
        if (nu0Var == null || !nu0Var.M(n1Var.b()) || !nu0Var.M(n1Var2.b())) {
            return false;
        }
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
        ArrayList arrayList2 = nu0Var.y;
        if (!nu0Var.h && (k6Var = nu0Var.s) != null && b10 >= 0 && b10 < k6Var.i.size() && b11 >= 0 && b11 < nu0Var.s.i.size()) {
            if ((nu0Var.s instanceof lh.c6) || nu0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < nu0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) nu0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(nu0Var.s.g);
            }
            if (!nu0Var.A) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                nu0Var.A = true;
            }
            MessageObject messageObject = (MessageObject) nu0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            nu0Var.s.C(arrayList, false);
            nu0Var.p(b10, b11);
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.n1 n1Var, int i10) {
        lh.k6 k6Var;
        ArrayList arrayList;
        ht0 ht0Var = this.d;
        if (ht0Var != null && n1Var != null) {
            ht0Var.d1(false);
        }
        if (i10 != 0) {
            ht0 ht0Var2 = this.d;
            if (ht0Var2 != null) {
                ht0Var2.I0(false);
            }
            if (n1Var != null) {
                n1Var.a.setPressed(true);
                return;
            }
            return;
        }
        ht0 ht0Var3 = this.d;
        if (ht0Var3 != null && (ht0Var3.getAdapter() instanceof nu0)) {
            nu0 nu0Var = (nu0) this.d.getAdapter();
            ArrayList arrayList2 = nu0Var.y;
            if (!nu0Var.h && (k6Var = nu0Var.s) != null && nu0Var.A) {
                if ((k6Var instanceof lh.c6) || nu0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < nu0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) nu0Var.s.i.get(i11)).getId()));
                    }
                } else {
                    arrayList = k6Var.g;
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
                    nu0Var.s.C(arrayList, true);
                }
                nu0Var.A = false;
            }
        }
        ht0 ht0Var4 = this.d;
        if (ht0Var4 != null) {
            ht0Var4.setItemAnimator(null);
        }
    }

    @Override // f2.b0
    public final void q(f2.n1 n1Var) {
    }
}
