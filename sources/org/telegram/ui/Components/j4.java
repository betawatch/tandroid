package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ wc0 b;
    public final /* synthetic */ wc0 c;
    public final /* synthetic */ wc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Context context, wc0 wc0Var, wc0 wc0Var2, wc0 wc0Var3) {
        super(context);
        this.b = wc0Var;
        this.c = wc0Var2;
        this.d = wc0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        wc0 wc0Var = this.b;
        wc0Var.setItemCount(i12);
        wc0 wc0Var2 = this.c;
        wc0Var2.setItemCount(i12);
        wc0 wc0Var3 = this.d;
        wc0Var3.setItemCount(i12);
        wc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        wc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        wc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
