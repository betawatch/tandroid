package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h60 extends f2.z0 {
    public final /* synthetic */ f2.i0 a;
    public final /* synthetic */ t60 b;

    public h60(t60 t60Var, f2.i0 i0Var) {
        this.b = t60Var;
        this.a = i0Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t60 t60Var = this.b;
        t60.O(t60Var);
        if (!t60Var.O || t60Var.N) {
            return;
        }
        if (t60Var.P - this.a.N0() < 10) {
            t60Var.X();
        }
    }
}
