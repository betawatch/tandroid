package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ix0 extends org.telegram.ui.Cells.b8 {
    public final /* synthetic */ jx0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix0(jx0 jx0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.K = jx0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        jx0 jx0Var = this.K;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(jx0Var.r.K, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(jx0Var.r.K, TLObject.FLAG_30));
    }
}
