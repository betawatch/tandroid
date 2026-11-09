package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ea;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u5 extends ea {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public u5(View view, boolean z9) {
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
