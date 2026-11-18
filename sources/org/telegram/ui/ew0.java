package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ew0 extends org.telegram.ui.Cells.x8 {
    public final /* synthetic */ lw0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew0(lw0 lw0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(18, context, i6Var, z10, z11);
        this.r = lw0Var;
    }

    @Override // org.telegram.ui.Cells.x8
    public final int a(int i7) {
        ProfileActivity profileActivity = this.r.e;
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getClass();
        return i7;
    }
}
