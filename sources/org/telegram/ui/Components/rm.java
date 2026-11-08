package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class rm extends v4.c0 {
    public final /* synthetic */ kg.c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(kg.c0 c0Var, Context context) {
        super(context);
        this.r = c0Var;
    }

    @Override // v4.c0
    public final int k(int i7, View view) {
        int i10;
        bn bnVar = (bn) this.r.V;
        if (bnVar.V0) {
            i7 = -1;
        }
        int k10 = super.k(i7, view);
        if (bnVar.V0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!bnVar.V0) {
            k10 = org.telegram.messenger.k5.B(7.0f, bnVar.R0 - org.telegram.messenger.g0.m, k10);
        }
        if (bnVar.V0 && k10 == 0 && (i10 = bnVar.W0) >= 0) {
            bn.O(bnVar, i10);
            bnVar.W0 = -1;
        }
        bnVar.V0 = false;
        return k10;
    }

    @Override // v4.c0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
