package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xa {
    public final i11 a;
    public i11 b;
    public final boolean c;
    public final RectF d = new RectF();

    public xa(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new i11(charSequence, 12.0f, null);
        this.b = new i11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
