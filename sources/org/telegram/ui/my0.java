package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class my0 extends org.telegram.ui.Components.ch0 {
    public final /* synthetic */ ProfileActivity o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, by0 by0Var, ly0 ly0Var, org.telegram.ui.Components.xg0 xg0Var, org.telegram.ui.Components.tg0 tg0Var) {
        super(context, j10, kVar, by0Var, ly0Var, xg0Var, tg0Var);
        this.o1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ch0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.o1;
        profileActivity.j5 = f10;
        profileActivity.B3();
    }
}
