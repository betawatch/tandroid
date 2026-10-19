package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class gk0 extends s4.r0 {
    public final /* synthetic */ s4.b0 a;
    public final /* synthetic */ mk0 b;

    public gk0(mk0 mk0Var, s4.b0 b0Var) {
        this.b = mk0Var;
        this.a = b0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        mk0 mk0Var = this.b;
        if (mk0Var.w && mk0Var.x && !mk0Var.v) {
            int N0 = this.a.N0();
            int h = mk0Var.f.h() - 1;
            loadCount = mk0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                mk0Var.c();
            }
        }
    }
}
