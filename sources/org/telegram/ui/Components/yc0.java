package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class yc0 extends po0 {
    public final /* synthetic */ ed0 d;

    public yc0(ed0 ed0Var) {
        this.d = ed0Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.po0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.po0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.po0
    public final CharSequence d() {
        ed0 ed0Var = this.d;
        Utilities.CallbackReturn callbackReturn = ed0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(ed0Var.G)) : ed0Var.d(ed0Var.G);
    }
}
