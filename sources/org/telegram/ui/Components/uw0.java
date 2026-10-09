package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class uw0 extends z60 {
    public final /* synthetic */ ww0 d;

    public uw0(ww0 ww0Var) {
        this.d = ww0Var;
    }

    @Override // org.telegram.ui.Components.hp0
    public final CharSequence d() {
        ww0 ww0Var = this.d;
        int i10 = ww0Var.I;
        String[] strArr = ww0Var.F;
        if (i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.z60
    public final int i() {
        return this.d.F.length - 1;
    }

    @Override // org.telegram.ui.Components.z60
    public final int j() {
        return this.d.I;
    }

    @Override // org.telegram.ui.Components.z60
    public final void k(int i10) {
        this.d.setOption(i10);
    }
}
