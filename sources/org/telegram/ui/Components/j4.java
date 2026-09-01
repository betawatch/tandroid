package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ yc0 b;
    public final /* synthetic */ yc0 c;
    public final /* synthetic */ yc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Context context, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3) {
        super(context);
        this.b = yc0Var;
        this.c = yc0Var2;
        this.d = yc0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        yc0 yc0Var = this.b;
        yc0Var.setItemCount(i12);
        yc0 yc0Var2 = this.c;
        yc0Var2.setItemCount(i12);
        yc0 yc0Var3 = this.d;
        yc0Var3.setItemCount(i12);
        yc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        yc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        yc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
