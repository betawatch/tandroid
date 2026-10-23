package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class cf0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ jf0 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(jf0 jf0Var, Activity activity) {
        super(activity, null);
        this.u1 = jf0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.u1).containerView;
        viewGroup.invalidate();
    }
}
