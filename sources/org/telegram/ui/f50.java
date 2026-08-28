package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f50 extends org.telegram.ui.Cells.e4 {
    public final /* synthetic */ i50 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f50(i50 i50Var, Context context) {
        super(context);
        this.b0 = i50Var;
    }

    @Override // org.telegram.ui.Cells.e4
    public final void d(org.telegram.ui.Cells.e4 e4Var) {
        o50 o50Var = this.b0.I;
        o50 o50Var2 = o50.z3;
        o50Var.F1(e4Var);
    }

    @Override // org.telegram.ui.Cells.e4, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (AndroidUtilities.isTablet()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i9)), TLObject.FLAG_30), i10);
        } else {
            super.onMeasure(i9, i10);
        }
    }
}
