package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class gw0 extends org.telegram.ui.Cells.j5 {
    public final /* synthetic */ lw0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw0(lw0 lw0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, 18, 70, false, h6Var);
        this.w = lw0Var;
    }

    @Override // org.telegram.ui.Cells.j5
    public final int a(int i7) {
        ProfileActivity profileActivity = this.w.e;
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getClass();
        return i7;
    }
}
