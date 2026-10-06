package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class oi0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ ri0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi0(ri0 ri0Var, Activity activity) {
        super(activity);
        this.b = ri0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ri0 ri0Var = this.b;
        gd0 gd0Var = ri0Var.H;
        gd0 gd0Var2 = ri0Var.G;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        gd0Var2.setItemCount(i12);
        gd0Var.setItemCount(i12);
        gd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        gd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        ri0Var.N = size;
        if (size != 0) {
            ri0Var.c(false);
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
