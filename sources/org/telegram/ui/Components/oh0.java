package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oh0 extends u4.t0 {
    public final /* synthetic */ u4.b0 a;
    public final /* synthetic */ uh0 b;

    public oh0(uh0 uh0Var, u4.b0 b0Var) {
        this.b = uh0Var;
        this.a = b0Var;
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        int loadCount;
        uh0 uh0Var = this.b;
        if (uh0Var.x && uh0Var.y && !uh0Var.w) {
            int N0 = this.a.N0();
            int b10 = uh0Var.f.b() - 1;
            loadCount = uh0Var.getLoadCount();
            if (N0 >= b10 - loadCount) {
                uh0Var.c();
            }
        }
    }
}
