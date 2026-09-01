package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class uj0 extends f2.a1 {
    public final /* synthetic */ f2.j0 a;
    public final /* synthetic */ ak0 b;

    public uj0(ak0 ak0Var, f2.j0 j0Var) {
        this.b = ak0Var;
        this.a = j0Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        ak0 ak0Var = this.b;
        if (ak0Var.w && ak0Var.x && !ak0Var.v) {
            int N0 = this.a.N0();
            int h = ak0Var.f.h() - 1;
            loadCount = ak0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                ak0Var.c();
            }
        }
    }
}
