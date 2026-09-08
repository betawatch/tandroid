package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ q3 b;
    public final /* synthetic */ s3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(Context context, q3 q3Var, s3 s3Var) {
        super(context);
        this.b = q3Var;
        this.c = s3Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        q3 q3Var = this.b;
        q3Var.setItemCount(i12);
        s3 s3Var = this.c;
        s3Var.setItemCount(i12);
        q3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        s3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
