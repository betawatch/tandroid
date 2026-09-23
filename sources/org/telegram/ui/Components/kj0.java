package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kj0 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ qj0 b;

    public kj0(qj0 qj0Var, s4.c0 c0Var) {
        this.b = qj0Var;
        this.a = c0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        qj0 qj0Var = this.b;
        if (qj0Var.w && qj0Var.x && !qj0Var.v) {
            int N0 = this.a.N0();
            int h = qj0Var.f.h() - 1;
            loadCount = qj0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                qj0Var.c();
            }
        }
    }
}
