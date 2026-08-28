package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jr0 extends f2.d1 {
    public final /* synthetic */ ar0 a;
    public final /* synthetic */ br0 b;
    public final /* synthetic */ eu0 c;

    public jr0(eu0 eu0Var, ar0 ar0Var, br0 br0Var) {
        this.c = eu0Var;
        this.a = ar0Var;
        this.b = br0Var;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        this.c.X0 = i9 != 0;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int i11;
        int i12;
        eu0 eu0Var = this.c;
        tt0[] tt0VarArr = eu0Var.p1;
        br0 br0Var = this.b;
        ar0 ar0Var = this.a;
        eu0Var.G(ar0Var, (wk0) recyclerView, br0Var);
        if (i10 != 0 && ((i12 = eu0Var.g0[0].B) == 0 || i12 == 5)) {
            tt0VarArr[0].a.isEmpty();
        }
        if (i10 != 0 && ((i11 = ar0Var.B) == 0 || eu0.p0(i11))) {
            eu0.q(ar0Var, tt0VarArr, true);
        }
        ar0Var.h.K0(true);
        if (ar0Var.C != null) {
            ar0Var.invalidate();
        }
        eu0Var.o0();
    }
}
