package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class p4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ od0 b;
    public final /* synthetic */ od0 c;
    public final /* synthetic */ od0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(Context context, od0 od0Var, od0 od0Var2, od0 od0Var3) {
        super(context);
        this.b = od0Var;
        this.c = od0Var2;
        this.d = od0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        od0 od0Var = this.b;
        od0Var.setItemCount(i12);
        od0 od0Var2 = this.c;
        od0Var2.setItemCount(i12);
        od0 od0Var3 = this.d;
        od0Var3.setItemCount(i12);
        od0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        od0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        od0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
