package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class l2 extends View implements org.telegram.ui.ActionBar.b6 {
    public final f70 a;
    public final org.telegram.ui.Components.yq b;

    public l2(Context context, f70 f70Var) {
        super(context);
        this.a = f70Var;
        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qk, false)), org.telegram.ui.ActionBar.k6.W0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = yqVar;
        yqVar.w = true;
        setBackgroundDrawable(yqVar);
        setImportantForAccessibility(2);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qk));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.k6.Qk;
        ((k4) this.a).getClass();
        org.telegram.ui.ActionBar.k6.y1(this.b, org.telegram.ui.ActionBar.k6.x0(null, i12, false), false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        f70 f70Var;
        try {
            org.telegram.ui.Components.yq yqVar = this.b;
            if (yqVar == null || (f70Var = this.a) == null) {
                return;
            }
            int i10 = org.telegram.ui.ActionBar.k6.Qk;
            ((k4) f70Var).getClass();
            org.telegram.ui.ActionBar.k6.y1(yqVar, org.telegram.ui.ActionBar.k6.x0(null, i10, false), false);
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
