package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class kk0 extends s4.r0 {
    public final /* synthetic */ s4.b0 a;
    public final /* synthetic */ qk0 b;

    public kk0(qk0 qk0Var, s4.b0 b0Var) {
        this.b = qk0Var;
        this.a = b0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        qk0 qk0Var = this.b;
        if (qk0Var.w && qk0Var.x && !qk0Var.v) {
            int N0 = this.a.N0();
            int h = qk0Var.f.h() - 1;
            loadCount = qk0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                qk0Var.c();
            }
        }
    }
}
