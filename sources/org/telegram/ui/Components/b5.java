package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class b5 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.a2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(Context context, org.telegram.ui.Cells.a2[] a2VarArr) {
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
