package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h3 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.y1[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Activity activity, org.telegram.ui.Cells.y1[] y1VarArr) {
        super(activity);
        this.a = y1VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.y1[] y1VarArr = this.a;
        if (y1VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), y1VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
