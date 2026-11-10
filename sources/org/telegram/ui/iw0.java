package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class iw0 extends org.telegram.ui.Cells.h5 {
    public final /* synthetic */ mw0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw0(mw0 mw0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, 18, 70, false, h6Var);
        this.w = mw0Var;
    }

    @Override // org.telegram.ui.Cells.h5
    public final int a(int i7) {
        ProfileActivity profileActivity = this.w.e;
        RectF rectF = ProfileActivity.V6;
        profileActivity.getClass();
        return i7;
    }
}
