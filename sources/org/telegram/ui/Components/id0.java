package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class id0 extends zo0 {
    public final /* synthetic */ od0 d;

    public id0(od0 od0Var) {
        this.d = od0Var;
    }

    @Override // org.telegram.ui.Components.zo0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.zo0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.zo0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.zo0
    public final CharSequence d() {
        od0 od0Var = this.d;
        Utilities.CallbackReturn callbackReturn = od0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(od0Var.G)) : od0Var.d(od0Var.G);
    }
}
