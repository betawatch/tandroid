package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sc0 extends ho0 {
    public final /* synthetic */ yc0 d;

    public sc0(yc0 yc0Var) {
        this.d = yc0Var;
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
        yc0 yc0Var = this.d;
        Utilities.CallbackReturn callbackReturn = yc0Var.p0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(yc0Var.D)) : yc0Var.d(yc0Var.D);
    }
}
