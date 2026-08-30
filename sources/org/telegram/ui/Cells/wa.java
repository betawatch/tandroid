package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wa {
    public final k01 a;
    public k01 b;
    public final boolean c;
    public final RectF d = new RectF();

    public wa(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        this.a = new k01(charSequence, 12.0f, null);
        this.b = new k01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z4;
    }
}
