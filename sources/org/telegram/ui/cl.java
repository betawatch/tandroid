package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cl extends org.telegram.ui.Cells.a0 {
    public final /* synthetic */ fl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(fl flVar, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var);
        this.f = flVar;
    }

    @Override // org.telegram.ui.Cells.a0
    public final int getSideMenuWidth() {
        wm wmVar = this.f.R;
        int i3 = wm.jd;
        return wmVar.l9();
    }
}
