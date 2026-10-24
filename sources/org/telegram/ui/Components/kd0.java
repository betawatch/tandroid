package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
