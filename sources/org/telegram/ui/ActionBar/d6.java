package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class d6 extends w7.y5 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public d6(View view, boolean z10) {
        this.a = z10;
        this.b = view;
    }

    @Override // w7.y5
    public final void b(int i10, int i11) {
        boolean z10 = this.a;
        View view = this.b;
        if (z10) {
            view.invalidate();
            return;
        }
        Point point = org.telegram.messenger.i0.q;
        if ((point.x <= point.y) == (i10 <= i11)) {
            view.invalidate();
        }
    }
}
