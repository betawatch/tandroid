package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t5 extends w7.i0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public t5(View view, boolean z10) {
        this.a = z10;
        this.b = view;
    }

    @Override // w7.i0
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
