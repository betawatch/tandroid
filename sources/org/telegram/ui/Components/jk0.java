package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jk0 extends s4.u0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ pk0 b;

    public jk0(pk0 pk0Var, s4.c0 c0Var) {
        this.b = pk0Var;
        this.a = c0Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        pk0 pk0Var = this.b;
        if (pk0Var.w && pk0Var.x && !pk0Var.v) {
            int N0 = this.a.N0();
            int h = pk0Var.f.h() - 1;
            loadCount = pk0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                pk0Var.c();
            }
        }
    }
}
