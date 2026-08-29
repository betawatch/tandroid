package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jj0 extends f2.a1 {
    public final /* synthetic */ f2.j0 a;
    public final /* synthetic */ pj0 b;

    public jj0(pj0 pj0Var, f2.j0 j0Var) {
        this.b = pj0Var;
        this.a = j0Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        pj0 pj0Var = this.b;
        if (pj0Var.w && pj0Var.x && !pj0Var.v) {
            int N0 = this.a.N0();
            int h = pj0Var.f.h() - 1;
            loadCount = pj0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                pj0Var.c();
            }
        }
    }
}
