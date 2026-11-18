package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class gw0 extends org.telegram.ui.Cells.j5 {
    public final /* synthetic */ lw0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw0(lw0 lw0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 18, 70, false, i6Var);
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
