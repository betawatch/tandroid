package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fp0 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp0 b;

    public fp0(lp0 lp0Var, int i10) {
        this.b = lp0Var;
        this.a = i10;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lp0 lp0Var = this.b;
        rp0 rp0Var = lp0Var.p0;
        lp0Var.h();
        if (lp0Var.K != null) {
            if (lp0Var.J == null || !lp0Var.c()) {
                return;
            }
            lp0Var.J.g(false);
            return;
        }
        bi.t9 t9Var = this.a == 1 ? rp0Var.c : rp0Var.b;
        if (t9Var == null || !lp0Var.c()) {
            return;
        }
        t9Var.b();
    }
}
