package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class w4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ gd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(Context context, gd0 gd0Var) {
        super(context);
        this.b = gd0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        this.b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
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
