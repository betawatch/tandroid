package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
