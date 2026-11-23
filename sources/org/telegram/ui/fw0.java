package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fw0 extends org.telegram.ui.Cells.i5 {
    public final /* synthetic */ jw0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw0(jw0 jw0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 18, 70, false, i6Var);
        this.w = jw0Var;
    }

    @Override // org.telegram.ui.Cells.i5
    public final int a(int i7) {
        ProfileActivity profileActivity = this.w.e;
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getClass();
        return i7;
    }
}
