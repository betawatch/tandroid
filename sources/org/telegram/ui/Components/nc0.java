package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class nc0 extends co0 {
    public final /* synthetic */ tc0 d;

    public nc0(tc0 tc0Var) {
        this.d = tc0Var;
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
        tc0 tc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = tc0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(tc0Var.G)) : tc0Var.d(tc0Var.G);
    }
}
