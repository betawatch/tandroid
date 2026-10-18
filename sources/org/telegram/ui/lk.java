package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class lk extends kh.e {
    public final /* synthetic */ sn L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(sn snVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, dj djVar, bh.b bVar) {
        super(context, bVar, djVar, d6Var);
        this.L = snVar;
    }

    @Override // kh.e, android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.L.Cc.h(3, i10 == 0, getMeasuredWidth() > 0);
    }
}
