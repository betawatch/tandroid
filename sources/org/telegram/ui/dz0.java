package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dz0 extends org.telegram.ui.Components.wh0 {
    public final /* synthetic */ ProfileActivity p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, ty0 ty0Var, cz0 cz0Var, org.telegram.ui.Components.rh0 rh0Var, org.telegram.ui.Components.nh0 nh0Var) {
        super(context, j10, kVar, ty0Var, cz0Var, rh0Var, nh0Var);
        this.p1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.wh0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.p1;
        profileActivity.k5 = f10;
        profileActivity.B3();
    }
}
