package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class r3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ o3 b;
    public final /* synthetic */ q3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(Context context, o3 o3Var, q3 q3Var) {
        super(context);
        this.b = o3Var;
        this.c = q3Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        o3 o3Var = this.b;
        o3Var.setItemCount(i12);
        q3 q3Var = this.c;
        q3Var.setItemCount(i12);
        o3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
