package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ln extends s4.d0 {
    public final /* synthetic */ hg.f0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(hg.f0 f0Var, Context context) {
        super(context);
        this.r = f0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        int i11;
        xn xnVar = (xn) this.r.V;
        if (xnVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (xnVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!xnVar.V0) {
            k10 = org.telegram.messenger.q.A(7.0f, xnVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (xnVar.V0 && k10 == 0 && (i11 = xnVar.W0) >= 0) {
            xn.I(xnVar, i11);
            xnVar.W0 = -1;
        }
        xnVar.V0 = false;
        return k10;
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
