package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class m40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.ed0 b;
    public final /* synthetic */ i40 c;
    public final /* synthetic */ j40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m40(LaunchActivity launchActivity, org.telegram.ui.Components.ed0 ed0Var, i40 i40Var, j40 j40Var) {
        super(launchActivity);
        this.b = ed0Var;
        this.c = i40Var;
        this.d = j40Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.ed0 ed0Var = this.b;
        ed0Var.setItemCount(5);
        i40 i40Var = this.c;
        i40Var.setItemCount(5);
        j40 j40Var = this.d;
        j40Var.setItemCount(5);
        ed0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        i40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        j40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
