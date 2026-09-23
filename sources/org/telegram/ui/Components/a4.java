package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class a4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ tc0 b;
    public final /* synthetic */ tc0 c;
    public final /* synthetic */ tc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(Context context, tc0 tc0Var, tc0 tc0Var2, tc0 tc0Var3) {
        super(context);
        this.b = tc0Var;
        this.c = tc0Var2;
        this.d = tc0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        tc0 tc0Var = this.b;
        tc0Var.setItemCount(i12);
        tc0 tc0Var2 = this.c;
        tc0Var2.setItemCount(i12);
        tc0 tc0Var3 = this.d;
        tc0Var3.setItemCount(i12);
        tc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        tc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        tc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
