package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class cw0 extends i60 {
    public final /* synthetic */ ew0 d;

    public cw0(ew0 ew0Var) {
        this.d = ew0Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final CharSequence d() {
        ew0 ew0Var = this.d;
        int i10 = ew0Var.I;
        String[] strArr = ew0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.i60
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.i60
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.i60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
