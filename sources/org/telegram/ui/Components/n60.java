package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class n60 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ z60 b;

    public n60(z60 z60Var, s4.c0 c0Var) {
        this.b = z60Var;
        this.a = c0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        z60 z60Var = this.b;
        z60.O(z60Var);
        if (!z60Var.R || z60Var.Q) {
            return;
        }
        if (z60Var.S - this.a.N0() < 10) {
            z60Var.X();
        }
    }
}
