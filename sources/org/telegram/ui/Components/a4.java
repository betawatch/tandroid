package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class a4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ dd0 b;
    public final /* synthetic */ dd0 c;
    public final /* synthetic */ dd0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(Context context, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
        super(context);
        this.b = dd0Var;
        this.c = dd0Var2;
        this.d = dd0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        dd0 dd0Var = this.b;
        dd0Var.setItemCount(i12);
        dd0 dd0Var2 = this.c;
        dd0Var2.setItemCount(i12);
        dd0 dd0Var3 = this.d;
        dd0Var3.setItemCount(i12);
        dd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        dd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        dd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
