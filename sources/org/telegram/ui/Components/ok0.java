package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ok0 extends s4.t0 {
    public final /* synthetic */ s4.d0 a;
    public final /* synthetic */ uk0 b;

    public ok0(uk0 uk0Var, s4.d0 d0Var) {
        this.b = uk0Var;
        this.a = d0Var;
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        uk0 uk0Var = this.b;
        if (uk0Var.w && uk0Var.x && !uk0Var.v) {
            int N0 = this.a.N0();
            int h = uk0Var.f.h() - 1;
            loadCount = uk0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                uk0Var.c();
            }
        }
    }
}
