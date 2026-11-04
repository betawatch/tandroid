package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dv0 extends org.telegram.ui.ActionBar.y4 {
    public final /* synthetic */ ProfileActivity t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.t0 = profileActivity;
    }

    @Override // org.telegram.ui.ActionBar.y4, qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        super.Y(i3, f10, f11, cVar);
        ProfileActivity.s1(this.t0);
    }
}
