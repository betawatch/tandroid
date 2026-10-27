package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c70 extends s4.u0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ o70 b;

    public c70(o70 o70Var, s4.c0 c0Var) {
        this.b = o70Var;
        this.a = c0Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        o70 o70Var = this.b;
        o70.O(o70Var);
        if (!o70Var.R || o70Var.Q) {
            return;
        }
        if (o70Var.S - this.a.N0() < 10) {
            o70Var.Y();
        }
    }
}
