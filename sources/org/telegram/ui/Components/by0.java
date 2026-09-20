package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class by0 extends org.telegram.ui.Cells.g8 {
    public final /* synthetic */ cy0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(cy0 cy0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.O = cy0Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        cy0 cy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(cy0Var.r.O, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(cy0Var.r.O, TLObject.FLAG_30));
    }
}
