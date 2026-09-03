package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dz0 extends org.telegram.ui.Components.xh0 {
    public final /* synthetic */ ProfileActivity p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, ty0 ty0Var, cz0 cz0Var, org.telegram.ui.Components.sh0 sh0Var, org.telegram.ui.Components.oh0 oh0Var) {
        super(context, j10, kVar, ty0Var, cz0Var, sh0Var, oh0Var);
        this.p1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.xh0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.p1;
        profileActivity.k5 = f10;
        profileActivity.B3();
    }
}
