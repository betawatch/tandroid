package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class av0 extends org.telegram.ui.Components.fg0 {
    public final /* synthetic */ ProfileActivity t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, qu0 qu0Var, zu0 zu0Var, org.telegram.ui.Components.bg0 bg0Var, org.telegram.ui.Components.xf0 xf0Var) {
        super(context, j3, kVar, qu0Var, zu0Var, bg0Var, xf0Var);
        this.t1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.fg0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.t1;
        profileActivity.t5 = f10;
        profileActivity.Q3();
    }
}
