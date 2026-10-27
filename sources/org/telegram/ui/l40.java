package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l40 extends Paint {
    public final /* synthetic */ x50 a;

    public l40(x50 x50Var) {
        this.a = x50Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        x50 x50Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
