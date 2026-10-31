package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pi0 extends s4.s0 {
    public final /* synthetic */ s4.a0 a;
    public final /* synthetic */ vi0 b;

    public pi0(vi0 vi0Var, s4.a0 a0Var) {
        this.b = vi0Var;
        this.a = a0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        vi0 vi0Var = this.b;
        if (vi0Var.x && vi0Var.y && !vi0Var.w) {
            int N0 = this.a.N0();
            int b10 = vi0Var.f.b() - 1;
            loadCount = vi0Var.getLoadCount();
            if (N0 >= b10 - loadCount) {
                vi0Var.c();
            }
        }
    }
}
