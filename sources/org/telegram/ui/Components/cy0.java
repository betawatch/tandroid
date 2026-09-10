package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class cy0 extends org.telegram.ui.Cells.g8 {
    public final /* synthetic */ dy0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(dy0 dy0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.O = dy0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        dy0 dy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dy0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dy0Var.r.O, TLObject.FLAG_30));
    }
}
