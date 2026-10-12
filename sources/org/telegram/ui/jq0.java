package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jq0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ qq0 a;

    public jq0(qq0 qq0Var) {
        this.a = qq0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        qq0 qq0Var = this.a;
        if (i10 == -1) {
            qq0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                qq0.U(qq0Var, null);
            }
        } else if (qq0Var.V != null) {
            qq0Var.finishFragment(false);
            qq0Var.V.b();
        }
    }
}
