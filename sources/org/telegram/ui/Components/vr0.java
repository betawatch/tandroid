package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class vr0 extends s4.v {
    public bu0 d;
    public final /* synthetic */ jv0 e;

    public vr0(jv0 jv0Var) {
        this.e = jv0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        s4.h0 adapter = recyclerView.getAdapter();
        gv0 gv0Var = adapter instanceof gv0 ? (gv0) adapter : null;
        if (!k() || gv0Var == null || !gv0Var.M(c1Var.b())) {
            return s4.v.l(0, 0);
        }
        cu0 cu0Var = this.e.k0[0];
        is0 is0Var = cu0Var != null ? cu0Var.h : null;
        this.d = is0Var;
        if (is0Var != null) {
            is0Var.setItemAnimator(cu0Var.d);
        }
        return s4.v.l(15, 0);
    }

    @Override // s4.v
    public final boolean k() {
        jv0 jv0Var = this.e;
        if (jv0Var.C1) {
            return true;
        }
        es0 es0Var = jv0Var.W;
        return es0Var != null && es0Var.w;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        ai.d9 d9Var;
        ArrayList arrayList;
        s4.h0 adapter = recyclerView.getAdapter();
        gv0 gv0Var = adapter instanceof gv0 ? (gv0) adapter : null;
        if (gv0Var == null || !gv0Var.M(c1Var.b()) || !gv0Var.M(c1Var2.b())) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        ArrayList arrayList2 = gv0Var.y;
        if (!gv0Var.h && (d9Var = gv0Var.s) != null && b10 >= 0 && b10 < d9Var.i.size() && b11 >= 0 && b11 < gv0Var.s.i.size()) {
            if ((gv0Var.s instanceof ai.t8) || gv0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < gv0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) gv0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(gv0Var.s.g);
            }
            if (!gv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                gv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) gv0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            gv0Var.s.C(arrayList, false);
            gv0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        ai.d9 d9Var;
        ArrayList arrayList;
        bu0 bu0Var = this.d;
        if (bu0Var != null && c1Var != null) {
            bu0Var.e1(false);
        }
        if (i10 != 0) {
            bu0 bu0Var2 = this.d;
            if (bu0Var2 != null) {
                bu0Var2.J0(false);
            }
            if (c1Var != null) {
                c1Var.a.setPressed(true);
                return;
            }
            return;
        }
        bu0 bu0Var3 = this.d;
        if (bu0Var3 != null && (bu0Var3.getAdapter() instanceof gv0)) {
            gv0 gv0Var = (gv0) this.d.getAdapter();
            ArrayList arrayList2 = gv0Var.y;
            if (!gv0Var.h && (d9Var = gv0Var.s) != null && gv0Var.E) {
                if ((d9Var instanceof ai.t8) || gv0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < gv0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) gv0Var.s.i.get(i11)).getId()));
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
                    gv0Var.s.C(arrayList, true);
                }
                gv0Var.E = false;
            }
        }
        bu0 bu0Var4 = this.d;
        if (bu0Var4 != null) {
            bu0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
