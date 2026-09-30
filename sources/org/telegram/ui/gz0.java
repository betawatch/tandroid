package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class gz0 extends org.telegram.ui.Components.bi0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, wy0 wy0Var, fz0 fz0Var, org.telegram.ui.Components.wh0 wh0Var, org.telegram.ui.Components.sh0 sh0Var) {
        super(context, j3, kVar, wy0Var, fz0Var, wh0Var, sh0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.bi0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.B3();
    }
}
