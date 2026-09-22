package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class k3 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.z1[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(Activity activity, org.telegram.ui.Cells.z1[] z1VarArr) {
        super(activity);
        this.a = z1VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.z1[] z1VarArr = this.a;
        if (z1VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), z1VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
