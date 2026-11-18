package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class gw0 extends org.telegram.ui.Cells.i5 {
    public final /* synthetic */ lw0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw0(lw0 lw0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 18, 70, false, i6Var);
        this.w = lw0Var;
    }

    @Override // org.telegram.ui.Cells.i5
    public final int a(int i7) {
        ProfileActivity profileActivity = this.w.e;
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getClass();
        return i7;
    }
}
