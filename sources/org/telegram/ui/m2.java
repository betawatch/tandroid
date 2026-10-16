package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class m2 extends View {
    public final z70 a;
    public final org.telegram.ui.Components.cr b;

    public m2(Context context, z70 z70Var) {
        super(context);
        this.a = z70Var;
        org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qk, false)), org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = crVar;
        crVar.w = true;
        setBackgroundDrawable(crVar);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.g6.Qk;
        ((k4) this.a).getClass();
        org.telegram.ui.ActionBar.g6.w1(this.b, org.telegram.ui.ActionBar.g6.x0(null, i12, false), false);
    }
}
