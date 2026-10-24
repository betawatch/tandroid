package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class l50 extends org.telegram.ui.Cells.d4 {
    public final /* synthetic */ o50 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l50(o50 o50Var, Context context) {
        super(context);
        this.g0 = o50Var;
    }

    @Override // org.telegram.ui.Cells.d4
    public final void d(org.telegram.ui.Cells.d4 d4Var) {
        u50 u50Var = this.g0.M;
        u50 u50Var2 = u50.D3;
        u50Var.G1(d4Var);
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
