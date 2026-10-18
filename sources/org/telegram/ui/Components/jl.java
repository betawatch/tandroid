package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class jl extends s4.c0 {
    public final /* synthetic */ ig.e0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(ig.e0 e0Var, Context context) {
        super(context);
        this.r = e0Var;
    }

    @Override // s4.c0
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        rl rlVar = (rl) this.r.V;
        return k10 - (rlVar.P.getPaddingTop() - (rlVar.A0 - rlVar.z0));
    }

    @Override // s4.c0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
