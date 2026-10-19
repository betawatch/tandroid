package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
