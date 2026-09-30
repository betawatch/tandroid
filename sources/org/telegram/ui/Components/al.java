package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class al extends s4.d0 {
    public final /* synthetic */ hg.g0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(hg.g0 g0Var, Context context) {
        super(context);
        this.r = g0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        il ilVar = (il) this.r.V;
        return k10 - (ilVar.P.getPaddingTop() - (ilVar.A0 - ilVar.z0));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
