package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class my0 extends org.telegram.ui.Components.ah0 {
    public final /* synthetic */ ProfileActivity o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, by0 by0Var, ly0 ly0Var, org.telegram.ui.Components.vg0 vg0Var, org.telegram.ui.Components.rg0 rg0Var) {
        super(context, j10, kVar, by0Var, ly0Var, vg0Var, rg0Var);
        this.o1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ah0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.o1;
        profileActivity.j5 = f10;
        profileActivity.B3();
    }
}
