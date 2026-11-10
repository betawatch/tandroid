package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tl0 extends ur {
    public final /* synthetic */ org.telegram.ui.iw k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl0(org.telegram.ui.iw iwVar, pj0 pj0Var, Context context, int i7, int i10) {
        super(pj0Var, context, i7, i10, false, null);
        this.k0 = iwVar;
    }

    @Override // org.telegram.ui.Components.m41
    public final void O(boolean z9) {
        ArrayList arrayList;
        super.O(z9);
        sl0 sl0Var = this.k0.n0;
        sl0Var.e(this.b0 || this.c0 || (arrayList = this.V) == null || !arrayList.isEmpty(), z9);
        sl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        sl0Var.e.setVisibility(8);
    }
}
