package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
