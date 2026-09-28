package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ad0 extends ro0 {
    public final /* synthetic */ gd0 d;

    public ad0(gd0 gd0Var) {
        this.d = gd0Var;
    }

    @Override // org.telegram.ui.Components.ro0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.ro0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.ro0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.ro0
    public final CharSequence d() {
        gd0 gd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = gd0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(gd0Var.G)) : gd0Var.d(gd0Var.G);
    }
}
