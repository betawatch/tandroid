package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
