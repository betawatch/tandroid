package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k2 extends View {
    public final t70 a;
    public final org.telegram.ui.Components.fr b;

    public k2(Context context, t70 t70Var) {
        super(context);
        this.a = t70Var;
        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qk, false)), org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = frVar;
        frVar.w = true;
        setBackgroundDrawable(frVar);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.i6.Qk;
        ((i4) this.a).getClass();
        org.telegram.ui.ActionBar.i6.w1(this.b, org.telegram.ui.ActionBar.i6.x0(null, i12, false), false);
    }
}
