package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i3 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.c2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(Activity activity, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(activity);
        this.a = c2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.c2[] c2VarArr = this.a;
        if (c2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), c2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
