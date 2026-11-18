package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q3 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.d2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(Activity activity, org.telegram.ui.Cells.d2[] d2VarArr) {
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
