package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class id0 extends ap0 {
    public final /* synthetic */ od0 d;

    public id0(od0 od0Var) {
        this.d = od0Var;
    }

    @Override // org.telegram.ui.Components.ap0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.ap0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.ap0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.ap0
    public final CharSequence d() {
        od0 od0Var = this.d;
        Utilities.CallbackReturn callbackReturn = od0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(od0Var.G)) : od0Var.d(od0Var.G);
    }
}
