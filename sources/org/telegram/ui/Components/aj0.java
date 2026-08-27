package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class aj0 extends f2.b1 {
    public final /* synthetic */ f2.k0 a;
    public final /* synthetic */ gj0 b;

    public aj0(gj0 gj0Var, f2.k0 k0Var) {
        this.b = gj0Var;
        this.a = k0Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int loadCount;
        gj0 gj0Var = this.b;
        if (gj0Var.w && gj0Var.x && !gj0Var.v) {
            int N0 = this.a.N0();
            int h = gj0Var.f.h() - 1;
            loadCount = gj0Var.getLoadCount();
            if (N0 >= h - loadCount) {
                gj0Var.c();
            }
        }
    }
}
