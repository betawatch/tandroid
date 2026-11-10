package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class il extends org.telegram.ui.Cells.a0 {
    public final /* synthetic */ ll f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(ll llVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.f = llVar;
    }

    @Override // org.telegram.ui.Cells.a0
    public final int getSideMenuWidth() {
        cn cnVar = this.f.Q;
        int i7 = cn.kd;
        return cnVar.m9();
    }
}
