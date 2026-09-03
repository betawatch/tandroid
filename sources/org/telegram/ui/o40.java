package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.xc0 b;
    public final /* synthetic */ k40 c;
    public final /* synthetic */ l40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o40(LaunchActivity launchActivity, org.telegram.ui.Components.xc0 xc0Var, k40 k40Var, l40 l40Var) {
        super(launchActivity);
        this.b = xc0Var;
        this.c = k40Var;
        this.d = l40Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.xc0 xc0Var = this.b;
        xc0Var.setItemCount(5);
        k40 k40Var = this.c;
        k40Var.setItemCount(5);
        l40 l40Var = this.d;
        l40Var.setItemCount(5);
        xc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        k40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        l40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
