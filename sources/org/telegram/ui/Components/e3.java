package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e3 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.c2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(Activity activity, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(activity);
        this.a = c2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        org.telegram.ui.Cells.c2[] c2VarArr = this.a;
        if (c2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), org.telegram.messenger.g0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
