package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j2 extends View implements org.telegram.ui.ActionBar.p6 {
    public final h70 a;
    public final org.telegram.ui.Components.ar b;

    public j2(Context context, h70 h70Var) {
        super(context);
        this.a = h70Var;
        org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qk, false)), org.telegram.ui.ActionBar.y6.W0(context, R.drawable.greydivider_bottom, -16777216));
        this.b = arVar;
        arVar.w = true;
        setBackgroundDrawable(arVar);
        setImportantForAccessibility(2);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qk));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(12.0f));
        int i12 = org.telegram.ui.ActionBar.y6.Qk;
        ((j4) this.a).getClass();
        org.telegram.ui.ActionBar.y6.y1(this.b, org.telegram.ui.ActionBar.y6.x0(null, i12, false), false);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        h70 h70Var;
        try {
            org.telegram.ui.Components.ar arVar = this.b;
            if (arVar == null || (h70Var = this.a) == null) {
                return;
            }
            int i10 = org.telegram.ui.ActionBar.y6.Qk;
            ((j4) h70Var).getClass();
            org.telegram.ui.ActionBar.y6.y1(arVar, org.telegram.ui.ActionBar.y6.x0(null, i10, false), false);
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
