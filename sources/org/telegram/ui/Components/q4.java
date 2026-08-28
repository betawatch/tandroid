package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ bc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(Context context, bc0 bc0Var) {
        super(context);
        this.b = bc0Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        this.a = true;
        this.b.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
        this.a = false;
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
