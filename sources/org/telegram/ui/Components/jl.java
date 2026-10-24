package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class jl extends s4.c0 {
    public final /* synthetic */ ig.d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(ig.d0 d0Var, Context context) {
        super(context);
        this.r = d0Var;
    }

    @Override // s4.c0
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        rl rlVar = (rl) this.r.V;
        return k10 - (rlVar.N.getPaddingTop() - (rlVar.y0 - rlVar.x0));
    }

    @Override // s4.c0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
