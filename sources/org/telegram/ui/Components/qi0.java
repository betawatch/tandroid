package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qi0 extends s4.s0 {
    public final /* synthetic */ s4.a0 a;
    public final /* synthetic */ wi0 b;

    public qi0(wi0 wi0Var, s4.a0 a0Var) {
        this.b = wi0Var;
        this.a = a0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        wi0 wi0Var = this.b;
        if (wi0Var.x && wi0Var.y && !wi0Var.w) {
            int N0 = this.a.N0();
            int b10 = wi0Var.f.b() - 1;
            loadCount = wi0Var.getLoadCount();
            if (N0 >= b10 - loadCount) {
                wi0Var.c();
            }
        }
    }
}
