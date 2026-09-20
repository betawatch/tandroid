package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
