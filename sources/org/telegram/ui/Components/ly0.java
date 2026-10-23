package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ly0 extends org.telegram.ui.Cells.e8 {
    public final /* synthetic */ my0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly0(my0 my0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = my0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        my0 my0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(my0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(my0Var.r.O, TLObject.FLAG_30));
    }
}
