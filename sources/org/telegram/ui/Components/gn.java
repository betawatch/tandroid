package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gn extends v4.d0 {
    public final /* synthetic */ kg.d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(kg.d0 d0Var, Context context) {
        super(context);
        this.r = d0Var;
    }

    @Override // v4.d0
    public final int k(int i7, View view) {
        int i10;
        qn qnVar = (qn) this.r.V;
        if (qnVar.W0) {
            i7 = -1;
        }
        int k10 = super.k(i7, view);
        if (qnVar.W0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!qnVar.W0) {
            k10 = org.telegram.messenger.f3.B(7.0f, qnVar.S0 - org.telegram.messenger.g0.m, k10);
        }
        if (qnVar.W0 && k10 == 0 && (i10 = qnVar.X0) >= 0) {
            qn.P(qnVar, i10);
            qnVar.X0 = -1;
        }
        qnVar.W0 = false;
        return k10;
    }

    @Override // v4.d0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
