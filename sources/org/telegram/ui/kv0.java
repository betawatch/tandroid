package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class kv0 extends org.telegram.ui.ActionBar.w4 {
    public final /* synthetic */ ProfileActivity u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.u0 = profileActivity;
    }

    @Override // org.telegram.ui.ActionBar.w4, te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        super.G(i7, f10, f11, cVar);
        RectF rectF = ProfileActivity.X6;
        this.u0.z5();
    }
}
