package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j50 extends org.telegram.ui.Cells.b4 {
    public final /* synthetic */ m50 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(m50 m50Var, Context context) {
        super(context);
        this.b0 = m50Var;
    }

    @Override // org.telegram.ui.Cells.b4
    public final void d(org.telegram.ui.Cells.b4 b4Var) {
        s50 s50Var = this.b0.I;
        s50 s50Var2 = s50.z3;
        s50Var.F1(b4Var);
    }

    @Override // org.telegram.ui.Cells.b4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (AndroidUtilities.isTablet()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
