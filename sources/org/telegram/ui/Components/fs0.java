package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class fs0 extends s4.v {
    public ku0 d;
    public final /* synthetic */ sv0 e;

    public fs0(sv0 sv0Var) {
        this.e = sv0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        s4.g0 adapter = recyclerView.getAdapter();
        pv0 pv0Var = adapter instanceof pv0 ? (pv0) adapter : null;
        if (!k() || pv0Var == null || !pv0Var.M(b1Var.b())) {
            return s4.v.l(0, 0);
        }
        lu0 lu0Var = this.e.k0[0];
        rs0 rs0Var = lu0Var != null ? lu0Var.h : null;
        this.d = rs0Var;
        if (rs0Var != null) {
            rs0Var.setItemAnimator(lu0Var.d);
        }
        return s4.v.l(15, 0);
    }

    @Override // s4.v
    public final boolean k() {
        sv0 sv0Var = this.e;
        if (sv0Var.C1) {
            return true;
        }
        ns0 ns0Var = sv0Var.W;
        return ns0Var != null && ns0Var.w;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        ci.z6 z6Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        pv0 pv0Var = adapter instanceof pv0 ? (pv0) adapter : null;
        if (pv0Var == null || !pv0Var.M(b1Var.b()) || !pv0Var.M(b1Var2.b())) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ArrayList arrayList2 = pv0Var.y;
        if (!pv0Var.h && (z6Var = pv0Var.s) != null && b10 >= 0 && b10 < z6Var.i.size() && b11 >= 0 && b11 < pv0Var.s.i.size()) {
            if ((pv0Var.s instanceof ci.s6) || pv0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < pv0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) pv0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(pv0Var.s.g);
            }
            if (!pv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                pv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) pv0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            pv0Var.s.C(arrayList, false);
            pv0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        ci.z6 z6Var;
        ArrayList arrayList;
        ku0 ku0Var = this.d;
        if (ku0Var != null && b1Var != null) {
            ku0Var.d1(false);
        }
        if (i10 != 0) {
            ku0 ku0Var2 = this.d;
            if (ku0Var2 != null) {
                ku0Var2.I0(false);
            }
            if (b1Var != null) {
                b1Var.a.setPressed(true);
                return;
            }
            return;
        }
        ku0 ku0Var3 = this.d;
        if (ku0Var3 != null && (ku0Var3.getAdapter() instanceof pv0)) {
            pv0 pv0Var = (pv0) this.d.getAdapter();
            ArrayList arrayList2 = pv0Var.y;
            if (!pv0Var.h && (z6Var = pv0Var.s) != null && pv0Var.E) {
                if ((z6Var instanceof ci.s6) || pv0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < pv0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) pv0Var.s.i.get(i11)).getId()));
                    }
                } else {
                    arrayList = z6Var.g;
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
                    pv0Var.s.C(arrayList, true);
                }
                pv0Var.E = false;
            }
        }
        ku0 ku0Var4 = this.d;
        if (ku0Var4 != null) {
            ku0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}
