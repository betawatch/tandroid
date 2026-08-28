package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h3 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.z1[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Activity activity, org.telegram.ui.Cells.z1[] z1VarArr) {
        super(activity);
        this.a = z1VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        org.telegram.ui.Cells.z1[] z1VarArr = this.a;
        if (z1VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), z1VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
