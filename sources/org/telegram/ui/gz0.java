package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class gz0 extends org.telegram.ui.Components.zh0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, wy0 wy0Var, fz0 fz0Var, org.telegram.ui.Components.uh0 uh0Var, org.telegram.ui.Components.qh0 qh0Var) {
        super(context, j3, kVar, wy0Var, fz0Var, uh0Var, qh0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.zh0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.B3();
    }
}
