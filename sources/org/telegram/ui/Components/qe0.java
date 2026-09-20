package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class qe0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ xe0 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(xe0 xe0Var, Activity activity) {
        super(activity, null);
        this.u1 = xe0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.u1).containerView;
        viewGroup.invalidate();
    }
}
