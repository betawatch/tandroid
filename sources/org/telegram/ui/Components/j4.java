package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ xc0 b;
    public final /* synthetic */ xc0 c;
    public final /* synthetic */ xc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Context context, xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3) {
        super(context);
        this.b = xc0Var;
        this.c = xc0Var2;
        this.d = xc0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        xc0 xc0Var = this.b;
        xc0Var.setItemCount(i12);
        xc0 xc0Var2 = this.c;
        xc0Var2.setItemCount(i12);
        xc0 xc0Var3 = this.d;
        xc0Var3.setItemCount(i12);
        xc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        xc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        xc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
