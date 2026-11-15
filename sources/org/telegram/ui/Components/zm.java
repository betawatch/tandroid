package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zm extends v4.c0 {
    public final /* synthetic */ kg.c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(kg.c0 c0Var, Context context) {
        super(context);
        this.r = c0Var;
    }

    @Override // v4.c0
    public final int k(int i7, View view) {
        int i10;
        jn jnVar = (jn) this.r.V;
        if (jnVar.W0) {
            i7 = -1;
        }
        int k10 = super.k(i7, view);
        if (jnVar.W0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!jnVar.W0) {
            k10 = org.telegram.messenger.k5.B(7.0f, jnVar.S0 - org.telegram.messenger.g0.m, k10);
        }
        if (jnVar.W0 && k10 == 0 && (i10 = jnVar.X0) >= 0) {
            jn.P(jnVar, i10);
            jnVar.X0 = -1;
        }
        jnVar.W0 = false;
        return k10;
    }

    @Override // v4.c0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
