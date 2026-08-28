package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nh0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ qh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh0(qh0 qh0Var, Activity activity) {
        super(activity);
        this.b = qh0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        qh0 qh0Var = this.b;
        bc0 bc0Var = qh0Var.D;
        bc0 bc0Var2 = qh0Var.C;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i11 = point.x > point.y ? 3 : 5;
        bc0Var2.setItemCount(i11);
        bc0Var.setItemCount(i11);
        bc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i11;
        bc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i11;
        this.a = false;
        int size = View.MeasureSpec.getSize(i9);
        qh0Var.J = size;
        if (size != 0) {
            qh0Var.c(false);
        }
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
