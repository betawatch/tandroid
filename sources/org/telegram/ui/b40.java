package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class b40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.qd0 b;
    public final /* synthetic */ x30 c;
    public final /* synthetic */ y30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(LaunchActivity launchActivity, org.telegram.ui.Components.qd0 qd0Var, x30 x30Var, y30 y30Var) {
        super(launchActivity);
        this.b = qd0Var;
        this.c = x30Var;
        this.d = y30Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.qd0 qd0Var = this.b;
        qd0Var.setItemCount(5);
        x30 x30Var = this.c;
        x30Var.setItemCount(5);
        y30 y30Var = this.d;
        y30Var.setItemCount(5);
        qd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        x30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        y30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
