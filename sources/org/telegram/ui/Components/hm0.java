package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hm0 extends hs {
    public final /* synthetic */ org.telegram.ui.jw l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm0(org.telegram.ui.jw jwVar, ek0 ek0Var, Context context, int i7, int i10) {
        super(ek0Var, context, i7, i10, false, null);
        this.l0 = jwVar;
    }

    @Override // org.telegram.ui.Components.b51
    public final void O(boolean z10) {
        ArrayList arrayList;
        super.O(z10);
        gm0 gm0Var = this.l0.o0;
        gm0Var.e(this.c0 || this.d0 || (arrayList = this.W) == null || !arrayList.isEmpty(), z10);
        gm0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        gm0Var.e.setVisibility(8);
    }
}
