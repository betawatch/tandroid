package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ew0 extends k60 {
    public final /* synthetic */ gw0 d;

    public ew0(gw0 gw0Var) {
        this.d = gw0Var;
    }

    @Override // org.telegram.ui.Components.ro0
    public final CharSequence d() {
        gw0 gw0Var = this.d;
        int i10 = gw0Var.I;
        String[] strArr = gw0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.k60
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.k60
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.k60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
