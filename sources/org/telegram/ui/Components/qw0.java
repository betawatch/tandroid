package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qw0 extends v60 {
    public final /* synthetic */ sw0 d;

    public qw0(sw0 sw0Var) {
        this.d = sw0Var;
    }

    @Override // org.telegram.ui.Components.dp0
    public final CharSequence d() {
        sw0 sw0Var = this.d;
        int i10 = sw0Var.I;
        String[] strArr = sw0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.v60
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.v60
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.v60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
