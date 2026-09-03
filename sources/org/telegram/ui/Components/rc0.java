package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rc0 extends go0 {
    public final /* synthetic */ xc0 d;

    public rc0(xc0 xc0Var) {
        this.d = xc0Var;
    }

    @Override // org.telegram.ui.Components.go0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.go0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.go0
    public final void c(boolean z4) {
        this.d.a(!z4);
    }

    @Override // org.telegram.ui.Components.go0
    public final CharSequence d() {
        xc0 xc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = xc0Var.p0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(xc0Var.D)) : xc0Var.d(xc0Var.D);
    }
}
