package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class o4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ gd0 b;
    public final /* synthetic */ gd0 c;
    public final /* synthetic */ gd0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Context context, gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3) {
        super(context);
        this.b = gd0Var;
        this.c = gd0Var2;
        this.d = gd0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        gd0 gd0Var = this.b;
        gd0Var.setItemCount(i12);
        gd0 gd0Var2 = this.c;
        gd0Var2.setItemCount(i12);
        gd0 gd0Var3 = this.d;
        gd0Var3.setItemCount(i12);
        gd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        gd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        gd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
