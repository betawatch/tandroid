package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zw0 extends org.telegram.ui.Cells.a8 {
    public final /* synthetic */ ax0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw0(ax0 ax0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.K = ax0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ax0 ax0Var = this.K;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ax0Var.r.K, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ax0Var.r.K, TLObject.FLAG_30));
    }
}
