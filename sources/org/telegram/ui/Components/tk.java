package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tk extends s4.b0 {
    public final /* synthetic */ ag.d1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(ag.d1 d1Var, Context context) {
        super(context);
        this.r = d1Var;
    }

    @Override // s4.b0
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        bl blVar = (bl) this.r.V;
        return k10 - (blVar.N.getPaddingTop() - (blVar.x0 - blVar.w0));
    }

    @Override // s4.b0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
