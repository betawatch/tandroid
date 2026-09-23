package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.tc0 b;
    public final /* synthetic */ k40 c;
    public final /* synthetic */ l40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o40(LaunchActivity launchActivity, org.telegram.ui.Components.tc0 tc0Var, k40 k40Var, l40 l40Var) {
        super(launchActivity);
        this.b = tc0Var;
        this.c = k40Var;
        this.d = l40Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.tc0 tc0Var = this.b;
        tc0Var.setItemCount(5);
        k40 k40Var = this.c;
        k40Var.setItemCount(5);
        l40 l40Var = this.d;
        l40Var.setItemCount(5);
        tc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
