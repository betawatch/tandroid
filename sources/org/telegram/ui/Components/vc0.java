package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vc0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ bd0 F1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc0(bd0 bd0Var, Activity activity) {
        super(activity, null);
        this.F1 = bd0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.F1.b.invalidate();
    }
}
