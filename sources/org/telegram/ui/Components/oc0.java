package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class oc0 extends co0 {
    public final /* synthetic */ uc0 d;

    public oc0(uc0 uc0Var) {
        this.d = uc0Var;
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
        uc0 uc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = uc0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(uc0Var.G)) : uc0Var.d(uc0Var.G);
    }
}
