package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ii0 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ li0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii0(li0 li0Var, Activity activity) {
        super(activity);
        this.b = li0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        li0 li0Var = this.b;
        wc0 wc0Var = li0Var.E;
        wc0 wc0Var2 = li0Var.D;
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        wc0Var2.setItemCount(i12);
        wc0Var.setItemCount(i12);
        wc0Var2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        wc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i12;
        this.a = false;
        int size = View.MeasureSpec.getSize(i10);
        li0Var.K = size;
        if (size != 0) {
            li0Var.c(false);
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
