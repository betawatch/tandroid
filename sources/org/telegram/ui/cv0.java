package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cv0 extends org.telegram.ui.Components.tf0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, su0 su0Var, bv0 bv0Var, org.telegram.ui.Components.pf0 pf0Var, org.telegram.ui.Components.lf0 lf0Var) {
        super(context, j3, kVar, su0Var, bv0Var, pf0Var, lf0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.tf0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.p5 = f10;
        profileActivity.Q3();
    }
}
