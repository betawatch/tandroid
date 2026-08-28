package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vb0 extends mn0 {
    public final /* synthetic */ bc0 d;

    public vb0(bc0 bc0Var) {
        this.d = bc0Var;
    }

    @Override // org.telegram.ui.Components.mn0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.mn0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.mn0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.mn0
    public final CharSequence d() {
        bc0 bc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = bc0Var.o0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(bc0Var.C)) : bc0Var.d(bc0Var.C);
    }
}
