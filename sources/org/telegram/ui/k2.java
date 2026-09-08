package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k2 extends View {
    public final v70 a;
    public final org.telegram.ui.Components.oq b;

    public k2(Context context, v70 v70Var) {
        super(context);
        this.a = v70Var;
        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qk, false)), org.telegram.ui.ActionBar.j6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = oqVar;
        oqVar.w = true;
        setBackgroundDrawable(oqVar);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Qk;
        ((i4) this.a).getClass();
        org.telegram.ui.ActionBar.j6.v1(this.b, org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
    }
}
