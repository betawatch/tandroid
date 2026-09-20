package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class wc0 extends po0 {
    public final /* synthetic */ cd0 d;

    public wc0(cd0 cd0Var) {
        this.d = cd0Var;
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
        cd0 cd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = cd0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(cd0Var.G)) : cd0Var.d(cd0Var.G);
    }
}
