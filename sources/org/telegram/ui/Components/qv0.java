package org.telegram.ui.Components;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class qv0 extends x50 {
    public final /* synthetic */ sv0 d;

    public qv0(sv0 sv0Var) {
        this.d = sv0Var;
    }

    @Override // org.telegram.ui.Components.co0
    public final CharSequence d() {
        sv0 sv0Var = this.d;
        int i10 = sv0Var.I;
        String[] strArr = sv0Var.F;
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
