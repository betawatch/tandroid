package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class rv0 extends x50 {
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

    @Override // org.telegram.ui.Components.x50
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.x50
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.x50
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
