package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g40 extends Paint {
    public final /* synthetic */ r50 a;

    public g40(r50 r50Var) {
        this.a = r50Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        r50 r50Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
