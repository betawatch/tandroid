package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class os0 extends s4.w {
    public tu0 d;
    public final /* synthetic */ bw0 e;

    public os0(bw0 bw0Var) {
        this.e = bw0Var;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        s4.i0 adapter = recyclerView.getAdapter();
        yv0 yv0Var = adapter instanceof yv0 ? (yv0) adapter : null;
        if (!k() || yv0Var == null || !yv0Var.M(d1Var.b())) {
            return s4.w.l(0, 0);
        }
        uu0 uu0Var = this.e.k0[0];
        at0 at0Var = uu0Var != null ? uu0Var.h : null;
        this.d = at0Var;
        if (at0Var != null) {
            at0Var.setItemAnimator(uu0Var.d);
        }
        return s4.w.l(15, 0);
    }

    @Override // s4.w
    public final boolean k() {
        bw0 bw0Var = this.e;
        if (bw0Var.C1) {
            return true;
        }
        ws0 ws0Var = bw0Var.W;
        return ws0Var != null && ws0Var.w;
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        ai.e9 e9Var;
        ArrayList arrayList;
        s4.i0 adapter = recyclerView.getAdapter();
        yv0 yv0Var = adapter instanceof yv0 ? (yv0) adapter : null;
        if (yv0Var == null || !yv0Var.M(d1Var.b()) || !yv0Var.M(d1Var2.b())) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ArrayList arrayList2 = yv0Var.y;
        if (!yv0Var.h && (e9Var = yv0Var.s) != null && b10 >= 0 && b10 < e9Var.i.size() && b11 >= 0 && b11 < yv0Var.s.i.size()) {
            if ((yv0Var.s instanceof ai.v8) || yv0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < yv0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) yv0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(yv0Var.s.g);
            }
            if (!yv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                yv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) yv0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            yv0Var.s.C(arrayList, false);
            yv0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.w
    public final void p(s4.d1 d1Var, int i10) {
        ai.e9 e9Var;
        ArrayList arrayList;
        tu0 tu0Var = this.d;
        if (tu0Var != null && d1Var != null) {
            tu0Var.d1(false);
        }
        if (i10 != 0) {
            tu0 tu0Var2 = this.d;
            if (tu0Var2 != null) {
                tu0Var2.I0(false);
            }
            if (d1Var != null) {
                d1Var.a.setPressed(true);
                return;
            }
            return;
        }
        tu0 tu0Var3 = this.d;
        if (tu0Var3 != null && (tu0Var3.getAdapter() instanceof yv0)) {
            yv0 yv0Var = (yv0) this.d.getAdapter();
            ArrayList arrayList2 = yv0Var.y;
            if (!yv0Var.h && (e9Var = yv0Var.s) != null && yv0Var.E) {
                if ((e9Var instanceof ai.v8) || yv0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < yv0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) yv0Var.s.i.get(i11)).getId()));
                    }
                } else {
                    arrayList = e9Var.g;
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
                    yv0Var.s.C(arrayList, true);
                }
                yv0Var.E = false;
            }
        }
        tu0 tu0Var4 = this.d;
        if (tu0Var4 != null) {
            tu0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.w
    public final void q(s4.d1 d1Var) {
    }
}
