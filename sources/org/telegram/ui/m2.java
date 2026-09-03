package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m2 extends View {
    public final o70 a;
    public final org.telegram.ui.Components.pq b;

    public m2(Context context, o70 o70Var) {
        super(context);
        this.a = o70Var;
        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qk, false)), org.telegram.ui.ActionBar.k6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = pqVar;
        pqVar.w = true;
        setBackgroundDrawable(pqVar);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.k6.Qk;
        ((l4) this.a).getClass();
        org.telegram.ui.ActionBar.k6.v1(this.b, org.telegram.ui.ActionBar.k6.w0(null, i12, false), false);
    }
}
