package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lv0 extends org.telegram.ui.ActionBar.z4 {
    public final /* synthetic */ ProfileActivity w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.w0 = profileActivity;
    }

    @Override // org.telegram.ui.ActionBar.z4, te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        super.K(i7, f10, f11, cVar);
        RectF rectF = ProfileActivity.Z6;
        this.w0.A5();
    }
}
