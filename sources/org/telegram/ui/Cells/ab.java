package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f11;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ab {
    public final f11 a;
    public f11 b;
    public final boolean c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new f11(charSequence, 12.0f, null);
        this.b = new f11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
