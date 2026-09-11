package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class hn extends s4.d0 {
    public final /* synthetic */ ig.e0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(ig.e0 e0Var, Context context) {
        super(context);
        this.r = e0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        int i11;
        tn tnVar = (tn) this.r.V;
        if (tnVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (tnVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!tnVar.V0) {
            k10 = org.telegram.messenger.w1.z(7.0f, tnVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (tnVar.V0 && k10 == 0 && (i11 = tnVar.W0) >= 0) {
            tn.K(tnVar, i11);
            tnVar.W0 = -1;
        }
        tnVar.V0 = false;
        return k10;
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
