package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ew0 extends org.telegram.ui.Cells.h5 {
    public final /* synthetic */ iw0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew0(iw0 iw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 18, 70, false, e6Var);
        this.w = iw0Var;
    }

    @Override // org.telegram.ui.Cells.h5
    public final int a(int i7) {
        ProfileActivity profileActivity = this.w.e;
        RectF rectF = ProfileActivity.X6;
        profileActivity.getClass();
        return i7;
    }
}
