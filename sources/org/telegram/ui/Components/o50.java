package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class o50 extends v4.u0 {
    public final /* synthetic */ v4.c0 a;
    public final /* synthetic */ a60 b;

    public o50(a60 a60Var, v4.c0 c0Var) {
        this.b = a60Var;
        this.a = c0Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        a60 a60Var = this.b;
        a60.J0(a60Var);
        if (!a60Var.M1 || a60Var.L1) {
            return;
        }
        if (a60Var.N1 - this.a.N0() < 10) {
            a60Var.L0();
        }
    }
}
