package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ab {
    public final f01 a;
    public f01 b;
    public final boolean c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new f01(charSequence, 12.0f, null);
        this.b = new f01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
