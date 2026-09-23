package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class k2 extends View {
    public final r70 a;
    public final org.telegram.ui.Components.qq b;

    public k2(Context context, r70 r70Var) {
        super(context);
        this.a = r70Var;
        org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qk, false)), org.telegram.ui.ActionBar.h6.U0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = qqVar;
        qqVar.w = true;
        setBackgroundDrawable(qqVar);
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
