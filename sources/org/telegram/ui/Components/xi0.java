package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class xi0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ aj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi0(aj0 aj0Var, Activity activity) {
        super(activity);
        this.b = aj0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        aj0 aj0Var = this.b;
        od0 od0Var = aj0Var.H;
        od0 od0Var2 = aj0Var.G;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        od0Var2.setItemCount(i12);
        od0Var.setItemCount(i12);
        od0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        od0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        aj0Var.N = size;
        if (size != 0) {
            aj0Var.c(false);
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
