package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tv0 extends a60 {
    public final /* synthetic */ vv0 d;

    public tv0(vv0 vv0Var) {
        this.d = vv0Var;
    }

    @Override // org.telegram.ui.Components.io0
    public final CharSequence d() {
        vv0 vv0Var = this.d;
        int i10 = vv0Var.F;
        String[] strArr = vv0Var.C;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.a60
    public final int i() {
        return this.d.C.length - 1;
    }

    @Override // org.telegram.ui.Components.a60
    public final int j() {
        return this.d.F;
    }

    @Override // org.telegram.ui.Components.a60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
