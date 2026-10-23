package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class jk extends kh.e {
    public final /* synthetic */ qn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(qn qnVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, bj bjVar, bh.b bVar) {
        super(context, bVar, bjVar, d6Var);
        this.L = qnVar;
    }

    @Override // kh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Cc.h(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
