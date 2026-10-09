package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pz0 extends org.telegram.ui.Components.ti0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, ez0 ez0Var, oz0 oz0Var, org.telegram.ui.Components.oi0 oi0Var, org.telegram.ui.Components.ki0 ki0Var) {
        super(context, j3, kVar, ez0Var, oz0Var, oi0Var, ki0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ti0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.B3();
    }
}
