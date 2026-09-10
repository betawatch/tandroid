package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z4 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.z1[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(Context context, org.telegram.ui.Cells.z1[] z1VarArr) {
        super(context);
        this.a = z1VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.z1[] z1VarArr = this.a;
        if (z1VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), AndroidUtilities.dp(7.0f) + z1VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
