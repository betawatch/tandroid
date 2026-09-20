package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u01;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class bb {
    public final u01 a;
    public u01 b;
    public final boolean c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new u01(charSequence, 12.0f, null);
        this.b = new u01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
