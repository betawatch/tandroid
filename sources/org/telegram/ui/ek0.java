package org.telegram.ui;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ek0 extends org.telegram.ui.Cells.n8 {
    public ImageView N;

    @Override // org.telegram.ui.Cells.n8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : (i12 - i10) - AndroidUtilities.dp(41.0f);
        int x10 = b.x(24.0f, i13 - i11, 2);
        this.N.layout(dp, x10, AndroidUtilities.dp(24.0f) + dp, AndroidUtilities.dp(24.0f) + x10);
    }

    @Override // org.telegram.ui.Cells.n8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.N.measure(i10, i11);
    }
}
