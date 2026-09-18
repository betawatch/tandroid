package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class xc0 extends qo0 {
    public final /* synthetic */ dd0 d;

    public xc0(dd0 dd0Var) {
        this.d = dd0Var;
    }

    @Override // org.telegram.ui.Components.qo0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.qo0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.qo0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.qo0
    public final CharSequence d() {
        dd0 dd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = dd0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(dd0Var.G)) : dd0Var.d(dd0Var.G);
    }
}
