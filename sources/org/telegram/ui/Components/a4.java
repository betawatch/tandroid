package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class a4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ ed0 b;
    public final /* synthetic */ ed0 c;
    public final /* synthetic */ ed0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(Context context, ed0 ed0Var, ed0 ed0Var2, ed0 ed0Var3) {
        super(context);
        this.b = ed0Var;
        this.c = ed0Var2;
        this.d = ed0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        ed0 ed0Var = this.b;
        ed0Var.setItemCount(i12);
        ed0 ed0Var2 = this.c;
        ed0Var2.setItemCount(i12);
        ed0 ed0Var3 = this.d;
        ed0Var3.setItemCount(i12);
        ed0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        ed0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        ed0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
