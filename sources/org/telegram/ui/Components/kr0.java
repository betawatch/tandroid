package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kr0 extends s4.v {
    public qt0 d;
    public final /* synthetic */ yu0 e;

    public kr0(yu0 yu0Var) {
        this.e = yu0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        s4.h0 adapter = recyclerView.getAdapter();
        vu0 vu0Var = adapter instanceof vu0 ? (vu0) adapter : null;
        if (!k() || vu0Var == null || !vu0Var.M(c1Var.b())) {
            return s4.v.l(0, 0);
        }
        rt0 rt0Var = this.e.k0[0];
        xr0 xr0Var = rt0Var != null ? rt0Var.h : null;
        this.d = xr0Var;
        if (xr0Var != null) {
            xr0Var.setItemAnimator(rt0Var.d);
        }
        return s4.v.l(15, 0);
    }

    @Override // s4.v
    public final boolean k() {
        yu0 yu0Var = this.e;
        if (yu0Var.C1) {
            return true;
        }
        tr0 tr0Var = yu0Var.W;
        return tr0Var != null && tr0Var.w;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        vu0 vu0Var = adapter instanceof vu0 ? (vu0) adapter : null;
        if (vu0Var == null || !vu0Var.M(c1Var.b()) || !vu0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = vu0Var.y;
        if (!vu0Var.h && (d9Var = vu0Var.s) != null && b10 >= 0 && b10 < d9Var.i.size() && b11 >= 0 && b11 < vu0Var.s.i.size()) {
            if ((vu0Var.s instanceof ai.u8) || vu0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < vu0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) vu0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(vu0Var.s.g);
            }
            if (!vu0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                vu0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) vu0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            vu0Var.s.C(arrayList, false);
            vu0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        qt0 qt0Var = this.d;
        if (qt0Var != null && c1Var != null) {
            qt0Var.d1(false);
        }
        if (i10 != 0) {
            qt0 qt0Var2 = this.d;
            if (qt0Var2 != null) {
                qt0Var2.I0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        qt0 qt0Var3 = this.d;
        if (qt0Var3 != null && (qt0Var3.getAdapter() instanceof vu0)) {
            vu0 vu0Var = (vu0) this.d.getAdapter();
            ArrayList arrayList2 = vu0Var.y;
            if (!vu0Var.h && (d9Var = vu0Var.s) != null && vu0Var.E) {
                if ((d9Var instanceof ai.u8) || vu0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < vu0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) vu0Var.s.i.get(i11)).getId()));
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
                    vu0Var.s.C(arrayList, true);
                }
                vu0Var.E = false;
            }
        }
        qt0 qt0Var4 = this.d;
        if (qt0Var4 != null) {
            qt0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
