package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class j3 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.a2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(Activity activity, org.telegram.ui.Cells.a2[] a2VarArr) {
        super(activity);
        this.a = a2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.a2[] a2VarArr = this.a;
        if (a2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), AndroidUtilities.dp(7.0f) + a2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
