package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ji0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ mi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji0(mi0 mi0Var, Activity activity) {
        super(activity);
        this.b = mi0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        mi0 mi0Var = this.b;
        xc0 xc0Var = mi0Var.E;
        xc0 xc0Var2 = mi0Var.D;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        xc0Var2.setItemCount(i12);
        xc0Var.setItemCount(i12);
        xc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        xc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        mi0Var.K = size;
        if (size != 0) {
            mi0Var.c(false);
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
