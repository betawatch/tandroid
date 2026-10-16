package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
