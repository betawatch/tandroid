package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lx extends org.telegram.ui.Components.w31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.w31.h(new lx());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        mx mxVar = (mx) view;
        mxVar.n = (org.telegram.messenger.c20) x31Var.G;
        mxVar.r = x31Var;
        mxVar.b(x31Var.z, false);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new mx(context, f6Var);
    }
}
