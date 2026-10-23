package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
