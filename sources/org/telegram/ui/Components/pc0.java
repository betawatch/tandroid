package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
