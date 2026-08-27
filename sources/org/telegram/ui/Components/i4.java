package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ fc0 b;
    public final /* synthetic */ fc0 c;
    public final /* synthetic */ fc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(Context context, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3) {
        super(context);
        this.b = fc0Var;
        this.c = fc0Var2;
        this.d = fc0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        fc0 fc0Var = this.b;
        fc0Var.setItemCount(i12);
        fc0 fc0Var2 = this.c;
        fc0Var2.setItemCount(i12);
        fc0 fc0Var3 = this.d;
        fc0Var3.setItemCount(i12);
        fc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
