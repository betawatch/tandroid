package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class jz0 extends org.telegram.ui.Components.bi0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, yy0 yy0Var, iz0 iz0Var, org.telegram.ui.Components.wh0 wh0Var, org.telegram.ui.Components.sh0 sh0Var) {
        super(context, j3, kVar, yy0Var, iz0Var, wh0Var, sh0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.bi0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.B3();
    }
}
