package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bv0 extends l50 {
    public final /* synthetic */ dv0 d;

    public bv0(dv0 dv0Var) {
        this.d = dv0Var;
    }

    @Override // org.telegram.ui.Components.nn0
    public final CharSequence d() {
        dv0 dv0Var = this.d;
        int i10 = dv0Var.E;
        String[] strArr = dv0Var.B;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.l50
    public final int i() {
        return this.d.B.length - 1;
    }

    @Override // org.telegram.ui.Components.l50
    public final int j() {
        return this.d.E;
    }

    @Override // org.telegram.ui.Components.l50
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
