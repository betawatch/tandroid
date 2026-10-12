package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h11;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ya {
    public final h11 a;
    public h11 b;
    public final boolean c;
    public final RectF d = new RectF();

    public ya(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new h11(charSequence, 12.0f, null);
        this.b = new h11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
