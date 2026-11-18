package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class im0 extends f30 {
    public final /* synthetic */ org.telegram.ui.kw f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im0(org.telegram.ui.kw kwVar, ck0 ck0Var, Context context, int i7) {
        super(ck0Var, context, i7);
        this.f0 = kwVar;
    }

    @Override // org.telegram.ui.Components.z41
    public final void O(boolean z10) {
        super.O(z10);
        em0 em0Var = this.f0.v0;
        em0Var.e(false, z10);
        em0Var.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var.e.setVisibility(8);
    }
}
