package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class jy0 extends org.telegram.ui.Cells.e8 {
    public final /* synthetic */ ky0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy0(ky0 ky0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = ky0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ky0 ky0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ky0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ky0Var.r.O, TLObject.FLAG_30));
    }
}
