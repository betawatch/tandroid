package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qc0 extends ho0 {
    public final /* synthetic */ wc0 d;

    public qc0(wc0 wc0Var) {
        this.d = wc0Var;
    }

    @Override // org.telegram.ui.Components.ho0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.ho0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.ho0
    public final void c(boolean z4) {
        this.d.a(!z4);
    }

    @Override // org.telegram.ui.Components.ho0
    public final CharSequence d() {
        wc0 wc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = wc0Var.p0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(wc0Var.D)) : wc0Var.d(wc0Var.D);
    }
}
