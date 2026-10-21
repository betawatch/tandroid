package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class hs0 extends s4.v {
    public mu0 d;
    public final /* synthetic */ uv0 e;

    public hs0(uv0 uv0Var) {
        this.e = uv0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        s4.g0 adapter = recyclerView.getAdapter();
        rv0 rv0Var = adapter instanceof rv0 ? (rv0) adapter : null;
        if (!k() || rv0Var == null || !rv0Var.M(b1Var.b())) {
            return s4.v.l(0, 0);
        }
        nu0 nu0Var = this.e.k0[0];
        ts0 ts0Var = nu0Var != null ? nu0Var.h : null;
        this.d = ts0Var;
        if (ts0Var != null) {
            ts0Var.setItemAnimator(nu0Var.d);
        }
        return s4.v.l(15, 0);
    }

    @Override // s4.v
    public final boolean k() {
        uv0 uv0Var = this.e;
        if (uv0Var.C1) {
            return true;
        }
        ps0 ps0Var = uv0Var.W;
        return ps0Var != null && ps0Var.w;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        ci.a7 a7Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        rv0 rv0Var = adapter instanceof rv0 ? (rv0) adapter : null;
        if (rv0Var == null || !rv0Var.M(b1Var.b()) || !rv0Var.M(b1Var2.b())) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ArrayList arrayList2 = rv0Var.y;
        if (!rv0Var.h && (a7Var = rv0Var.s) != null && b10 >= 0 && b10 < a7Var.i.size() && b11 >= 0 && b11 < rv0Var.s.i.size()) {
            if ((rv0Var.s instanceof ci.t6) || rv0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < rv0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) rv0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(rv0Var.s.g);
            }
            if (!rv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                rv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) rv0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            rv0Var.s.C(arrayList, false);
            rv0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        ci.a7 a7Var;
        ArrayList arrayList;
        mu0 mu0Var = this.d;
        if (mu0Var != null && b1Var != null) {
            mu0Var.d1(false);
        }
        if (i10 != 0) {
            mu0 mu0Var2 = this.d;
            if (mu0Var2 != null) {
                mu0Var2.I0(false);
            }
            if (b1Var != null) {
                b1Var.a.setPressed(true);
                return;
            }
            return;
        }
        mu0 mu0Var3 = this.d;
        if (mu0Var3 != null && (mu0Var3.getAdapter() instanceof rv0)) {
            rv0 rv0Var = (rv0) this.d.getAdapter();
            ArrayList arrayList2 = rv0Var.y;
            if (!rv0Var.h && (a7Var = rv0Var.s) != null && rv0Var.E) {
                if ((a7Var instanceof ci.t6) || rv0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < rv0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) rv0Var.s.i.get(i11)).getId()));
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
                    rv0Var.s.C(arrayList, true);
                }
                rv0Var.E = false;
            }
        }
        mu0 mu0Var4 = this.d;
        if (mu0Var4 != null) {
            mu0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}
