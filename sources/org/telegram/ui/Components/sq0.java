package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sq0 extends f2.d0 {
    public ws0 d;
    public final /* synthetic */ eu0 e;

    public sq0(eu0 eu0Var) {
        this.e = eu0Var;
    }

    @Override // f2.d0
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        q1Var.a.setPressed(false);
    }

    @Override // f2.d0
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        f2.r0 adapter = recyclerView.getAdapter();
        bu0 bu0Var = adapter instanceof bu0 ? (bu0) adapter : null;
        if (!k() || bu0Var == null || !bu0Var.M(q1Var.b())) {
            return f2.d0.l(0, 0);
        }
        xs0 xs0Var = this.e.g0[0];
        dr0 dr0Var = xs0Var != null ? xs0Var.h : null;
        this.d = dr0Var;
        if (dr0Var != null) {
            dr0Var.setItemAnimator(xs0Var.d);
        }
        return f2.d0.l(15, 0);
    }

    @Override // f2.d0
    public final boolean k() {
        eu0 eu0Var = this.e;
        if (eu0Var.y1) {
            return true;
        }
        zq0 zq0Var = eu0Var.S;
        return zq0Var != null && zq0Var.w;
    }

    @Override // f2.d0
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        ih.n6 n6Var;
        ArrayList arrayList;
        f2.r0 adapter = recyclerView.getAdapter();
        bu0 bu0Var = adapter instanceof bu0 ? (bu0) adapter : null;
        if (bu0Var == null || !bu0Var.M(q1Var.b()) || !bu0Var.M(q1Var2.b())) {
            return false;
        }
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        ArrayList arrayList2 = bu0Var.y;
        if (!bu0Var.h && (n6Var = bu0Var.s) != null && b10 >= 0 && b10 < n6Var.i.size() && b11 >= 0 && b11 < bu0Var.s.i.size()) {
            if ((bu0Var.s instanceof ih.f6) || bu0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i9 = 0; i9 < bu0Var.s.i.size(); i9++) {
                    arrayList.add(Integer.valueOf(((MessageObject) bu0Var.s.i.get(i9)).getId()));
                }
            } else {
                arrayList = new ArrayList(bu0Var.s.g);
            }
            if (!bu0Var.A) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                bu0Var.A = true;
            }
            MessageObject messageObject = (MessageObject) bu0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            bu0Var.s.C(arrayList, false);
            bu0Var.p(b10, b11);
        }
        return true;
    }

    @Override // f2.d0
    public final void p(f2.q1 q1Var, int i9) {
        ih.n6 n6Var;
        ArrayList arrayList;
        ws0 ws0Var = this.d;
        if (ws0Var != null && q1Var != null) {
            ws0Var.d1(false);
        }
        if (i9 != 0) {
            ws0 ws0Var2 = this.d;
            if (ws0Var2 != null) {
                ws0Var2.I0(false);
            }
            if (q1Var != null) {
                q1Var.a.setPressed(true);
                return;
            }
            return;
        }
        ws0 ws0Var3 = this.d;
        if (ws0Var3 != null && (ws0Var3.getAdapter() instanceof bu0)) {
            bu0 bu0Var = (bu0) this.d.getAdapter();
            ArrayList arrayList2 = bu0Var.y;
            if (!bu0Var.h && (n6Var = bu0Var.s) != null && bu0Var.A) {
                if ((n6Var instanceof ih.f6) || bu0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < bu0Var.s.i.size(); i10++) {
                        arrayList.add(Integer.valueOf(((MessageObject) bu0Var.s.i.get(i10)).getId()));
                    }
                } else {
                    arrayList = n6Var.g;
                }
                boolean z10 = arrayList2.size() != arrayList.size();
                if (!z10) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList2.size()) {
                            break;
                        }
                        if (arrayList2.get(i11) != arrayList.get(i11)) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                }
                if (z10) {
                    bu0Var.s.C(arrayList, true);
                }
                bu0Var.A = false;
            }
        }
        ws0 ws0Var4 = this.d;
        if (ws0Var4 != null) {
            ws0Var4.setItemAnimator(null);
        }
    }

    @Override // f2.d0
    public final void q(f2.q1 q1Var) {
    }
}
