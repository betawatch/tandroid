package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ks0 extends s4.v {
    public pu0 d;
    public final /* synthetic */ xv0 e;

    public ks0(xv0 xv0Var) {
        this.e = xv0Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        s4.g0 adapter = recyclerView.getAdapter();
        uv0 uv0Var = adapter instanceof uv0 ? (uv0) adapter : null;
        if (!k() || uv0Var == null || !uv0Var.M(b1Var.b())) {
            return s4.v.l(0, 0);
        }
        qu0 qu0Var = this.e.k0[0];
        ws0 ws0Var = qu0Var != null ? qu0Var.h : null;
        this.d = ws0Var;
        if (ws0Var != null) {
            ws0Var.setItemAnimator(qu0Var.d);
        }
        return s4.v.l(15, 0);
    }

    @Override // s4.v
    public final boolean k() {
        xv0 xv0Var = this.e;
        if (xv0Var.C1) {
            return true;
        }
        ss0 ss0Var = xv0Var.W;
        return ss0Var != null && ss0Var.w;
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        ci.z6 z6Var;
        ArrayList arrayList;
        s4.g0 adapter = recyclerView.getAdapter();
        uv0 uv0Var = adapter instanceof uv0 ? (uv0) adapter : null;
        if (uv0Var == null || !uv0Var.M(b1Var.b()) || !uv0Var.M(b1Var2.b())) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ArrayList arrayList2 = uv0Var.y;
        if (!uv0Var.h && (z6Var = uv0Var.s) != null && b10 >= 0 && b10 < z6Var.i.size() && b11 >= 0 && b11 < uv0Var.s.i.size()) {
            if ((uv0Var.s instanceof ci.s6) || uv0Var.n > 0) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < uv0Var.s.i.size(); i10++) {
                    arrayList.add(Integer.valueOf(((MessageObject) uv0Var.s.i.get(i10)).getId()));
                }
            } else {
                arrayList = new ArrayList(uv0Var.s.g);
            }
            if (!uv0Var.E) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                uv0Var.E = true;
            }
            MessageObject messageObject = (MessageObject) uv0Var.s.i.get(b10);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            uv0Var.s.C(arrayList, false);
            uv0Var.p(b10, b11);
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        ci.z6 z6Var;
        ArrayList arrayList;
        pu0 pu0Var = this.d;
        if (pu0Var != null && b1Var != null) {
            pu0Var.e1(false);
        }
        if (i10 != 0) {
            pu0 pu0Var2 = this.d;
            if (pu0Var2 != null) {
                pu0Var2.I0(false);
            }
            if (b1Var != null) {
                b1Var.a.setPressed(true);
                return;
            }
            return;
        }
        pu0 pu0Var3 = this.d;
        if (pu0Var3 != null && (pu0Var3.getAdapter() instanceof uv0)) {
            uv0 uv0Var = (uv0) this.d.getAdapter();
            ArrayList arrayList2 = uv0Var.y;
            if (!uv0Var.h && (z6Var = uv0Var.s) != null && uv0Var.E) {
                if ((z6Var instanceof ci.s6) || uv0Var.n > 0) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < uv0Var.s.i.size(); i11++) {
                        arrayList.add(Integer.valueOf(((MessageObject) uv0Var.s.i.get(i11)).getId()));
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
                    uv0Var.s.C(arrayList, true);
                }
                uv0Var.E = false;
            }
        }
        pu0 pu0Var4 = this.d;
        if (pu0Var4 != null) {
            pu0Var4.setItemAnimator(null);
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}
