package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.fc0 b;
    public final /* synthetic */ w30 c;
    public final /* synthetic */ x30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(LaunchActivity launchActivity, org.telegram.ui.Components.fc0 fc0Var, w30 w30Var, x30 x30Var) {
        super(launchActivity);
        this.b = fc0Var;
        this.c = w30Var;
        this.d = x30Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.fc0 fc0Var = this.b;
        fc0Var.setItemCount(5);
        w30 w30Var = this.c;
        w30Var.setItemCount(5);
        x30 x30Var = this.d;
        x30Var.setItemCount(5);
        fc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        w30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        x30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
