package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ bc0 b;
    public final /* synthetic */ bc0 c;
    public final /* synthetic */ bc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(Context context, bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3) {
        super(context);
        this.b = bc0Var;
        this.c = bc0Var2;
        this.d = bc0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i11 = point.x > point.y ? 3 : 5;
        bc0 bc0Var = this.b;
        bc0Var.setItemCount(i11);
        bc0 bc0Var2 = this.c;
        bc0Var2.setItemCount(i11);
        bc0 bc0Var3 = this.d;
        bc0Var3.setItemCount(i11);
        bc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
        bc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
        bc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
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
