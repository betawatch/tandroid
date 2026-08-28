package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d40 extends Paint {
    public final /* synthetic */ o50 a;

    public d40(o50 o50Var) {
        this.a = o50Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i9) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i9);
        o50 o50Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
