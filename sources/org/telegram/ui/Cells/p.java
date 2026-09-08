package org.telegram.ui.Cells;

import android.util.DisplayMetrics;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
