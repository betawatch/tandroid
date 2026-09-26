package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class yc0 extends po0 {
    public final /* synthetic */ ed0 d;

    public yc0(ed0 ed0Var) {
        this.d = ed0Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.po0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.po0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.po0
    public final CharSequence d() {
        ed0 ed0Var = this.d;
        Utilities.CallbackReturn callbackReturn = ed0Var.s0;
        return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(ed0Var.G)) : ed0Var.d(ed0Var.G);
    }
}
