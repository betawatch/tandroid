package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jw0 extends org.telegram.ui.Components.vg0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.l lVar, aw0 aw0Var, iw0 iw0Var, org.telegram.ui.Components.rg0 rg0Var, org.telegram.ui.Components.ng0 ng0Var) {
        super(context, j10, lVar, aw0Var, iw0Var, rg0Var, ng0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.vg0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.Q3();
    }
}
