package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ph0 extends v4.t0 {
    public final /* synthetic */ v4.b0 a;
    public final /* synthetic */ vh0 b;

    public ph0(vh0 vh0Var, v4.b0 b0Var) {
        this.b = vh0Var;
        this.a = b0Var;
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        vh0 vh0Var = this.b;
        if (vh0Var.x && vh0Var.y && !vh0Var.w) {
            int N0 = this.a.N0();
            int b10 = vh0Var.f.b() - 1;
            loadCount = vh0Var.getLoadCount();
            if (N0 >= b10 - loadCount) {
                vh0Var.c();
            }
        }
    }
}
