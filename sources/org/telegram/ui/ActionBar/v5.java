package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ia;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v5 extends ia {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public v5(View view, boolean z10) {
        this.a = z10;
        this.b = view;
    }

    @Override // c8.ia
    public final void b(int i7, int i10) {
        boolean z10 = this.a;
        View view = this.b;
        if (z10) {
            view.invalidate();
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        if ((point.x <= point.y) == (i7 <= i10)) {
            view.invalidate();
        }
    }
}
