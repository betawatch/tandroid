package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class aq extends LinearLayout {
    public final /* synthetic */ dq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(dq dqVar, Context context) {
        super(context);
        this.a = dqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        dq.m(this.a);
    }
}
