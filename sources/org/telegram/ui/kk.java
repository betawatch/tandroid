package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class kk extends kh.e {
    public final /* synthetic */ sn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(sn snVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, bj bjVar, bh.b bVar) {
        super(context, bVar, bjVar, g6Var);
        this.L = snVar;
    }

    @Override // kh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Pc.h(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
