package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class m4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ uc0 b;
    public final /* synthetic */ uc0 c;
    public final /* synthetic */ uc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(Context context, uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3) {
        super(context);
        this.b = uc0Var;
        this.c = uc0Var2;
        this.d = uc0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        uc0 uc0Var = this.b;
        uc0Var.setItemCount(i12);
        uc0 uc0Var2 = this.c;
        uc0Var2.setItemCount(i12);
        uc0 uc0Var3 = this.d;
        uc0Var3.setItemCount(i12);
        uc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        uc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        uc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
