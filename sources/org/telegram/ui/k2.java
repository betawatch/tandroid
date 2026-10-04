package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class k2 extends View {
    public final t70 a;
    public final org.telegram.ui.Components.sq b;

    public k2(Context context, t70 t70Var) {
        super(context);
        this.a = t70Var;
        org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qk, false)), org.telegram.ui.ActionBar.i6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = sqVar;
        sqVar.w = true;
        setBackgroundDrawable(sqVar);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.i6.Qk;
        ((i4) this.a).getClass();
        org.telegram.ui.ActionBar.i6.v1(this.b, org.telegram.ui.ActionBar.i6.w0(null, i12, false), false);
    }
}
