package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ l3 b;
    public final /* synthetic */ n3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(Context context, l3 l3Var, n3 n3Var) {
        super(context);
        this.b = l3Var;
        this.c = n3Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        l3 l3Var = this.b;
        l3Var.setItemCount(i12);
        n3 n3Var = this.c;
        n3Var.setItemCount(i12);
        l3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        n3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
