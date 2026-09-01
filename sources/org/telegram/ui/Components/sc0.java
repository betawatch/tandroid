package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class sc0 extends io0 {
    public final /* synthetic */ yc0 d;

    public sc0(yc0 yc0Var) {
        this.d = yc0Var;
    }

    @Override // org.telegram.ui.Components.io0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.io0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.io0
    public final void c(boolean z4) {
        this.d.a(!z4);
    }

    @Override // org.telegram.ui.Components.io0
    public final CharSequence d() {
        yc0 yc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = yc0Var.p0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(yc0Var.D)) : yc0Var.d(yc0Var.D);
    }
}
