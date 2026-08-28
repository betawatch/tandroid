package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xw0 extends org.telegram.ui.Cells.d8 {
    public final /* synthetic */ yw0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw0(yw0 yw0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false);
        this.K = yw0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        yw0 yw0Var = this.K;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(yw0Var.r.K, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(yw0Var.r.K, TLObject.FLAG_30));
    }
}
