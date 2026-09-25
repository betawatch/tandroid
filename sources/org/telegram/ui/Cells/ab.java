package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t01;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ab {
    public final t01 a;
    public t01 b;
    public final boolean c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new t01(charSequence, 12.0f, null);
        this.b = new t01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
