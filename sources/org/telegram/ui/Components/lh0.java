package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class lh0 extends v4.s0 {
    public final /* synthetic */ v4.b0 a;
    public final /* synthetic */ rh0 b;

    public lh0(rh0 rh0Var, v4.b0 b0Var) {
        this.b = rh0Var;
        this.a = b0Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        rh0 rh0Var = this.b;
        if (rh0Var.x && rh0Var.y && !rh0Var.w) {
            int N0 = this.a.N0();
            int b10 = rh0Var.f.b() - 1;
            loadCount = rh0Var.getLoadCount();
            if (N0 >= b10 - loadCount) {
                rh0Var.c();
            }
        }
    }
}
