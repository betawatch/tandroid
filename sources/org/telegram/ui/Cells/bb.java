package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r11;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bb {
    public final r11 a;
    public r11 b;
    public final boolean c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new r11(charSequence, 12.0f, null);
        this.b = new r11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
