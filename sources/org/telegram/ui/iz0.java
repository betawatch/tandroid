package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class iz0 extends org.telegram.ui.Components.ph0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, yy0 yy0Var, hz0 hz0Var, org.telegram.ui.Components.kh0 kh0Var, org.telegram.ui.Components.gh0 gh0Var) {
        super(context, j3, kVar, yy0Var, hz0Var, kh0Var, gh0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ph0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.B3();
    }
}
