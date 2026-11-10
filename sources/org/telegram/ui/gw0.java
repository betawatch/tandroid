package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gw0 extends org.telegram.ui.Cells.x8 {
    public final /* synthetic */ mw0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw0(mw0 mw0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        super(18, context, h6Var, z9, z10);
        this.r = mw0Var;
    }

    @Override // org.telegram.ui.Cells.x8
    public final int a(int i7) {
        ProfileActivity profileActivity = this.r.e;
        RectF rectF = ProfileActivity.V6;
        profileActivity.getClass();
        return i7;
    }
}
