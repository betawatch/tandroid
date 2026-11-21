package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class gd0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ md0 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(md0 md0Var, Activity activity) {
        super(activity, null);
        this.G1 = md0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.G1.b.invalidate();
    }
}
