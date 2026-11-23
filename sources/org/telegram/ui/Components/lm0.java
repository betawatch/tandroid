package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class lm0 extends i30 {
    public final /* synthetic */ org.telegram.ui.kw f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm0(org.telegram.ui.kw kwVar, ek0 ek0Var, Context context, int i7) {
        super(ek0Var, context, i7);
        this.f0 = kwVar;
    }

    @Override // org.telegram.ui.Components.c51
    public final void O(boolean z10) {
        super.O(z10);
        hm0 hm0Var = this.f0.v0;
        hm0Var.e(false, z10);
        hm0Var.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        hm0Var.e.setVisibility(8);
    }
}
