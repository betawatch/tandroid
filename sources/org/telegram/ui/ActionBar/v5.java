package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ia;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
