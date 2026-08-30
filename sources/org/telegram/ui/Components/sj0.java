package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sj0 extends f2.z0 {
    public final /* synthetic */ f2.i0 a;
    public final /* synthetic */ yj0 b;

    public sj0(yj0 yj0Var, f2.i0 i0Var) {
        this.b = yj0Var;
        this.a = i0Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        yj0 yj0Var = this.b;
        if (yj0Var.w && yj0Var.x && !yj0Var.v) {
            int N0 = this.a.N0();
            int h = yj0Var.f.h() - 1;
            loadCount = yj0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                yj0Var.c();
            }
        }
    }
}
