package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g40 extends Paint {
    public final /* synthetic */ s50 a;

    public g40(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        s50 s50Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) s50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) s50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
