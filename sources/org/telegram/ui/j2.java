package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j2 extends View {
    public final w70 a;
    public final org.telegram.ui.Components.pq b;

    public j2(Context context, w70 w70Var) {
        super(context);
        this.a = w70Var;
        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qk, false)), org.telegram.ui.ActionBar.j6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = pqVar;
        pqVar.w = true;
        setBackgroundDrawable(pqVar);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Qk;
        ((h4) this.a).getClass();
        org.telegram.ui.ActionBar.j6.v1(this.b, org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
    }
}
