package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class aj extends FragmentContextView {
    public final /* synthetic */ FrameLayout Y0;
    public final /* synthetic */ ej Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ej ejVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, FrameLayout frameLayout2) {
        super(context, g2Var, frameLayout, false, h6Var);
        this.Z0 = ejVar;
        this.Y0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        this.Z0.y.j(this.Y0, i7 == 0, true);
    }
}
