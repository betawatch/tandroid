package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e11;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class wa {
    public final e11 a;
    public e11 b;
    public final boolean c;
    public final RectF d = new RectF();

    public wa(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new e11(charSequence, 12.0f, null);
        this.b = new e11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
