package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hd0 extends kp0 {
    public final /* synthetic */ nd0 d;

    public hd0(nd0 nd0Var) {
        this.d = nd0Var;
    }

    @Override // org.telegram.ui.Components.kp0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.kp0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.kp0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.kp0
    public final CharSequence d() {
        nd0 nd0Var = this.d;
        Utilities.CallbackReturn callbackReturn = nd0Var.u0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(nd0Var.H)) : nd0Var.d(nd0Var.H);
    }
}
