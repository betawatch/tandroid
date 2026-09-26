package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class uj0 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ ak0 b;

    public uj0(ak0 ak0Var, s4.c0 c0Var) {
        this.b = ak0Var;
        this.a = c0Var;
    }

    @Override // s4.s0
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
