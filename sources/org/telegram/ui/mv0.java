package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class mv0 extends org.telegram.ui.ActionBar.y4 {
    public final /* synthetic */ ProfileActivity s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.s0 = profileActivity;
    }

    @Override // org.telegram.ui.ActionBar.y4, te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        super.Y(i7, f10, f11, cVar);
        ProfileActivity.s1(this.s0);
    }
}
