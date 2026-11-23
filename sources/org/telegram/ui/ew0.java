package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ew0 extends org.telegram.ui.Cells.y8 {
    public final /* synthetic */ lw0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew0(lw0 lw0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(18, context, h6Var, z10, z11);
        this.r = lw0Var;
    }

    @Override // org.telegram.ui.Cells.y8
    public final int a(int i7) {
        ProfileActivity profileActivity = this.r.e;
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getClass();
        return i7;
    }
}
