package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class bd0 extends s4.s0 {
    public final /* synthetic */ kd0 a;

    public bd0(kd0 kd0Var) {
        this.a = kd0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        kd0 kd0Var = this.a;
        kd0Var.Q = z10;
        if (z10 || kd0Var.L == null) {
            return;
        }
        kd0Var.L = null;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        kd0 kd0Var = this.a;
        kd0Var.A0(false);
        if (kd0Var.L != null) {
            kd0Var.N += i11;
        }
    }
}
