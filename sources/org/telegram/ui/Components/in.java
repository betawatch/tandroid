package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class in extends v4.d0 {
    public final /* synthetic */ kg.d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(kg.d0 d0Var, Context context) {
        super(context);
        this.r = d0Var;
    }

    @Override // v4.d0
    public final int k(int i7, View view) {
        int i10;
        tn tnVar = (tn) this.r.V;
        if (tnVar.W0) {
            i7 = -1;
        }
        int k10 = super.k(i7, view);
        if (tnVar.W0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!tnVar.W0) {
            k10 = org.telegram.messenger.f3.B(7.0f, tnVar.S0 - org.telegram.messenger.g0.m, k10);
        }
        if (tnVar.W0 && k10 == 0 && (i10 = tnVar.X0) >= 0) {
            tn.P(tnVar, i10);
            tnVar.X0 = -1;
        }
        tnVar.W0 = false;
        return k10;
    }

    @Override // v4.d0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
