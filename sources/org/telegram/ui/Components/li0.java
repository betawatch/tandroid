package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class li0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ oi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li0(oi0 oi0Var, Activity activity) {
        super(activity);
        this.b = oi0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        oi0 oi0Var = this.b;
        cd0 cd0Var = oi0Var.H;
        cd0 cd0Var2 = oi0Var.G;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        cd0Var2.setItemCount(i12);
        cd0Var.setItemCount(i12);
        cd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        cd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        oi0Var.N = size;
        if (size != 0) {
            oi0Var.c(false);
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
