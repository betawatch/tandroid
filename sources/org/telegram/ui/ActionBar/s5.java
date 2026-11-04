package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import b8.jf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s5 extends jf {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public s5(View view, boolean z10) {
        this.a = z10;
        this.b = view;
    }

    @Override // b8.jf
    public final void b(int i3, int i10) {
        boolean z10 = this.a;
        View view = this.b;
        if (z10) {
            view.invalidate();
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        if ((point.x <= point.y) == (i3 <= i10)) {
            view.invalidate();
        }
    }
}
