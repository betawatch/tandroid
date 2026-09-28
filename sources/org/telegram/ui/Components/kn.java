package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class kn extends s4.d0 {
    public final /* synthetic */ hg.g0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(hg.g0 g0Var, Context context) {
        super(context);
        this.r = g0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        int i11;
        wn wnVar = (wn) this.r.V;
        if (wnVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (wnVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!wnVar.V0) {
            k10 = org.telegram.messenger.f0.A(7.0f, wnVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (wnVar.V0 && k10 == 0 && (i11 = wnVar.W0) >= 0) {
            wn.K(wnVar, i11);
            wnVar.W0 = -1;
        }
        wnVar.V0 = false;
        return k10;
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
