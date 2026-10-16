package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cj0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ fj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj0(fj0 fj0Var, Activity activity) {
        super(activity);
        this.b = fj0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        fj0 fj0Var = this.b;
        ud0 ud0Var = fj0Var.H;
        ud0 ud0Var2 = fj0Var.G;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        ud0Var2.setItemCount(i12);
        ud0Var.setItemCount(i12);
        ud0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        ud0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        fj0Var.N = size;
        if (size != 0) {
            fj0Var.c(false);
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
