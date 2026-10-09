package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class od0 extends hp0 {
    public final /* synthetic */ ud0 d;

    public od0(ud0 ud0Var) {
        this.d = ud0Var;
    }

    @Override // org.telegram.ui.Components.hp0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.hp0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.hp0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.hp0
    public final CharSequence d() {
        ud0 ud0Var = this.d;
        Utilities.CallbackReturn callbackReturn = ud0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(ud0Var.G)) : ud0Var.d(ud0Var.G);
    }
}
