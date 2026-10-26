package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.md0 b;
    public final /* synthetic */ z30 c;
    public final /* synthetic */ a40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(LaunchActivity launchActivity, org.telegram.ui.Components.md0 md0Var, z30 z30Var, a40 a40Var) {
        super(launchActivity);
        this.b = md0Var;
        this.c = z30Var;
        this.d = a40Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.md0 md0Var = this.b;
        md0Var.setItemCount(5);
        z30 z30Var = this.c;
        z30Var.setItemCount(5);
        a40 a40Var = this.d;
        a40Var.setItemCount(5);
        md0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        z30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        a40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
