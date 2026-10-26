package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xw0 extends u60 {
    public final /* synthetic */ zw0 d;

    public xw0(zw0 zw0Var) {
        this.d = zw0Var;
    }

    @Override // org.telegram.ui.Components.jp0
    public final CharSequence d() {
        zw0 zw0Var = this.d;
        int i10 = zw0Var.I;
        String[] strArr = zw0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.u60
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.u60
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.u60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
