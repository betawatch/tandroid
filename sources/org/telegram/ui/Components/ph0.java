package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ph0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ sh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph0(sh0 sh0Var, Activity activity) {
        super(activity);
        this.b = sh0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        sh0 sh0Var = this.b;
        fc0 fc0Var = sh0Var.D;
        fc0 fc0Var2 = sh0Var.C;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        fc0Var2.setItemCount(i12);
        fc0Var.setItemCount(i12);
        fc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        fc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        sh0Var.J = size;
        if (size != 0) {
            sh0Var.c(false);
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
