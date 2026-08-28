package org.telegram.ui.Cells;

import android.util.DisplayMetrics;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p extends f2.n0 {
    @Override // f2.n0
    public final int i(int i9, int i10, int i11, int i12, int i13) {
        return AndroidUtilities.dp(16.0f) + (i11 - i9);
    }

    @Override // f2.n0
    public final float l(DisplayMetrics displayMetrics) {
        return super.l(displayMetrics) * 3.0f;
    }
}
