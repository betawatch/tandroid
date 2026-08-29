package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class my0 extends org.telegram.ui.Components.kh0 {
    public final /* synthetic */ ProfileActivity o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.l lVar, by0 by0Var, ly0 ly0Var, org.telegram.ui.Components.fh0 fh0Var, org.telegram.ui.Components.bh0 bh0Var) {
        super(context, j10, lVar, by0Var, ly0Var, fh0Var, bh0Var);
        this.o1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.kh0
    public final void setCustomAvatarProgress(float f9) {
        ProfileActivity profileActivity = this.o1;
        profileActivity.j5 = f9;
        profileActivity.B3();
    }
}
