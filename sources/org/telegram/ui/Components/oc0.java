package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class oc0 extends do0 {
    public final /* synthetic */ uc0 d;

    public oc0(uc0 uc0Var) {
        this.d = uc0Var;
    }

    @Override // org.telegram.ui.Components.do0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.do0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.do0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.do0
    public final CharSequence d() {
        uc0 uc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = uc0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(uc0Var.G)) : uc0Var.d(uc0Var.G);
    }
}
