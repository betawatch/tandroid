package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ja;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v5 extends ja {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public v5(View view, boolean z10) {
        this.a = z10;
        this.b = view;
    }

    @Override // c8.ja
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
