package org.telegram.ui;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gk0 extends org.telegram.ui.Cells.s8 {
    public ImageView Q;

    @Override // org.telegram.ui.Cells.s8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : (i12 - i10) - AndroidUtilities.dp(41.0f);
        int y3 = org.telegram.messenger.ul.y(24.0f, i13 - i11, 2);
        this.Q.layout(dp, y3, AndroidUtilities.dp(24.0f) + dp, AndroidUtilities.dp(24.0f) + y3);
    }

    @Override // org.telegram.ui.Cells.s8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.Q.measure(i10, i11);
    }
}
