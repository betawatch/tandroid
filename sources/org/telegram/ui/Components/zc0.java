package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zc0 extends ro0 {
    public final /* synthetic */ fd0 d;

    public zc0(fd0 fd0Var) {
        this.d = fd0Var;
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
        fd0 fd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = fd0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(fd0Var.G)) : fd0Var.d(fd0Var.G);
    }
}
