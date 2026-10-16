package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
