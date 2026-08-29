package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o2 extends View {
    public final d70 a;
    public final org.telegram.ui.Components.jq b;

    public o2(Context context, d70 d70Var) {
        super(context);
        this.a = d70Var;
        org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qk, false)), org.telegram.ui.ActionBar.g6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = jqVar;
        jqVar.w = true;
        setBackgroundDrawable(jqVar);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.g6.Qk;
        ((m4) this.a).getClass();
        org.telegram.ui.ActionBar.g6.v1(this.b, org.telegram.ui.ActionBar.g6.w0(null, i12, false), false);
    }
}
