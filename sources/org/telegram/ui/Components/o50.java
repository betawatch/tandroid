package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o50 extends f2.d1 {
    public final /* synthetic */ f2.m0 a;
    public final /* synthetic */ a60 b;

    public o50(a60 a60Var, f2.m0 m0Var) {
        this.b = a60Var;
        this.a = m0Var;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        a60 a60Var = this.b;
        a60.N(a60Var);
        if (!a60Var.N || a60Var.M) {
            return;
        }
        if (a60Var.O - this.a.N0() < 10) {
            a60Var.W();
        }
    }
}
