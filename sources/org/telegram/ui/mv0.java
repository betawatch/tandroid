package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class mv0 extends org.telegram.ui.ActionBar.z4 {
    public final /* synthetic */ ProfileActivity w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.w0 = profileActivity;
    }

    @Override // org.telegram.ui.ActionBar.z4, te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        super.H(i7, f10, f11, cVar);
        RectF rectF = ProfileActivity.Z6;
        this.w0.A5();
    }
}
