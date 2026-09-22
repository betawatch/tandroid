package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        fd0 fd0Var = ri0Var.H;
        fd0 fd0Var2 = ri0Var.G;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        fd0Var2.setItemCount(i12);
        fd0Var.setItemCount(i12);
        fd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        fd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
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
