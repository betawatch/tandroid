package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class wr0 extends s4.v {
    public cu0 d;
    public final /* synthetic */ kv0 e;

    public wr0(kv0 kv0Var) {
        this.e = kv0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        s4.h0 adapter = recyclerView.getAdapter();
        hv0 hv0Var = adapter instanceof hv0 ? (hv0) adapter : null;
        if (!k() || hv0Var == null || !hv0Var.M(c1Var.b())) {
            return s4.v.l(0, 0);
        }
        du0 du0Var = this.e.k0[0];
        js0 js0Var = du0Var != null ? du0Var.h : null;
        this.d = js0Var;
        if (js0Var != null) {
            js0Var.setItemAnimator(du0Var.d);
        }
        return s4.v.l(15, 0);
    }

    @Override // s4.v
    public final boolean k() {
        kv0 kv0Var = this.e;
        if (kv0Var.C1) {
            return true;
        }
        fs0 fs0Var = kv0Var.W;
        return fs0Var != null && fs0Var.w;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        hv0 hv0Var = adapter instanceof hv0 ? (hv0) adapter : null;
        if (hv0Var == null || !hv0Var.M(c1Var.b()) || !hv0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = hv0Var.y;
        if (!hv0Var.h && (d9Var = hv0Var.s) != null && b10 >= 0 && b10 < d9Var.i.size() && b11 >= 0 && b11 < hv0Var.s.i.size()) {
            if ((hv0Var.s instanceof ai.t8) || hv0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < hv0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) hv0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(hv0Var.s.g);
            }
            if (!hv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                hv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) hv0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            hv0Var.s.C(arrayList, false);
            hv0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        cu0 cu0Var = this.d;
        if (cu0Var != null && c1Var != null) {
            cu0Var.e1(false);
        }
        if (i10 != 0) {
            cu0 cu0Var2 = this.d;
            if (cu0Var2 != null) {
                cu0Var2.J0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        cu0 cu0Var3 = this.d;
        if (cu0Var3 != null && (cu0Var3.getAdapter() instanceof hv0)) {
            hv0 hv0Var = (hv0) this.d.getAdapter();
            ArrayList arrayList2 = hv0Var.y;
            if (!hv0Var.h && (d9Var = hv0Var.s) != null && hv0Var.E) {
                if ((d9Var instanceof ai.t8) || hv0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < hv0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) hv0Var.s.i.get(i11)).getId()));
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
                    hv0Var.s.C(arrayList, true);
                }
                hv0Var.E = false;
            }
        }
        cu0 cu0Var4 = this.d;
        if (cu0Var4 != null) {
            cu0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
