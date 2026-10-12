package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class y8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9 b;

    public /* synthetic */ y8(h9 h9Var, int i10) {
        this.a = i10;
        this.b = h9Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    h9.U(this.b);
                    break;
                }
                break;
            default:
                h9 h9Var = this.b;
                if (i10 == -1) {
                    h9.U(h9Var);
                }
                if (i10 == 1) {
                    h9Var.f0();
                    break;
                }
                break;
        }
    }
}
