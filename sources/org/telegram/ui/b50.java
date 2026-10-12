package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class b50 extends Paint {
    public final /* synthetic */ n60 a;

    public b50(n60 n60Var) {
        this.a = n60Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        n60 n60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
