package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ki0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ ni0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki0(ni0 ni0Var, Activity activity) {
        super(activity);
        this.b = ni0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ni0 ni0Var = this.b;
        yc0 yc0Var = ni0Var.E;
        yc0 yc0Var2 = ni0Var.D;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        yc0Var2.setItemCount(i12);
        yc0Var.setItemCount(i12);
        yc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        yc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        ni0Var.K = size;
        if (size != 0) {
            ni0Var.c(false);
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
