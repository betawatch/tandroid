package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class od0 extends dp0 {
    public final /* synthetic */ ud0 d;

    public od0(ud0 ud0Var) {
        this.d = ud0Var;
    }

    @Override // org.telegram.ui.Components.dp0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.dp0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.dp0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.dp0
    public final CharSequence d() {
        ud0 ud0Var = this.d;
        Utilities.CallbackReturn callbackReturn = ud0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(ud0Var.G)) : ud0Var.d(ud0Var.G);
    }
}
