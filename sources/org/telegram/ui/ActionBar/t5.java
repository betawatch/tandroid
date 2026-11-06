package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ea;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class t5 extends ea {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public t5(View view, boolean z9) {
        this.a = z9;
        this.b = view;
    }

    @Override // c8.ea
    public final void b(int i7, int i10) {
        boolean z9 = this.a;
        View view = this.b;
        if (z9) {
            view.invalidate();
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        if ((point.x <= point.y) == (i7 <= i10)) {
            view.invalidate();
        }
    }
}
