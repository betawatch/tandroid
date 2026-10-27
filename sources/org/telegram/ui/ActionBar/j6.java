package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class j6 extends kb1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ View d;

    public j6(View view, boolean z10) {
        this.c = z10;
        this.d = view;
    }

    @Override // org.telegram.ui.Components.kb1
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
