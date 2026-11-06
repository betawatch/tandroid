package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
