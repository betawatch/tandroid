package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class dv0 extends org.telegram.ui.Components.sf0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.l lVar, tu0 tu0Var, cv0 cv0Var, org.telegram.ui.Components.of0 of0Var, org.telegram.ui.Components.kf0 kf0Var) {
        super(context, j3, lVar, tu0Var, cv0Var, of0Var, kf0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.sf0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.p5 = f10;
        profileActivity.Q3();
    }
}
