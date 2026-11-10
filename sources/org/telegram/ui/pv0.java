package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pv0 extends org.telegram.ui.ActionBar.z4 {
    public final /* synthetic */ ProfileActivity t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.t0 = profileActivity;
    }

    @Override // org.telegram.ui.ActionBar.z4, te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        super.Y(i7, f10, f11, cVar);
        ProfileActivity.s1(this.t0);
    }
}
