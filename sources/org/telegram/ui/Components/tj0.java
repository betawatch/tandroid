package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tj0 extends f2.a1 {
    public final /* synthetic */ f2.j0 a;
    public final /* synthetic */ zj0 b;

    public tj0(zj0 zj0Var, f2.j0 j0Var) {
        this.b = zj0Var;
        this.a = j0Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        zj0 zj0Var = this.b;
        if (zj0Var.w && zj0Var.x && !zj0Var.v) {
            int N0 = this.a.N0();
            int h = zj0Var.f.h() - 1;
            loadCount = zj0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                zj0Var.c();
            }
        }
    }
}
