package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class r3 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.d2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(Activity activity, org.telegram.ui.Cells.d2[] d2VarArr) {
        super(activity);
        this.a = d2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        org.telegram.ui.Cells.d2[] d2VarArr = this.a;
        if (d2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), d2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
