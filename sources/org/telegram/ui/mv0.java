package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
