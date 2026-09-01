package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mr0 extends f2.b0 {
    public qt0 d;
    public final /* synthetic */ zu0 e;

    public mr0(zu0 zu0Var) {
        this.e = zu0Var;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        m1Var.a.setPressed(false);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        f2.p0 adapter = recyclerView.getAdapter();
        wu0 wu0Var = adapter instanceof wu0 ? (wu0) adapter : null;
        if (!k() || wu0Var == null || !wu0Var.M(m1Var.b())) {
            return f2.b0.l(0, 0);
        }
        rt0 rt0Var = this.e.h0[0];
        xr0 xr0Var = rt0Var != null ? rt0Var.h : null;
        this.d = xr0Var;
        if (xr0Var != null) {
            xr0Var.setItemAnimator(rt0Var.d);
        }
        return f2.b0.l(15, 0);
    }

    @Override // f2.b0
    public final boolean k() {
        zu0 zu0Var = this.e;
        if (zu0Var.z1) {
            return true;
        }
        tr0 tr0Var = zu0Var.T;
        return tr0Var != null && tr0Var.w;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        oh.l6 l6Var;
        ArrayList arrayList;
        f2.p0 adapter = recyclerView.getAdapter();
        wu0 wu0Var = adapter instanceof wu0 ? (wu0) adapter : null;
        if (wu0Var == null || !wu0Var.M(m1Var.b()) || !wu0Var.M(m1Var2.b())) {
            return false;
        }
        int b10 = m1Var.b();
        int b11 = m1Var2.b();
        ArrayList arrayList2 = wu0Var.y;
        if (!wu0Var.h && (l6Var = wu0Var.s) != null && b10 >= 0 && b10 < l6Var.i.size() && b11 >= 0 && b11 < wu0Var.s.i.size()) {
            if ((wu0Var.s instanceof oh.d6) || wu0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < wu0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) wu0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(wu0Var.s.g);
            }
            if (!wu0Var.B) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                wu0Var.B = true;
            }
            MessageObject messageObject = (MessageObject) wu0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            wu0Var.s.C(arrayList, false);
            wu0Var.p(b10, b11);
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.m1 m1Var, int i10) {
        oh.l6 l6Var;
        ArrayList arrayList;
        qt0 qt0Var = this.d;
        if (qt0Var != null && m1Var != null) {
            qt0Var.d1(false);
        }
        if (i10 != 0) {
            qt0 qt0Var2 = this.d;
            if (qt0Var2 != null) {
                qt0Var2.I0(false);
            }
            if (m1Var != null) {
                m1Var.a.setPressed(true);
                return;
            }
            return;
        }
        qt0 qt0Var3 = this.d;
        if (qt0Var3 != null && (qt0Var3.getAdapter() instanceof wu0)) {
            wu0 wu0Var = (wu0) this.d.getAdapter();
            ArrayList arrayList2 = wu0Var.y;
            if (!wu0Var.h && (l6Var = wu0Var.s) != null && wu0Var.B) {
                if ((l6Var instanceof oh.d6) || wu0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < wu0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) wu0Var.s.i.get(i11)).getId()));
                    }
                } else {
                    arrayList = l6Var.g;
                }
                boolean z4 = arrayList2.size() != arrayList.size();
                if (!z4) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        if (arrayList2.get(i12) != arrayList.get(i12)) {
                            z4 = true;
                            break;
                        }
                        i12++;
                    }
                }
                if (z4) {
                    wu0Var.s.C(arrayList, true);
                }
                wu0Var.B = false;
            }
        }
        qt0 qt0Var4 = this.d;
        if (qt0Var4 != null) {
            qt0Var4.setItemAnimator(null);
        }
    }

    @Override // f2.b0
    public final void q(f2.m1 m1Var) {
    }
}
