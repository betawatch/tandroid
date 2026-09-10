package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a60 extends org.telegram.ui.Cells.d4 {
    public final /* synthetic */ d60 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(d60 d60Var, Context context) {
        super(context);
        this.f0 = d60Var;
    }

    @Override // org.telegram.ui.Cells.d4
    public final void d(org.telegram.ui.Cells.d4 d4Var) {
        j60 j60Var = this.f0.M;
        j60 j60Var2 = j60.D3;
        j60Var.F1(d4Var);
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
