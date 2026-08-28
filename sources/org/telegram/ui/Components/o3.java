package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final void onMeasure(int i9, int i10) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i11 = point.x > point.y ? 3 : 5;
        l3 l3Var = this.b;
        l3Var.setItemCount(i11);
        n3 n3Var = this.c;
        n3Var.setItemCount(i11);
        l3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
        n3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
        this.a = false;
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
