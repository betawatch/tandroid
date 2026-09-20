package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class tj0 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ zj0 b;

    public tj0(zj0 zj0Var, s4.c0 c0Var) {
        this.b = zj0Var;
        this.a = c0Var;
    }

    @Override // s4.s0
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
