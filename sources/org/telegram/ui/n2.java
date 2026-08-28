package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n2 extends View {
    public final a70 a;
    public final org.telegram.ui.Components.fq b;

    public n2(Context context, a70 a70Var) {
        super(context);
        this.a = a70Var;
        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qk, false)), org.telegram.ui.ActionBar.f6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = fqVar;
        fqVar.w = true;
        setBackgroundDrawable(fqVar);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(12.0f));
        int i11 = org.telegram.ui.ActionBar.f6.Qk;
        ((l4) this.a).getClass();
        org.telegram.ui.ActionBar.f6.v1(this.b, org.telegram.ui.ActionBar.f6.w0(null, i11, false), false);
    }
}
