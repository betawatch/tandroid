package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m50 extends org.telegram.ui.Cells.i4 {
    public final /* synthetic */ p50 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(p50 p50Var, Context context) {
        super(context);
        this.g0 = p50Var;
    }

    @Override // org.telegram.ui.Cells.i4
    public final void d(org.telegram.ui.Cells.i4 i4Var) {
        v50 v50Var = this.g0.M;
        v50 v50Var2 = v50.D3;
        v50Var.G1(i4Var);
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
