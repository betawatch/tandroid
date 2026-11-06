package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
