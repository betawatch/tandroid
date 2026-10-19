package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class u3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ t3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(Context context, r3 r3Var, t3 t3Var) {
        super(context);
        this.b = r3Var;
        this.c = t3Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        r3 r3Var = this.b;
        r3Var.setItemCount(i12);
        t3 t3Var = this.c;
        t3Var.setItemCount(i12);
        r3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        t3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
