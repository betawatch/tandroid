package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class q4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ md0 b;
    public final /* synthetic */ md0 c;
    public final /* synthetic */ md0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(Context context, md0 md0Var, md0 md0Var2, md0 md0Var3) {
        super(context);
        this.b = md0Var;
        this.c = md0Var2;
        this.d = md0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        md0 md0Var = this.b;
        md0Var.setItemCount(i12);
        md0 md0Var2 = this.c;
        md0Var2.setItemCount(i12);
        md0 md0Var3 = this.d;
        md0Var3.setItemCount(i12);
        md0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        md0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        md0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
