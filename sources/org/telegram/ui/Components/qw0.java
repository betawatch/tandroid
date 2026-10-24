package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class qw0 extends t60 {
    public final /* synthetic */ sw0 d;

    public qw0(sw0 sw0Var) {
        this.d = sw0Var;
    }

    @Override // org.telegram.ui.Components.ep0
    public final CharSequence d() {
        sw0 sw0Var = this.d;
        int i10 = sw0Var.I;
        String[] strArr = sw0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.t60
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.t60
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.t60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
