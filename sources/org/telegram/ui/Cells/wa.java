package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d11;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class wa {
    public final d11 a;
    public d11 b;
    public final boolean c;
    public final RectF d = new RectF();

    public wa(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new d11(charSequence, 12.0f, null);
        this.b = new d11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
