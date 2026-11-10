package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hl extends org.telegram.ui.Cells.f0 {
    public final /* synthetic */ ll L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(ll llVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.L = llVar;
    }

    @Override // org.telegram.ui.Cells.f0
    public final int getSideMenuWidth() {
        cn cnVar = this.L.Q;
        int i7 = cn.kd;
        return cnVar.m9();
    }
}
