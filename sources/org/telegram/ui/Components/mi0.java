package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class mi0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ pi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi0(pi0 pi0Var, Activity activity) {
        super(activity);
        this.b = pi0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        pi0 pi0Var = this.b;
        ed0 ed0Var = pi0Var.H;
        ed0 ed0Var2 = pi0Var.G;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        ed0Var2.setItemCount(i12);
        ed0Var.setItemCount(i12);
        ed0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        ed0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        pi0Var.N = size;
        if (size != 0) {
            pi0Var.c(false);
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
