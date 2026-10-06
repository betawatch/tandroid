package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class t60 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ f70 b;

    public t60(f70 f70Var, s4.c0 c0Var) {
        this.b = f70Var;
        this.a = c0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        f70 f70Var = this.b;
        f70.M(f70Var);
        if (!f70Var.R || f70Var.Q) {
            return;
        }
        if (f70Var.S - this.a.N0() < 10) {
            f70Var.W();
        }
    }
}
