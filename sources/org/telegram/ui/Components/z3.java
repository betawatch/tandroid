package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ qc0 b;
    public final /* synthetic */ qc0 c;
    public final /* synthetic */ qc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Context context, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3) {
        super(context);
        this.b = qc0Var;
        this.c = qc0Var2;
        this.d = qc0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        qc0 qc0Var = this.b;
        qc0Var.setItemCount(i12);
        qc0 qc0Var2 = this.c;
        qc0Var2.setItemCount(i12);
        qc0 qc0Var3 = this.d;
        qc0Var3.setItemCount(i12);
        qc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        qc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        qc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
