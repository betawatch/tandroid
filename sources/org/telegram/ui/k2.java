package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class k2 extends View {
    public final p70 a;
    public final org.telegram.ui.Components.rq b;

    public k2(Context context, p70 p70Var) {
        super(context);
        this.a = p70Var;
        org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qk, false)), org.telegram.ui.ActionBar.h6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = rqVar;
        rqVar.w = true;
        setBackgroundDrawable(rqVar);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.h6.Qk;
        ((i4) this.a).getClass();
        org.telegram.ui.ActionBar.h6.v1(this.b, org.telegram.ui.ActionBar.h6.w0(null, i12, false), false);
    }
}
