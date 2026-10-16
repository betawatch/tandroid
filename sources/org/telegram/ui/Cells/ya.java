package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ya {
    public final i11 a;
    public i11 b;
    public final boolean c;
    public final RectF d = new RectF();

    public ya(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new i11(charSequence, 12.0f, null);
        this.b = new i11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
