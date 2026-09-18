package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
