package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b60 extends org.telegram.ui.Cells.d4 {
    public final /* synthetic */ e60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(e60 e60Var, Context context) {
        super(context);
        this.f0 = e60Var;
    }

    @Override // org.telegram.ui.Cells.d4
    public final void d(org.telegram.ui.Cells.d4 d4Var) {
        k60 k60Var = this.f0.M;
        k60 k60Var2 = k60.D3;
        k60Var.F1(d4Var);
    }

    @Override // org.telegram.ui.Cells.d4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (AndroidUtilities.isTablet()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
