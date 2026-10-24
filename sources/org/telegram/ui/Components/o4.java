package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class o4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ qd0 b;
    public final /* synthetic */ qd0 c;
    public final /* synthetic */ qd0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Context context, qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3) {
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
