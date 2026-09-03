package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fl extends org.telegram.ui.Components.y50 {
    public final /* synthetic */ zn a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(zn znVar, Activity activity, org.telegram.ui.Components.r50 r50Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, r50Var, f6Var, true);
        this.a1 = znVar;
    }

    @Override // org.telegram.ui.Components.y50
    public final void m(boolean z4, boolean z10) {
        super.m(z4, z10);
        this.a1.sc.a(z4, true);
    }
}
