package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
