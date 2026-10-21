package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class e40 extends Paint {
    public final /* synthetic */ q50 a;

    public e40(q50 q50Var) {
        this.a = q50Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        q50 q50Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
