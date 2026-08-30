package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.wc0 b;
    public final /* synthetic */ i40 c;
    public final /* synthetic */ j40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m40(LaunchActivity launchActivity, org.telegram.ui.Components.wc0 wc0Var, i40 i40Var, j40 j40Var) {
        super(launchActivity);
        this.b = wc0Var;
        this.c = i40Var;
        this.d = j40Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.wc0 wc0Var = this.b;
        wc0Var.setItemCount(5);
        i40 i40Var = this.c;
        i40Var.setItemCount(5);
        j40 j40Var = this.d;
        j40Var.setItemCount(5);
        wc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
