package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ nd0 b;
    public final /* synthetic */ nd0 c;
    public final /* synthetic */ nd0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(Context context, nd0 nd0Var, nd0 nd0Var2, nd0 nd0Var3) {
        super(context);
        this.b = nd0Var;
        this.c = nd0Var2;
        this.d = nd0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        nd0 nd0Var = this.b;
        nd0Var.setItemCount(i12);
        nd0 nd0Var2 = this.c;
        nd0Var2.setItemCount(i12);
        nd0 nd0Var3 = this.d;
        nd0Var3.setItemCount(i12);
        nd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        nd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        nd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
