package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zp extends LinearLayout {
    public final /* synthetic */ cq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(cq cqVar, Context context) {
        super(context);
        this.a = cqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        cq.m(this.a);
    }
}
