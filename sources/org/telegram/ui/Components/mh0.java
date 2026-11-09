package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mh0 extends v4.s0 {
    public final /* synthetic */ v4.b0 a;
    public final /* synthetic */ sh0 b;

    public mh0(sh0 sh0Var, v4.b0 b0Var) {
        this.b = sh0Var;
        this.a = b0Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int loadCount;
        sh0 sh0Var = this.b;
        if (sh0Var.x && sh0Var.y && !sh0Var.w) {
            int N0 = this.a.N0();
            int b10 = sh0Var.f.b() - 1;
            loadCount = sh0Var.getLoadCount();
            if (N0 >= b10 - loadCount) {
                sh0Var.c();
            }
        }
    }
}
