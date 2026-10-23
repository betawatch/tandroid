package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class nw0 extends s60 {
    public final /* synthetic */ pw0 d;

    public nw0(pw0 pw0Var) {
        this.d = pw0Var;
    }

    @Override // org.telegram.ui.Components.ap0
    public final CharSequence d() {
        pw0 pw0Var = this.d;
        int i10 = pw0Var.I;
        String[] strArr = pw0Var.F;
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
