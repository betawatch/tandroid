package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class fw0 extends org.telegram.ui.Cells.h5 {
    public final /* synthetic */ jw0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw0(jw0 jw0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 18, 70, false, f6Var);
        this.w = jw0Var;
    }

    @Override // org.telegram.ui.Cells.h5
    public final int a(int i7) {
        ProfileActivity profileActivity = this.w.e;
        RectF rectF = ProfileActivity.S6;
        profileActivity.getClass();
        return i7;
    }
}
