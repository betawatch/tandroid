package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bz0 extends org.telegram.ui.Components.oi0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, ry0 ry0Var, az0 az0Var, org.telegram.ui.Components.ji0 ji0Var, org.telegram.ui.Components.fi0 fi0Var) {
        super(context, j10, kVar, ry0Var, az0Var, ji0Var, fi0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.oi0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.t5 = f7;
        profileActivity.J3();
    }
}
