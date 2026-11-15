package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class cw0 extends org.telegram.ui.Cells.w8 {
    public final /* synthetic */ iw0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw0(iw0 iw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(18, context, e6Var, z10, z11);
        this.r = iw0Var;
    }

    @Override // org.telegram.ui.Cells.w8
    public final int a(int i7) {
        ProfileActivity profileActivity = this.r.e;
        RectF rectF = ProfileActivity.X6;
        profileActivity.getClass();
        return i7;
    }
}
