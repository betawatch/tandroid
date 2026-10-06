package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class bl extends s4.d0 {
    public final /* synthetic */ hg.f0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(hg.f0 f0Var, Context context) {
        super(context);
        this.r = f0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        jl jlVar = (jl) this.r.V;
        return k10 - (jlVar.P.getPaddingTop() - (jlVar.A0 - jlVar.z0));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
