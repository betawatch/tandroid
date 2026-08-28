package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class po0 extends f2.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uo0 b;

    public po0(uo0 uo0Var, int i9) {
        this.b = uo0Var;
        this.a = i9;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        uo0 uo0Var = this.b;
        zo0 zo0Var = uo0Var.f0;
        if (uo0Var.B != null) {
            if (uo0Var.A == null || !uo0Var.c()) {
                return;
            }
            uo0Var.A.g(false);
            return;
        }
        gh.n7 n7Var = this.a == 1 ? zo0Var.c : zo0Var.b;
        if (n7Var == null || !uo0Var.c()) {
            return;
        }
        n7Var.a();
    }
}
