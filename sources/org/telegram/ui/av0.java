package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class av0 extends org.telegram.ui.Components.sf0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, qu0 qu0Var, zu0 zu0Var, org.telegram.ui.Components.of0 of0Var, org.telegram.ui.Components.kf0 kf0Var) {
        super(context, j3, kVar, qu0Var, zu0Var, of0Var, kf0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.sf0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f10;
        profileActivity.Q3();
    }
}
