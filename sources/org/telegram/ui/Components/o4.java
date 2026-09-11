package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class o4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ vc0 b;
    public final /* synthetic */ vc0 c;
    public final /* synthetic */ vc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Context context, vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3) {
        super(context);
        this.b = vc0Var;
        this.c = vc0Var2;
        this.d = vc0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        vc0 vc0Var = this.b;
        vc0Var.setItemCount(i12);
        vc0 vc0Var2 = this.c;
        vc0Var2.setItemCount(i12);
        vc0 vc0Var3 = this.d;
        vc0Var3.setItemCount(i12);
        vc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        vc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        vc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
