package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class jj0 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ pj0 b;

    public jj0(pj0 pj0Var, s4.c0 c0Var) {
        this.b = pj0Var;
        this.a = c0Var;
    }

    @Override // s4.s0
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
