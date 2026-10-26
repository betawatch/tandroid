package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class z4 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.y1[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(Context context, org.telegram.ui.Cells.y1[] y1VarArr) {
        super(context);
        this.a = y1VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        org.telegram.ui.Cells.y1[] y1VarArr = this.a;
        if (y1VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), AndroidUtilities.dp(7.0f) + y1VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
