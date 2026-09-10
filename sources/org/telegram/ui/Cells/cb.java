package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t01;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class cb {
    public final t01 a;
    public t01 b;
    public final boolean c;
    public final RectF d = new RectF();

    public cb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new t01(charSequence, 12.0f, null);
        this.b = new t01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
