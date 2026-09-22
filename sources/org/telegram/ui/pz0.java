package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class pz0 extends org.telegram.ui.Components.bi0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, fz0 fz0Var, oz0 oz0Var, org.telegram.ui.Components.wh0 wh0Var, org.telegram.ui.Components.sh0 sh0Var) {
        super(context, j3, kVar, fz0Var, oz0Var, wh0Var, sh0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.bi0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.B3();
    }
}
