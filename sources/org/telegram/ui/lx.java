package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class lx extends org.telegram.ui.Components.q31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.q31.h(new lx());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z9, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.k41 k41Var) {
        mx mxVar = (mx) view;
        mxVar.n = (org.telegram.messenger.c20) r31Var.G;
        mxVar.r = r31Var;
        mxVar.b(r31Var.z, false);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new mx(context, f6Var);
    }
}
