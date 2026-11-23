package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class av0 extends org.telegram.ui.Components.hg0 {
    public final /* synthetic */ ProfileActivity t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, qu0 qu0Var, zu0 zu0Var, org.telegram.ui.Components.dg0 dg0Var, org.telegram.ui.Components.zf0 zf0Var) {
        super(context, j3, kVar, qu0Var, zu0Var, dg0Var, zf0Var);
        this.t1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.hg0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.t1;
        profileActivity.t5 = f10;
        profileActivity.Q3();
    }
}
