package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ad0 extends s4.s0 {
    public final /* synthetic */ jd0 a;

    public ad0(jd0 jd0Var) {
        this.a = jd0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        jd0 jd0Var = this.a;
        jd0Var.Q = z10;
        if (z10 || jd0Var.L == null) {
            return;
        }
        jd0Var.L = null;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jd0 jd0Var = this.a;
        jd0Var.A0(false);
        if (jd0Var.L != null) {
            jd0Var.N += i11;
        }
    }
}
