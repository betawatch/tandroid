package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class gs0 extends s4.v {
    public lu0 d;
    public final /* synthetic */ tv0 e;

    public gs0(tv0 tv0Var) {
        this.e = tv0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        s4.g0 adapter = recyclerView.getAdapter();
        qv0 qv0Var = adapter instanceof qv0 ? (qv0) adapter : null;
        if (!k() || qv0Var == null || !qv0Var.M(b1Var.b())) {
            return s4.v.l(0, 0);
        }
        mu0 mu0Var = this.e.k0[0];
        ss0 ss0Var = mu0Var != null ? mu0Var.h : null;
        this.d = ss0Var;
        if (ss0Var != null) {
            ss0Var.setItemAnimator(mu0Var.d);
        }
        return s4.v.l(15, 0);
    }

    @Override // s4.v
    public final boolean k() {
        tv0 tv0Var = this.e;
        if (tv0Var.C1) {
            return true;
        }
        os0 os0Var = tv0Var.W;
        return os0Var != null && os0Var.w;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        ci.a7 a7Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        qv0 qv0Var = adapter instanceof qv0 ? (qv0) adapter : null;
        if (qv0Var == null || !qv0Var.M(b1Var.b()) || !qv0Var.M(b1Var2.b())) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ArrayList arrayList2 = qv0Var.y;
        if (!qv0Var.h && (a7Var = qv0Var.s) != null && b10 >= 0 && b10 < a7Var.i.size() && b11 >= 0 && b11 < qv0Var.s.i.size()) {
            if ((qv0Var.s instanceof ci.t6) || qv0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < qv0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) qv0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(qv0Var.s.g);
            }
            if (!qv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                qv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) qv0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            qv0Var.s.C(arrayList, false);
            qv0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        ci.a7 a7Var;
        ArrayList arrayList;
        lu0 lu0Var = this.d;
        if (lu0Var != null && b1Var != null) {
            lu0Var.d1(false);
        }
        if (i10 != 0) {
            lu0 lu0Var2 = this.d;
            if (lu0Var2 != null) {
                lu0Var2.I0(false);
            }
            if (b1Var != null) {
                b1Var.a.setPressed(true);
                return;
            }
            return;
        }
        lu0 lu0Var3 = this.d;
        if (lu0Var3 != null && (lu0Var3.getAdapter() instanceof qv0)) {
            qv0 qv0Var = (qv0) this.d.getAdapter();
            ArrayList arrayList2 = qv0Var.y;
            if (!qv0Var.h && (a7Var = qv0Var.s) != null && qv0Var.E) {
                if ((a7Var instanceof ci.t6) || qv0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < qv0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) qv0Var.s.i.get(i11)).getId()));
                    }
                } else {
                    arrayList = a7Var.g;
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
                    qv0Var.s.C(arrayList, true);
                }
                qv0Var.E = false;
            }
        }
        lu0 lu0Var4 = this.d;
        if (lu0Var4 != null) {
            lu0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}
