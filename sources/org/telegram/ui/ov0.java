package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ov0 extends org.telegram.ui.ActionBar.y4 {
    public final /* synthetic */ ProfileActivity t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.t0 = profileActivity;
    }

    @Override // org.telegram.ui.ActionBar.y4, te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        super.Y(i7, f10, f11, cVar);
        ProfileActivity.s1(this.t0);
    }
}
