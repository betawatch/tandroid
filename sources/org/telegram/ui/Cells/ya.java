package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l11;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ya {
    public final l11 a;
    public l11 b;
    public final boolean c;
    public final RectF d = new RectF();

    public ya(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new l11(charSequence, 12.0f, null);
        this.b = new l11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
