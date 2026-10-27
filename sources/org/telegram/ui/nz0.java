package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nz0 extends org.telegram.ui.ActionBar.r5 {
    public final /* synthetic */ ProfileActivity m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.m0 = profileActivity;
    }

    @Override // org.telegram.ui.ActionBar.r5, oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        super.E(i10, f7, f10, eVar);
        ProfileActivity.m1(this.m0);
    }
}
