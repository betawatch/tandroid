package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class cq extends LinearLayout {
    public final /* synthetic */ fq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(fq fqVar, Context context) {
        super(context);
        this.a = fqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        fq.m(this.a);
    }
}
