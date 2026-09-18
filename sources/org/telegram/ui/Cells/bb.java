package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h01;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class bb {
    public final h01 a;
    public h01 b;
    public final boolean c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new h01(charSequence, 12.0f, null);
        this.b = new h01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
