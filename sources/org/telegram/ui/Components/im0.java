package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class im0 extends ks {
    public final /* synthetic */ org.telegram.ui.kw l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im0(org.telegram.ui.kw kwVar, ek0 ek0Var, Context context, int i7, int i10) {
        super(ek0Var, context, i7, i10, false, null);
        this.l0 = kwVar;
    }

    @Override // org.telegram.ui.Components.c51
    public final void O(boolean z10) {
        ArrayList arrayList;
        super.O(z10);
        hm0 hm0Var = this.l0.o0;
        hm0Var.e(this.c0 || this.d0 || (arrayList = this.W) == null || !arrayList.isEmpty(), z10);
        hm0Var.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        hm0Var.e.setVisibility(8);
    }
}
