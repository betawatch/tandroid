package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ga;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class s5 extends ga {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public s5(View view, boolean z10) {
        this.a = z10;
        this.b = view;
    }

    @Override // c8.ga
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
