package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class wl0 extends u20 {
    public final /* synthetic */ org.telegram.ui.fw e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl0(org.telegram.ui.fw fwVar, pj0 pj0Var, Context context, int i7) {
        super(pj0Var, context, i7);
        this.e0 = fwVar;
    }

    @Override // org.telegram.ui.Components.l41
    public final void O(boolean z9) {
        super.O(z9);
        sl0 sl0Var = this.e0.u0;
        sl0Var.e(false, z9);
        sl0Var.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var.e.setVisibility(8);
    }
}
