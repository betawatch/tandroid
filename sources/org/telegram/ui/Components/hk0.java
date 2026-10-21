package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class hk0 extends s4.r0 {
    public final /* synthetic */ s4.b0 a;
    public final /* synthetic */ nk0 b;

    public hk0(nk0 nk0Var, s4.b0 b0Var) {
        this.b = nk0Var;
        this.a = b0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        nk0 nk0Var = this.b;
        if (nk0Var.w && nk0Var.x && !nk0Var.v) {
            int N0 = this.a.N0();
            int h = nk0Var.f.h() - 1;
            loadCount = nk0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                nk0Var.c();
            }
        }
    }
}
