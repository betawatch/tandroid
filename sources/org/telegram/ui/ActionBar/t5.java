package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ea;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
