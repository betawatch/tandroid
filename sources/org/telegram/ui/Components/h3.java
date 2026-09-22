package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class h3 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.Cells.a2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Activity activity, org.telegram.ui.Cells.a2[] a2VarArr) {
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
