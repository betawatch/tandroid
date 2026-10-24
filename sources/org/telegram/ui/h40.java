package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class h40 extends Paint {
    public final /* synthetic */ u50 a;

    public h40(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        u50 u50Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
