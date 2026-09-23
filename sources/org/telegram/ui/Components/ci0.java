package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ci0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ fi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci0(fi0 fi0Var, Activity activity) {
        super(activity);
        this.b = fi0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        fi0 fi0Var = this.b;
        tc0 tc0Var = fi0Var.H;
        tc0 tc0Var2 = fi0Var.G;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        tc0Var2.setItemCount(i12);
        tc0Var.setItemCount(i12);
        tc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        tc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        fi0Var.N = size;
        if (size != 0) {
            fi0Var.c(false);
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
