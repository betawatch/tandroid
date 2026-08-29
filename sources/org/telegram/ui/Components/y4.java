package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y4 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.y1[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(Context context, org.telegram.ui.Cells.y1[] y1VarArr) {
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
