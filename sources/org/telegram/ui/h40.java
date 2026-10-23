package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
