package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ea;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v5 extends ea {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public v5(View view, boolean z9) {
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
