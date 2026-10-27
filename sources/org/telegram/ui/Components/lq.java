package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lq extends LinearLayout {
    public final /* synthetic */ oq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq(oq oqVar, Context context) {
        super(context);
        this.a = oqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        oq.m(this.a);
    }
}
