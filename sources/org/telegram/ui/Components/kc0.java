package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kc0 extends xn0 {
    public final /* synthetic */ qc0 d;

    public kc0(qc0 qc0Var) {
        this.d = qc0Var;
    }

    @Override // org.telegram.ui.Components.xn0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.xn0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.xn0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.xn0
    public final CharSequence d() {
        qc0 qc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = qc0Var.o0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(qc0Var.C)) : qc0Var.d(qc0Var.C);
    }
}
