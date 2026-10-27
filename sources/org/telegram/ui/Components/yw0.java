package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yw0 extends v60 {
    public final /* synthetic */ ax0 d;

    public yw0(ax0 ax0Var) {
        this.d = ax0Var;
    }

    @Override // org.telegram.ui.Components.kp0
    public final CharSequence d() {
        ax0 ax0Var = this.d;
        int i10 = ax0Var.I;
        String[] strArr = ax0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.v60
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.v60
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.v60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
