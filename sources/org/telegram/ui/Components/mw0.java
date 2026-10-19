package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class mw0 extends s60 {
    public final /* synthetic */ ow0 d;

    public mw0(ow0 ow0Var) {
        this.d = ow0Var;
    }

    @Override // org.telegram.ui.Components.zo0
    public final CharSequence d() {
        ow0 ow0Var = this.d;
        int i10 = ow0Var.I;
        String[] strArr = ow0Var.F;
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
