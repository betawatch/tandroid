package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bj0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ ej0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(ej0 ej0Var, Activity activity) {
        super(activity);
        this.b = ej0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ej0 ej0Var = this.b;
        nd0 nd0Var = ej0Var.H;
        nd0 nd0Var2 = ej0Var.G;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        nd0Var2.setItemCount(i12);
        nd0Var.setItemCount(i12);
        nd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        nd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        ej0Var.N = size;
        if (size != 0) {
            ej0Var.c(false);
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
