package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b11 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n11 b;

    public /* synthetic */ b11(n11 n11Var, int i7) {
        this.a = i7;
        this.b = n11Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                n11 n11Var = this.b;
                if (n11Var.l()) {
                    n11Var.m();
                    break;
                }
                break;
            default:
                n11 n11Var2 = this.b;
                if (n11Var2.l()) {
                    n11Var2.m();
                    break;
                }
                break;
        }
    }
}
