package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class fw0 extends org.telegram.ui.Cells.a8 {
    public final /* synthetic */ gw0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw0(gw0 gw0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, false);
        this.P = gw0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        gw0 gw0Var = this.P;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gw0Var.r.J1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gw0Var.r.J1, TLObject.FLAG_30));
    }
}
