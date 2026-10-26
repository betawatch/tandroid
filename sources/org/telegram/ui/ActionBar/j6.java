package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j6 extends gb1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ View d;

    public j6(View view, boolean z10) {
        this.c = z10;
        this.d = view;
    }

    @Override // org.telegram.ui.Components.gb1
    public final void P(int i10, int i11) {
        boolean z10 = this.c;
        View view = this.d;
        if (z10) {
            view.invalidate();
            return;
        }
        Point point = AndroidUtilities.displaySize;
        if ((point.x <= point.y) == (i10 <= i11)) {
            view.invalidate();
        }
    }
}
