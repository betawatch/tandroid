package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jv0 extends t50 {
    public final /* synthetic */ lv0 d;

    public jv0(lv0 lv0Var) {
        this.d = lv0Var;
    }

    @Override // org.telegram.ui.Components.xn0
    public final CharSequence d() {
        lv0 lv0Var = this.d;
        int i10 = lv0Var.E;
        String[] strArr = lv0Var.B;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.t50
    public final int i() {
        return this.d.B.length - 1;
    }

    @Override // org.telegram.ui.Components.t50
    public final int j() {
        return this.d.E;
    }

    @Override // org.telegram.ui.Components.t50
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
