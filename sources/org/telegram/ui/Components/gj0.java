package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gj0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ jj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj0(jj0 jj0Var, Activity activity) {
        super(activity);
        this.b = jj0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        jj0 jj0Var = this.b;
        ud0 ud0Var = jj0Var.H;
        ud0 ud0Var2 = jj0Var.G;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        ud0Var2.setItemCount(i12);
        ud0Var.setItemCount(i12);
        ud0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        ud0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        jj0Var.N = size;
        if (size != 0) {
            jj0Var.c(false);
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
