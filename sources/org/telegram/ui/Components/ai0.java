package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ai0 extends v4.u0 {
    public final /* synthetic */ v4.c0 a;
    public final /* synthetic */ gi0 b;

    public ai0(gi0 gi0Var, v4.c0 c0Var) {
        this.b = gi0Var;
        this.a = c0Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        gi0 gi0Var = this.b;
        if (gi0Var.x && gi0Var.y && !gi0Var.w) {
            int N0 = this.a.N0();
            int b10 = gi0Var.f.b() - 1;
            loadCount = gi0Var.getLoadCount();
            if (N0 >= b10 - loadCount) {
                gi0Var.c();
            }
        }
    }
}
