package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xh0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ ai0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh0(ai0 ai0Var, Activity activity) {
        super(activity);
        this.b = ai0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ai0 ai0Var = this.b;
        qc0 qc0Var = ai0Var.D;
        qc0 qc0Var2 = ai0Var.C;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        qc0Var2.setItemCount(i12);
        qc0Var.setItemCount(i12);
        qc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        qc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        ai0Var.J = size;
        if (size != 0) {
            ai0Var.c(false);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
