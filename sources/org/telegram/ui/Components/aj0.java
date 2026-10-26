package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class aj0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ dj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(dj0 dj0Var, Activity activity) {
        super(activity);
        this.b = dj0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        dj0 dj0Var = this.b;
        md0 md0Var = dj0Var.H;
        md0 md0Var2 = dj0Var.G;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        md0Var2.setItemCount(i12);
        md0Var.setItemCount(i12);
        md0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        md0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        dj0Var.N = size;
        if (size != 0) {
            dj0Var.c(false);
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
