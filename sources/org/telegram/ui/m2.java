package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class m2 extends View {
    public final d70 a;
    public final org.telegram.ui.Components.zq b;

    public m2(Context context, d70 d70Var) {
        super(context);
        this.a = d70Var;
        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qk, false)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = zqVar;
        zqVar.w = true;
        setBackgroundDrawable(zqVar);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.h6.Qk;
        ((l4) this.a).getClass();
        org.telegram.ui.ActionBar.h6.w1(this.b, org.telegram.ui.ActionBar.h6.x0(null, i12, false), false);
    }
}
