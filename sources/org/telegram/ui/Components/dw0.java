package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class dw0 extends g60 {
    public final /* synthetic */ fw0 d;

    public dw0(fw0 fw0Var) {
        this.d = fw0Var;
    }

    @Override // org.telegram.ui.Components.qo0
    public final CharSequence d() {
        fw0 fw0Var = this.d;
        int i10 = fw0Var.I;
        String[] strArr = fw0Var.F;
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
