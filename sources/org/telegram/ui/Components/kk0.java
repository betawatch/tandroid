package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
