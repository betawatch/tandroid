package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class xr0 extends s4.v {
    public du0 d;
    public final /* synthetic */ lv0 e;

    public xr0(lv0 lv0Var) {
        this.e = lv0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        s4.h0 adapter = recyclerView.getAdapter();
        iv0 iv0Var = adapter instanceof iv0 ? (iv0) adapter : null;
        if (!k() || iv0Var == null || !iv0Var.M(c1Var.b())) {
            return s4.v.l(0, 0);
        }
        eu0 eu0Var = this.e.k0[0];
        ks0 ks0Var = eu0Var != null ? eu0Var.h : null;
        this.d = ks0Var;
        if (ks0Var != null) {
            ks0Var.setItemAnimator(eu0Var.d);
        }
        return s4.v.l(15, 0);
    }

    @Override // s4.v
    public final boolean k() {
        lv0 lv0Var = this.e;
        if (lv0Var.C1) {
            return true;
        }
        gs0 gs0Var = lv0Var.W;
        return gs0Var != null && gs0Var.w;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        iv0 iv0Var = adapter instanceof iv0 ? (iv0) adapter : null;
        if (iv0Var == null || !iv0Var.M(c1Var.b()) || !iv0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = iv0Var.y;
        if (!iv0Var.h && (d9Var = iv0Var.s) != null && b10 >= 0 && b10 < d9Var.i.size() && b11 >= 0 && b11 < iv0Var.s.i.size()) {
            if ((iv0Var.s instanceof ai.t8) || iv0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < iv0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) iv0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(iv0Var.s.g);
            }
            if (!iv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                iv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) iv0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            iv0Var.s.C(arrayList, false);
            iv0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        du0 du0Var = this.d;
        if (du0Var != null && c1Var != null) {
            du0Var.e1(false);
        }
        if (i10 != 0) {
            du0 du0Var2 = this.d;
            if (du0Var2 != null) {
                du0Var2.J0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        du0 du0Var3 = this.d;
        if (du0Var3 != null && (du0Var3.getAdapter() instanceof iv0)) {
            iv0 iv0Var = (iv0) this.d.getAdapter();
            ArrayList arrayList2 = iv0Var.y;
            if (!iv0Var.h && (d9Var = iv0Var.s) != null && iv0Var.E) {
                if ((d9Var instanceof ai.t8) || iv0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < iv0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) iv0Var.s.i.get(i11)).getId()));
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
                    iv0Var.s.C(arrayList, true);
                }
                iv0Var.E = false;
            }
        }
        du0 du0Var4 = this.d;
        if (du0Var4 != null) {
            du0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
