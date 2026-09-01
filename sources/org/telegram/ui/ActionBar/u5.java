package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u5 extends k7.z5 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;

    public u5(View view, boolean z4) {
        this.a = z4;
        this.b = view;
    }

    @Override // k7.z5
    public final void b(int i10, int i11) {
        boolean z4 = this.a;
        View view = this.b;
        if (z4) {
            view.invalidate();
            return;
        }
        Point point = AndroidUtilities.displaySize;
        if ((point.x <= point.y) == (i10 <= i11)) {
            view.invalidate();
        }
    }
}
