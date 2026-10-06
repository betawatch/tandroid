package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class wj0 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ ck0 b;

    public wj0(ck0 ck0Var, s4.c0 c0Var) {
        this.b = ck0Var;
        this.a = c0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        ck0 ck0Var = this.b;
        if (ck0Var.w && ck0Var.x && !ck0Var.v) {
            int N0 = this.a.N0();
            int h = ck0Var.f.h() - 1;
            loadCount = ck0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                ck0Var.c();
            }
        }
    }
}
