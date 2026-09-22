package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class w4 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.z1[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(Context context, org.telegram.ui.Cells.z1[] z1VarArr) {
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
