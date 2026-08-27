package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tq0 extends f2.c0 {
    public ys0 d;
    public final /* synthetic */ hu0 e;

    public tq0(hu0 hu0Var) {
        this.e = hu0Var;
    }

    @Override // f2.c0
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        o1Var.a.setPressed(false);
    }

    @Override // f2.c0
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        f2.q0 adapter = recyclerView.getAdapter();
        eu0 eu0Var = adapter instanceof eu0 ? (eu0) adapter : null;
        if (!k() || eu0Var == null || !eu0Var.M(o1Var.b())) {
            return f2.c0.l(0, 0);
        }
        zs0 zs0Var = this.e.g0[0];
        er0 er0Var = zs0Var != null ? zs0Var.h : null;
        this.d = er0Var;
        if (er0Var != null) {
            er0Var.setItemAnimator(zs0Var.d);
        }
        return f2.c0.l(15, 0);
    }

    @Override // f2.c0
    public final boolean k() {
        hu0 hu0Var = this.e;
        if (hu0Var.y1) {
            return true;
        }
        ar0 ar0Var = hu0Var.S;
        return ar0Var != null && ar0Var.w;
    }

    @Override // f2.c0
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        jh.j6 j6Var;
        ArrayList arrayList;
        f2.q0 adapter = recyclerView.getAdapter();
        eu0 eu0Var = adapter instanceof eu0 ? (eu0) adapter : null;
        if (eu0Var == null || !eu0Var.M(o1Var.b()) || !eu0Var.M(o1Var2.b())) {
            return false;
        }
        int b10 = o1Var.b();
        int b11 = o1Var2.b();
        ArrayList arrayList2 = eu0Var.y;
        if (!eu0Var.h && (j6Var = eu0Var.s) != null && b10 >= 0 && b10 < j6Var.i.size() && b11 >= 0 && b11 < eu0Var.s.i.size()) {
            if ((eu0Var.s instanceof jh.b6) || eu0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < eu0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) eu0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(eu0Var.s.g);
            }
            if (!eu0Var.A) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                eu0Var.A = true;
            }
            MessageObject messageObject = (MessageObject) eu0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            eu0Var.s.C(arrayList, false);
            eu0Var.p(b10, b11);
        }
        return true;
    }

    @Override // f2.c0
    public final void p(f2.o1 o1Var, int i10) {
        jh.j6 j6Var;
        ArrayList arrayList;
        ys0 ys0Var = this.d;
        if (ys0Var != null && o1Var != null) {
            ys0Var.d1(false);
        }
        if (i10 != 0) {
            ys0 ys0Var2 = this.d;
            if (ys0Var2 != null) {
                ys0Var2.I0(false);
            }
            if (o1Var != null) {
                o1Var.a.setPressed(true);
                return;
            }
            return;
        }
        ys0 ys0Var3 = this.d;
        if (ys0Var3 != null && (ys0Var3.getAdapter() instanceof eu0)) {
            eu0 eu0Var = (eu0) this.d.getAdapter();
            ArrayList arrayList2 = eu0Var.y;
            if (!eu0Var.h && (j6Var = eu0Var.s) != null && eu0Var.A) {
                if ((j6Var instanceof jh.b6) || eu0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < eu0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) eu0Var.s.i.get(i11)).getId()));
                    }
                } else {
                    arrayList = j6Var.g;
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
                    eu0Var.s.C(arrayList, true);
                }
                eu0Var.A = false;
            }
        }
        ys0 ys0Var4 = this.d;
        if (ys0Var4 != null) {
            ys0Var4.setItemAnimator(null);
        }
    }

    @Override // f2.c0
    public final void q(f2.o1 o1Var) {
    }
}
