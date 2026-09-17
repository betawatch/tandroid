package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
