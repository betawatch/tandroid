package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class gn extends v4.d0 {
    public final /* synthetic */ kg.c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(kg.c0 c0Var, Context context) {
        super(context);
        this.r = c0Var;
    }

    @Override // v4.d0
    public final int k(int i7, View view) {
        int i10;
        rn rnVar = (rn) this.r.V;
        if (rnVar.W0) {
            i7 = -1;
        }
        int k10 = super.k(i7, view);
        if (rnVar.W0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!rnVar.W0) {
            k10 = org.telegram.messenger.f3.B(7.0f, rnVar.S0 - org.telegram.messenger.g0.m, k10);
        }
        if (rnVar.W0 && k10 == 0 && (i10 = rnVar.X0) >= 0) {
            rn.P(rnVar, i10);
            rnVar.X0 = -1;
        }
        rnVar.W0 = false;
        return k10;
    }

    @Override // v4.d0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
