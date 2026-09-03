package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class va {
    public final k01 a;
    public k01 b;
    public final boolean c;
    public final RectF d = new RectF();

    public va(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        this.a = new k01(charSequence, 12.0f, null);
        this.b = new k01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z4;
    }
}
