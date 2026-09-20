package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class pz0 extends org.telegram.ui.Components.yh0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, fz0 fz0Var, oz0 oz0Var, org.telegram.ui.Components.th0 th0Var, org.telegram.ui.Components.ph0 ph0Var) {
        super(context, j3, kVar, fz0Var, oz0Var, th0Var, ph0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.yh0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.B3();
    }
}
