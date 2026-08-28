package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q5 extends g7.b6 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public q5(View view, boolean z10) {
        this.a = z10;
        this.b = view;
    }

    @Override // g7.b6
    public final void b(int i9, int i10) {
        boolean z10 = this.a;
        View view = this.b;
        if (z10) {
            view.invalidate();
            return;
        }
        Point point = AndroidUtilities.displaySize;
        if ((point.x <= point.y) == (i9 <= i10)) {
            view.invalidate();
        }
    }
}
