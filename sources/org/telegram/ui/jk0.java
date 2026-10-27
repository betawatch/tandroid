package org.telegram.ui;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jk0 extends org.telegram.ui.Cells.v8 {
    public ImageView W;

    @Override // org.telegram.ui.Cells.v8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : (i12 - i10) - AndroidUtilities.dp(41.0f);
        int B = org.telegram.messenger.wh.B(24.0f, i13 - i11, 2);
        this.W.layout(dp, B, AndroidUtilities.dp(24.0f) + dp, AndroidUtilities.dp(24.0f) + B);
    }

    @Override // org.telegram.ui.Cells.v8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.W.measure(i10, i11);
    }
}
