package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class bs0 extends s4.v {
    public hu0 d;
    public final /* synthetic */ pv0 e;

    public bs0(pv0 pv0Var) {
        this.e = pv0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        s4.h0 adapter = recyclerView.getAdapter();
        mv0 mv0Var = adapter instanceof mv0 ? (mv0) adapter : null;
        if (!k() || mv0Var == null || !mv0Var.L(c1Var.b())) {
            return s4.v.l(0, 0);
        }
        iu0 iu0Var = this.e.k0[0];
        os0 os0Var = iu0Var != null ? iu0Var.h : null;
        this.d = os0Var;
        if (os0Var != null) {
            os0Var.setItemAnimator(iu0Var.d);
        }
        return s4.v.l(15, 0);
    }

    @Override // s4.v
    public final boolean k() {
        pv0 pv0Var = this.e;
        if (pv0Var.C1) {
            return true;
        }
        ks0 ks0Var = pv0Var.W;
        return ks0Var != null && ks0Var.w;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        mv0 mv0Var = adapter instanceof mv0 ? (mv0) adapter : null;
        if (mv0Var == null || !mv0Var.L(c1Var.b()) || !mv0Var.L(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = mv0Var.y;
        if (!mv0Var.h && (d9Var = mv0Var.s) != null && b10 >= 0 && b10 < d9Var.i.size() && b11 >= 0 && b11 < mv0Var.s.i.size()) {
            if ((mv0Var.s instanceof ai.u8) || mv0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < mv0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) mv0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(mv0Var.s.g);
            }
            if (!mv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                mv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) mv0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            mv0Var.s.C(arrayList, false);
            mv0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        hu0 hu0Var = this.d;
        if (hu0Var != null && c1Var != null) {
            hu0Var.e1(false);
        }
        if (i10 != 0) {
            hu0 hu0Var2 = this.d;
            if (hu0Var2 != null) {
                hu0Var2.J0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        hu0 hu0Var3 = this.d;
        if (hu0Var3 != null && (hu0Var3.getAdapter() instanceof mv0)) {
            mv0 mv0Var = (mv0) this.d.getAdapter();
            ArrayList arrayList2 = mv0Var.y;
            if (!mv0Var.h && (d9Var = mv0Var.s) != null && mv0Var.E) {
                if ((d9Var instanceof ai.u8) || mv0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < mv0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) mv0Var.s.i.get(i11)).getId()));
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
                    mv0Var.s.C(arrayList, true);
                }
                mv0Var.E = false;
            }
        }
        hu0 hu0Var4 = this.d;
        if (hu0Var4 != null) {
            hu0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
