package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class a4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ qd0 b;
    public final /* synthetic */ qd0 c;
    public final /* synthetic */ qd0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(Context context, qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3) {
        super(context);
        this.b = qd0Var;
        this.c = qd0Var2;
        this.d = qd0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        qd0 qd0Var = this.b;
        qd0Var.setItemCount(i12);
        qd0 qd0Var2 = this.c;
        qd0Var2.setItemCount(i12);
        qd0 qd0Var3 = this.d;
        qd0Var3.setItemCount(i12);
        qd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        qd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        qd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
