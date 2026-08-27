package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ta {
    public final pz0 a;
    public pz0 b;
    public final boolean c;
    public final RectF d = new RectF();

    public ta(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.a = new pz0(charSequence, 12.0f, null);
        this.b = new pz0(charSequence2, 12.0f, AndroidUtilities.bold());
        this.c = z10;
    }
}
