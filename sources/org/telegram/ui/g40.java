package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
