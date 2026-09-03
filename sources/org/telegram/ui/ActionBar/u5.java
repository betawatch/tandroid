package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
