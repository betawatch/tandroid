package org.telegram.ui.Cells;

import android.util.DisplayMetrics;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p extends f2.k0 {
    @Override // f2.k0
    public final int i(int i10, int i11, int i12, int i13, int i14) {
        return AndroidUtilities.dp(16.0f) + (i12 - i10);
    }

    @Override // f2.k0
    public final float l(DisplayMetrics displayMetrics) {
        return super.l(displayMetrics) * 3.0f;
    }
}
