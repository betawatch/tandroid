package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ ud0 b;
    public final /* synthetic */ ud0 c;
    public final /* synthetic */ ud0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(Context context, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3) {
        super(context);
        this.b = ud0Var;
        this.c = ud0Var2;
        this.d = ud0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        ud0 ud0Var = this.b;
        ud0Var.setItemCount(i12);
        ud0 ud0Var2 = this.c;
        ud0Var2.setItemCount(i12);
        ud0 ud0Var3 = this.d;
        ud0Var3.setItemCount(i12);
        ud0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        ud0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        ud0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.a = false;
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
