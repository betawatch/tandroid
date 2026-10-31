package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zm extends s4.b0 {
    public final /* synthetic */ ag.d1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(ag.d1 d1Var, Context context) {
        super(context);
        this.r = d1Var;
    }

    @Override // s4.b0
    public final int k(int i10, View view) {
        int i11;
        jn jnVar = (jn) this.r.V;
        if (jnVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (jnVar.V0) {
            k10 += org.telegram.messenger.i0.L(160.0f);
        }
        if (!jnVar.V0) {
            k10 = org.telegram.messenger.m5.B(7.0f, jnVar.R0 - org.telegram.messenger.i0.m, k10);
        }
        if (jnVar.V0 && k10 == 0 && (i11 = jnVar.W0) >= 0) {
            jn.N(jnVar, i11);
            jnVar.W0 = -1;
        }
        jnVar.V0 = false;
        return k10;
    }

    @Override // s4.b0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
