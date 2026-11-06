package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class tl0 extends vr {
    public final /* synthetic */ org.telegram.ui.fw k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl0(org.telegram.ui.fw fwVar, pj0 pj0Var, Context context, int i7, int i10) {
        super(pj0Var, context, i7, i10, false, null);
        this.k0 = fwVar;
    }

    @Override // org.telegram.ui.Components.l41
    public final void O(boolean z9) {
        ArrayList arrayList;
        super.O(z9);
        sl0 sl0Var = this.k0.n0;
        sl0Var.e(this.b0 || this.c0 || (arrayList = this.V) == null || !arrayList.isEmpty(), z9);
        sl0Var.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var.e.setVisibility(8);
    }
}
