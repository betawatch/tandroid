package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g01;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bb {
    public final g01 a;
    public g01 b;
    public final boolean c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new g01(charSequence, 12.0f, null);
        this.b = new g01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
