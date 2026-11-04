package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qk extends u4.c0 {
    public final /* synthetic */ lg.d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(lg.d0 d0Var, Context context) {
        super(context);
        this.r = d0Var;
    }

    @Override // u4.c0
    public final int k(int i3, View view) {
        int k10 = super.k(i3, view);
        uk ukVar = (uk) this.r.V;
        return k10 - (ukVar.M.getPaddingTop() - (ukVar.r0 - ukVar.q0));
    }

    @Override // u4.c0
    public final int m(int i3) {
        return super.m(i3) * 4;
    }
}
