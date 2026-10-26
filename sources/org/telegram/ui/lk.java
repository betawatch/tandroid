package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lk extends lh.e {
    public final /* synthetic */ un M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(un unVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, cj cjVar, ch.b bVar) {
        super(context, bVar, cjVar, u6Var);
        this.M = unVar;
    }

    @Override // lh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.M.Yc.h(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
