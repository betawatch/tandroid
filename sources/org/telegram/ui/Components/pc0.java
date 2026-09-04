package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class pc0 extends co0 {
    public final /* synthetic */ vc0 d;

    public pc0(vc0 vc0Var) {
        this.d = vc0Var;
    }

    @Override // org.telegram.ui.Components.co0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.co0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.co0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.co0
    public final CharSequence d() {
        vc0 vc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = vc0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(vc0Var.G)) : vc0Var.d(vc0Var.G);
    }
}
