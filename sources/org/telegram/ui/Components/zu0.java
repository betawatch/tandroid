package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zu0 extends g50 {
    public final /* synthetic */ bv0 d;

    public zu0(bv0 bv0Var) {
        this.d = bv0Var;
    }

    @Override // org.telegram.ui.Components.mn0
    public final CharSequence d() {
        bv0 bv0Var = this.d;
        int i9 = bv0Var.E;
        String[] strArr = bv0Var.B;
        if (i9 < strArr.length) {
            return strArr[i9];
        }
        return null;
    }

    @Override // org.telegram.ui.Components.g50
    public final int i() {
        return this.d.B.length - 1;
    }

    @Override // org.telegram.ui.Components.g50
    public final int j() {
        return this.d.E;
    }

    @Override // org.telegram.ui.Components.g50
    public final void k(int i9) {
        this.d.setOption(i9);
    }
}
