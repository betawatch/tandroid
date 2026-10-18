package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class lw0 extends s60 {
    public final /* synthetic */ nw0 d;

    public lw0(nw0 nw0Var) {
        this.d = nw0Var;
    }

    @Override // org.telegram.ui.Components.zo0
    public final CharSequence d() {
        nw0 nw0Var = this.d;
        int i10 = nw0Var.I;
        String[] strArr = nw0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.s60
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.s60
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.s60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
