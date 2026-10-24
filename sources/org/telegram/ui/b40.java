package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
