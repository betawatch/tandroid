package org.telegram.ui.Cells;

import android.util.DisplayMetrics;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
