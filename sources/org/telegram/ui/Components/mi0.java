package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class mi0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ pi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi0(pi0 pi0Var, Activity activity) {
        super(activity);
        this.b = pi0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        pi0 pi0Var = this.b;
        dd0 dd0Var = pi0Var.H;
        dd0 dd0Var2 = pi0Var.G;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        dd0Var2.setItemCount(i12);
        dd0Var.setItemCount(i12);
        dd0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        dd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        pi0Var.N = size;
        if (size != 0) {
            pi0Var.c(false);
        }
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
