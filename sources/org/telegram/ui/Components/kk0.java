package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kk0 extends s4.u0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ qk0 b;

    public kk0(qk0 qk0Var, s4.c0 c0Var) {
        this.b = qk0Var;
        this.a = c0Var;
    }

    @Override // s4.u0
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
