package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j40 extends Paint {
    public final /* synthetic */ v50 a;

    public j40(v50 v50Var) {
        this.a = v50Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        v50 v50Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
