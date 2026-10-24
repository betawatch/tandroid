package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class kd0 extends ep0 {
    public final /* synthetic */ qd0 d;

    public kd0(qd0 qd0Var) {
        this.d = qd0Var;
    }

    @Override // org.telegram.ui.Components.ep0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.ep0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.ep0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.ep0
    public final CharSequence d() {
        qd0 qd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = qd0Var.u0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(qd0Var.H)) : qd0Var.d(qd0Var.H);
    }
}
