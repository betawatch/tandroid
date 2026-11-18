package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class yh0 extends v4.u0 {
    public final /* synthetic */ v4.c0 a;
    public final /* synthetic */ ei0 b;

    public yh0(ei0 ei0Var, v4.c0 c0Var) {
        this.b = ei0Var;
        this.a = c0Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        ei0 ei0Var = this.b;
        if (ei0Var.x && ei0Var.y && !ei0Var.w) {
            int N0 = this.a.N0();
            int b10 = ei0Var.f.b() - 1;
            loadCount = ei0Var.getLoadCount();
            if (N0 >= b10 - loadCount) {
                ei0Var.c();
            }
        }
    }
}
