package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class q4 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.c2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(Context context, org.telegram.ui.Cells.c2[] c2VarArr) {
        super(context);
        this.a = c2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        org.telegram.ui.Cells.c2[] c2VarArr = this.a;
        if (c2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), org.telegram.messenger.g0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
