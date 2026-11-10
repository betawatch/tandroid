package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class am0 extends wr {
    public final /* synthetic */ org.telegram.ui.zw f0;
    public final /* synthetic */ org.telegram.ui.iw g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am0(org.telegram.ui.iw iwVar, pj0 pj0Var, Context context, int i7, int i10, org.telegram.ui.zw zwVar) {
        super(pj0Var, context, i7, i10);
        this.g0 = iwVar;
        this.f0 = zwVar;
    }

    @Override // org.telegram.ui.Components.m41
    public final void O(boolean z9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z9);
        sl0 sl0Var = this.g0.i0;
        sl0Var.e(this.Y || this.Z || (arrayList = this.R) == null || !arrayList.isEmpty() || (arrayList2 = this.S) == null || !arrayList2.isEmpty() || (arrayList3 = this.U) == null || !arrayList3.isEmpty() || (arrayList4 = this.T) == null || !arrayList4.isEmpty(), z9);
        if (!TextUtils.isEmpty(this.d0)) {
            sl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
            sl0Var.e.setVisibility(8);
        } else {
            sl0Var.d.setText(org.telegram.messenger.id.M0(2131748231, null));
            sl0Var.e.setVisibility(0);
            sl0Var.e.setText(org.telegram.messenger.id.M0(2131748232, null));
        }
    }
}
