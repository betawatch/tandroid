package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mv0 extends org.telegram.ui.ActionBar.a5 {
    public final /* synthetic */ ProfileActivity w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.w0 = profileActivity;
    }

    @Override // org.telegram.ui.ActionBar.a5, te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        super.H(i7, f10, f11, cVar);
        RectF rectF = ProfileActivity.Z6;
        this.w0.A5();
    }
}
