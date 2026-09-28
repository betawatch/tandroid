package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v01;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ab {
    public final v01 a;
    public v01 b;
    public final boolean c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new v01(charSequence, 12.0f, null);
        this.b = new v01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
