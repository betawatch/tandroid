package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wa {
    public final nz0 a;
    public nz0 b;
    public final boolean c;
    public final RectF d = new RectF();

    public wa(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new nz0(charSequence, 12.0f, null);
        this.b = new nz0(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
