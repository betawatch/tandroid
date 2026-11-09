package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hw0 extends org.telegram.ui.Cells.h5 {
    public final /* synthetic */ lw0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw0(lw0 lw0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 18, 70, false, g6Var);
        this.w = lw0Var;
    }

    @Override // org.telegram.ui.Cells.h5
    public final int a(int i7) {
        ProfileActivity profileActivity = this.w.e;
        RectF rectF = ProfileActivity.V6;
        profileActivity.getClass();
        return i7;
    }
}
