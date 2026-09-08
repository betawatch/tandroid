package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gl extends org.telegram.ui.Components.w50 {
    public final /* synthetic */ co d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(co coVar, Activity activity, org.telegram.ui.Components.o50 o50Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, o50Var, f6Var, true);
        this.d1 = coVar;
    }

    @Override // org.telegram.ui.Components.w50
    public final void m(boolean z10, boolean z11) {
        super.m(z10, z11);
        this.d1.vc.a(z10, true);
    }
}
