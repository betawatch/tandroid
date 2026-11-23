package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
