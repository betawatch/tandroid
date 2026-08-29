package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ta {
    public final zz0 a;
    public zz0 b;
    public final boolean c;
    public final RectF d = new RectF();

    public ta(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new zz0(charSequence, 12.0f, null);
        this.b = new zz0(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
