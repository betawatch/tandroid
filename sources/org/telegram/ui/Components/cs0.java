package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class cs0 extends s4.v {
    public iu0 d;
    public final /* synthetic */ qv0 e;

    public cs0(qv0 qv0Var) {
        this.e = qv0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        s4.h0 adapter = recyclerView.getAdapter();
        nv0 nv0Var = adapter instanceof nv0 ? (nv0) adapter : null;
        if (!k() || nv0Var == null || !nv0Var.L(c1Var.b())) {
            return s4.v.l(0, 0);
        }
        ju0 ju0Var = this.e.k0[0];
        ps0 ps0Var = ju0Var != null ? ju0Var.h : null;
        this.d = ps0Var;
        if (ps0Var != null) {
            ps0Var.setItemAnimator(ju0Var.d);
        }
        return s4.v.l(15, 0);
    }

    @Override // s4.v
    public final boolean k() {
        qv0 qv0Var = this.e;
        if (qv0Var.C1) {
            return true;
        }
        ls0 ls0Var = qv0Var.W;
        return ls0Var != null && ls0Var.w;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        nv0 nv0Var = adapter instanceof nv0 ? (nv0) adapter : null;
        if (nv0Var == null || !nv0Var.L(c1Var.b()) || !nv0Var.L(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = nv0Var.y;
        if (!nv0Var.h && (d9Var = nv0Var.s) != null && b10 >= 0 && b10 < d9Var.i.size() && b11 >= 0 && b11 < nv0Var.s.i.size()) {
            if ((nv0Var.s instanceof ai.u8) || nv0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < nv0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) nv0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(nv0Var.s.g);
            }
            if (!nv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                nv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) nv0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            nv0Var.s.C(arrayList, false);
            nv0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        iu0 iu0Var = this.d;
        if (iu0Var != null && c1Var != null) {
            iu0Var.d1(false);
        }
        if (i10 != 0) {
            iu0 iu0Var2 = this.d;
            if (iu0Var2 != null) {
                iu0Var2.J0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        iu0 iu0Var3 = this.d;
        if (iu0Var3 != null && (iu0Var3.getAdapter() instanceof nv0)) {
            nv0 nv0Var = (nv0) this.d.getAdapter();
            ArrayList arrayList2 = nv0Var.y;
            if (!nv0Var.h && (d9Var = nv0Var.s) != null && nv0Var.E) {
                if ((d9Var instanceof ai.u8) || nv0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < nv0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) nv0Var.s.i.get(i11)).getId()));
                    }
                } else {
                    arrayList = d9Var.g;
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
                    nv0Var.s.C(arrayList, true);
                }
                nv0Var.E = false;
            }
        }
        iu0 iu0Var4 = this.d;
        if (iu0Var4 != null) {
            iu0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
