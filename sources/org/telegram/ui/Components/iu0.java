package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class iu0 extends s4.w {
    public su0 d;
    public final /* synthetic */ aw0 e;

    public iu0(aw0 aw0Var) {
        this.e = aw0Var;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.a.setPressed(false);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        s4.h0 adapter = recyclerView.getAdapter();
        xv0 xv0Var = adapter instanceof xv0 ? (xv0) adapter : null;
        if (!k() || xv0Var == null || !xv0Var.M(e1Var.b())) {
            return s4.w.l(0, 0);
        }
        tu0 tu0Var = this.e.m0[0];
        dt0 dt0Var = tu0Var != null ? tu0Var.h : null;
        this.d = dt0Var;
        if (dt0Var != null) {
            dt0Var.setItemAnimator(tu0Var.d);
        }
        return s4.w.l(15, 0);
    }

    @Override // s4.w
    public final boolean k() {
        aw0 aw0Var = this.e;
        if (aw0Var.E1) {
            return true;
        }
        zs0 zs0Var = aw0Var.b0;
        return zs0Var != null && zs0Var.f;
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        di.z6 z6Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        xv0 xv0Var = adapter instanceof xv0 ? (xv0) adapter : null;
        if (xv0Var == null || !xv0Var.M(e1Var.b()) || !xv0Var.M(e1Var2.b())) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        ArrayList arrayList2 = xv0Var.y;
        if (!xv0Var.h && (z6Var = xv0Var.s) != null && b10 >= 0 && b10 < z6Var.i.size() && b11 >= 0 && b11 < xv0Var.s.i.size()) {
            if ((xv0Var.s instanceof di.s6) || xv0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < xv0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) xv0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(xv0Var.s.g);
            }
            if (!xv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                xv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) xv0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            xv0Var.s.C(arrayList, false);
            xv0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.w
    public final void p(s4.e1 e1Var, int i10) {
        di.z6 z6Var;
        ArrayList arrayList;
        su0 su0Var = this.d;
        if (su0Var != null && e1Var != null) {
            su0Var.d1(false);
        }
        if (i10 != 0) {
            su0 su0Var2 = this.d;
            if (su0Var2 != null) {
                su0Var2.I0(false);
            }
            if (e1Var != null) {
                e1Var.a.setPressed(true);
                return;
            }
            return;
        }
        su0 su0Var3 = this.d;
        if (su0Var3 != null && (su0Var3.getAdapter() instanceof xv0)) {
            xv0 xv0Var = (xv0) this.d.getAdapter();
            ArrayList arrayList2 = xv0Var.y;
            if (!xv0Var.h && (z6Var = xv0Var.s) != null && xv0Var.E) {
                if ((z6Var instanceof di.s6) || xv0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < xv0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) xv0Var.s.i.get(i11)).getId()));
                    }
                } else {
                    arrayList = z6Var.g;
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
                    xv0Var.s.C(arrayList, true);
                }
                xv0Var.E = false;
            }
        }
        su0 su0Var4 = this.d;
        if (su0Var4 != null) {
            su0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.w
    public final void q(s4.e1 e1Var) {
    }
}
