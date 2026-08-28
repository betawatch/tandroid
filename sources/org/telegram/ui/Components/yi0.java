package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yi0 extends f2.d1 {
    public final /* synthetic */ f2.m0 a;
    public final /* synthetic */ ej0 b;

    public yi0(ej0 ej0Var, f2.m0 m0Var) {
        this.b = ej0Var;
        this.a = m0Var;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int loadCount;
        ej0 ej0Var = this.b;
        if (ej0Var.w && ej0Var.x && !ej0Var.v) {
            int N0 = this.a.N0();
            int h = ej0Var.f.h() - 1;
            loadCount = ej0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                ej0Var.c();
            }
        }
    }
}
