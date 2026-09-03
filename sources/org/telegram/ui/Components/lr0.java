package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lr0 extends f2.b0 {
    public pt0 d;
    public final /* synthetic */ yu0 e;

    public lr0(yu0 yu0Var) {
        this.e = yu0Var;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        l1Var.a.setPressed(false);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        f2.o0 adapter = recyclerView.getAdapter();
        vu0 vu0Var = adapter instanceof vu0 ? (vu0) adapter : null;
        if (!k() || vu0Var == null || !vu0Var.M(l1Var.b())) {
            return f2.b0.l(0, 0);
        }
        qt0 qt0Var = this.e.h0[0];
        wr0 wr0Var = qt0Var != null ? qt0Var.h : null;
        this.d = wr0Var;
        if (wr0Var != null) {
            wr0Var.setItemAnimator(qt0Var.d);
        }
        return f2.b0.l(15, 0);
    }

    @Override // f2.b0
    public final boolean k() {
        yu0 yu0Var = this.e;
        if (yu0Var.z1) {
            return true;
        }
        sr0 sr0Var = yu0Var.T;
        return sr0Var != null && sr0Var.w;
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        nh.l6 l6Var;
        ArrayList arrayList;
        f2.o0 adapter = recyclerView.getAdapter();
        vu0 vu0Var = adapter instanceof vu0 ? (vu0) adapter : null;
        if (vu0Var == null || !vu0Var.M(l1Var.b()) || !vu0Var.M(l1Var2.b())) {
            return false;
        }
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        ArrayList arrayList2 = vu0Var.y;
        if (!vu0Var.h && (l6Var = vu0Var.s) != null && b10 >= 0 && b10 < l6Var.i.size() && b11 >= 0 && b11 < vu0Var.s.i.size()) {
            if ((vu0Var.s instanceof nh.d6) || vu0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < vu0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) vu0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(vu0Var.s.g);
            }
            if (!vu0Var.B) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                vu0Var.B = true;
            }
            MessageObject messageObject = (MessageObject) vu0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            vu0Var.s.C(arrayList, false);
            vu0Var.p(b10, b11);
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.l1 l1Var, int i10) {
        nh.l6 l6Var;
        ArrayList arrayList;
        pt0 pt0Var = this.d;
        if (pt0Var != null && l1Var != null) {
            pt0Var.c1(false);
        }
        if (i10 != 0) {
            pt0 pt0Var2 = this.d;
            if (pt0Var2 != null) {
                pt0Var2.I0(false);
            }
            if (l1Var != null) {
                l1Var.a.setPressed(true);
                return;
            }
            return;
        }
        pt0 pt0Var3 = this.d;
        if (pt0Var3 != null && (pt0Var3.getAdapter() instanceof vu0)) {
            vu0 vu0Var = (vu0) this.d.getAdapter();
            ArrayList arrayList2 = vu0Var.y;
            if (!vu0Var.h && (l6Var = vu0Var.s) != null && vu0Var.B) {
                if ((l6Var instanceof nh.d6) || vu0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < vu0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) vu0Var.s.i.get(i11)).getId()));
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
                    vu0Var.s.C(arrayList, true);
                }
                vu0Var.B = false;
            }
        }
        pt0 pt0Var4 = this.d;
        if (pt0Var4 != null) {
            pt0Var4.setItemAnimator(null);
        }
    }

    @Override // f2.b0
    public final void q(f2.l1 l1Var) {
    }
}
