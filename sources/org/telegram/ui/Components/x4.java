package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class x4 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.d2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(Context context, org.telegram.ui.Cells.d2[] d2VarArr) {
        super(context);
        this.a = d2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        org.telegram.ui.Cells.d2[] d2VarArr = this.a;
        if (d2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), org.telegram.messenger.g0.L(7.0f) + d2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
