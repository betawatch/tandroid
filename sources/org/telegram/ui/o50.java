package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o50 extends org.telegram.ui.Cells.i4 {
    public final /* synthetic */ r50 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o50(r50 r50Var, Context context) {
        super(context);
        this.g0 = r50Var;
    }

    @Override // org.telegram.ui.Cells.i4
    public final void d(org.telegram.ui.Cells.i4 i4Var) {
        x50 x50Var = this.g0.M;
        x50 x50Var2 = x50.D3;
        x50Var.G1(i4Var);
    }

    @Override // org.telegram.ui.Cells.i4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (AndroidUtilities.isTablet()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
