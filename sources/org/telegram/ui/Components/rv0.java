package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class rv0 extends y50 {
    public final /* synthetic */ tv0 d;

    public rv0(tv0 tv0Var) {
        this.d = tv0Var;
    }

    @Override // org.telegram.ui.Components.co0
    public final CharSequence d() {
        tv0 tv0Var = this.d;
        int i10 = tv0Var.I;
        String[] strArr = tv0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.y50
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.y50
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.y50
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
