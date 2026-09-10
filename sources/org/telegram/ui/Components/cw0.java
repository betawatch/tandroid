package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class cw0 extends g60 {
    public final /* synthetic */ ew0 d;

    public cw0(ew0 ew0Var) {
        this.d = ew0Var;
    }

    @Override // org.telegram.ui.Components.lo0
    public final CharSequence d() {
        ew0 ew0Var = this.d;
        int i10 = ew0Var.I;
        String[] strArr = ew0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.g60
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.g60
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.g60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
