package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.yc0 b;
    public final /* synthetic */ j40 c;
    public final /* synthetic */ k40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n40(LaunchActivity launchActivity, org.telegram.ui.Components.yc0 yc0Var, j40 j40Var, k40 k40Var) {
        super(launchActivity);
        this.b = yc0Var;
        this.c = j40Var;
        this.d = k40Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.yc0 yc0Var = this.b;
        yc0Var.setItemCount(5);
        j40 j40Var = this.c;
        j40Var.setItemCount(5);
        k40 k40Var = this.d;
        k40Var.setItemCount(5);
        yc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        j40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        k40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
