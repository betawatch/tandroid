package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ p3 b;
    public final /* synthetic */ r3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(Context context, p3 p3Var, r3 r3Var) {
        super(context);
        this.b = p3Var;
        this.c = r3Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        p3 p3Var = this.b;
        p3Var.setItemCount(i12);
        r3 r3Var = this.c;
        r3Var.setItemCount(i12);
        p3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        r3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
