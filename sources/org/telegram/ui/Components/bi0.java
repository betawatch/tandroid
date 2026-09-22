package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bi0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ ei0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi0(ei0 ei0Var, Activity activity) {
        super(activity);
        this.b = ei0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ei0 ei0Var = this.b;
        uc0 uc0Var = ei0Var.H;
        uc0 uc0Var2 = ei0Var.G;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        uc0Var2.setItemCount(i12);
        uc0Var.setItemCount(i12);
        uc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        uc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        ei0Var.N = size;
        if (size != 0) {
            ei0Var.c(false);
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
