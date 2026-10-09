package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p40 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ org.telegram.ui.Components.ud0 b;
    public final /* synthetic */ l40 c;
    public final /* synthetic */ m40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p40(LaunchActivity launchActivity, org.telegram.ui.Components.ud0 ud0Var, l40 l40Var, m40 m40Var) {
        super(launchActivity);
        this.b = ud0Var;
        this.c = l40Var;
        this.d = m40Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        org.telegram.ui.Components.ud0 ud0Var = this.b;
        ud0Var.setItemCount(5);
        l40 l40Var = this.c;
        l40Var.setItemCount(5);
        m40 m40Var = this.d;
        m40Var.setItemCount(5);
        ud0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        l40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        m40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
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
