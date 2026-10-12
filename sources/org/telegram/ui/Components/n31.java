package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class n31 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y31 b;

    public /* synthetic */ n31(y31 y31Var, int i10) {
        this.a = i10;
        this.b = y31Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                y31 y31Var = this.b;
                if (y31Var.k()) {
                    y31Var.l();
                    break;
                }
                break;
            default:
                y31 y31Var2 = this.b;
                if (y31Var2.k()) {
                    y31Var2.l();
                    break;
                }
                break;
        }
    }
}
