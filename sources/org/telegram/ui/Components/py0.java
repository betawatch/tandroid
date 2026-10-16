package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class py0 extends org.telegram.ui.Cells.f8 {
    public final /* synthetic */ qy0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py0(qy0 qy0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.O = qy0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        qy0 qy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(qy0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(qy0Var.r.O, TLObject.FLAG_30));
    }
}
