package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class r5 extends w7.j0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public r5(View view, boolean z10) {
        this.a = z10;
        this.b = view;
    }

    @Override // w7.j0
    public final void b(int i10, int i11) {
        boolean z10 = this.a;
        View view = this.b;
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
