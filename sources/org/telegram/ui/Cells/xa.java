package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class xa {
    public final i11 a;
    public i11 b;
    public final boolean c;
    public final RectF d = new RectF();

    public xa(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new i11(charSequence, 12.0f, null);
        this.b = new i11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
