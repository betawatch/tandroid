package org.telegram.ui.Cells;

import android.util.DisplayMetrics;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p extends s4.d0 {
    @Override // s4.d0
    public final int i(int i10, int i11, int i12, int i13, int i14) {
        return AndroidUtilities.dp(16.0f) + (i12 - i10);
    }

    @Override // s4.d0
    public final float l(DisplayMetrics displayMetrics) {
        return super.l(displayMetrics) * 3.0f;
    }
}
