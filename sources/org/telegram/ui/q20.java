package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q20 extends Paint {
    public final /* synthetic */ x30 a;

    public q20(x30 x30Var) {
        this.a = x30Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i3) {
        super.setAlpha(i3);
        ViewGroup viewGroup = this.a.b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
