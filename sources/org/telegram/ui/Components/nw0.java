package org.telegram.ui.Components;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class nw0 extends l60 {
    public final /* synthetic */ pw0 d;

    public nw0(pw0 pw0Var) {
        this.d = pw0Var;
    }

    @Override // org.telegram.ui.Components.vo0
    public final CharSequence d() {
        pw0 pw0Var = this.d;
        int i10 = pw0Var.I;
        String[] strArr = pw0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.l60
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.l60
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.l60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
