package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qm extends u4.c0 {
    public final /* synthetic */ lg.d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(lg.d0 d0Var, Context context) {
        super(context);
        this.r = d0Var;
    }

    @Override // u4.c0
    public final int k(int i3, View view) {
        int i10;
        an anVar = (an) this.r.V;
        if (anVar.W0) {
            i3 = -1;
        }
        int k10 = super.k(i3, view);
        if (anVar.W0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!anVar.W0) {
            k10 = org.telegram.messenger.k5.B(7.0f, anVar.S0 - org.telegram.messenger.g0.m, k10);
        }
        if (anVar.W0 && k10 == 0 && (i10 = anVar.X0) >= 0) {
            an.O(anVar, i10);
            anVar.X0 = -1;
        }
        anVar.W0 = false;
        return k10;
    }

    @Override // u4.c0
    public final int m(int i3) {
        return super.m(i3) * 2;
    }
}
