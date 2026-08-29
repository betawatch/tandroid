package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i50 extends org.telegram.ui.Cells.c4 {
    public final /* synthetic */ l50 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i50(l50 l50Var, Context context) {
        super(context);
        this.b0 = l50Var;
    }

    @Override // org.telegram.ui.Cells.c4
    public final void d(org.telegram.ui.Cells.c4 c4Var) {
        r50 r50Var = this.b0.I;
        r50 r50Var2 = r50.z3;
        r50Var.F1(c4Var);
    }

    @Override // org.telegram.ui.Cells.c4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (AndroidUtilities.isTablet()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
