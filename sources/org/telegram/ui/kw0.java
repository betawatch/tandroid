package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kw0 extends org.telegram.ui.Components.ug0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.l lVar, bw0 bw0Var, jw0 jw0Var, org.telegram.ui.Components.qg0 qg0Var, org.telegram.ui.Components.mg0 mg0Var) {
        super(context, j10, lVar, bw0Var, jw0Var, qg0Var, mg0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ug0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.P3();
    }
}
