package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.nd0 b;
    public final /* synthetic */ b40 c;
    public final /* synthetic */ c40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(LaunchActivity launchActivity, org.telegram.ui.Components.nd0 nd0Var, b40 b40Var, c40 c40Var) {
        super(launchActivity);
        this.b = nd0Var;
        this.c = b40Var;
        this.d = c40Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.nd0 nd0Var = this.b;
        nd0Var.setItemCount(5);
        b40 b40Var = this.c;
        b40Var.setItemCount(5);
        c40 c40Var = this.d;
        c40Var.setItemCount(5);
        nd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        b40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        c40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
