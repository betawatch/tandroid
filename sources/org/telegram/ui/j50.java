package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class j50 extends org.telegram.ui.Cells.d4 {
    public final /* synthetic */ m50 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(m50 m50Var, Context context) {
        super(context);
        this.f0 = m50Var;
    }

    @Override // org.telegram.ui.Cells.d4
    public final void d(org.telegram.ui.Cells.d4 d4Var) {
        s50 s50Var = this.f0.M;
        s50 s50Var2 = s50.D3;
        s50Var.G1(d4Var);
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
