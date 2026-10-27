package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nk extends lh.e {
    public final /* synthetic */ wn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(wn wnVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, fj fjVar, ch.b bVar) {
        super(context, bVar, fjVar, u6Var);
        this.M = wnVar;
    }

    @Override // lh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.M.cd.h(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
