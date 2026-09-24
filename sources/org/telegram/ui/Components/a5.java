package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class a5 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.a2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Context context, org.telegram.ui.Cells.a2[] a2VarArr) {
        super(context);
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
