package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class en extends f2.j0 {
    public final /* synthetic */ ej r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(ej ejVar, Context context) {
        super(context);
        this.r = ejVar;
    }

    @Override // f2.j0
    public final int k(int i10, View view) {
        int i11;
        pn pnVar = (pn) this.r.V;
        if (pnVar.S0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (pnVar.S0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!pnVar.S0) {
            k10 = org.telegram.messenger.y3.z(7.0f, pnVar.O0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (pnVar.S0 && k10 == 0 && (i11 = pnVar.T0) >= 0) {
            pn.J(pnVar, i11);
            pnVar.T0 = -1;
        }
        pnVar.S0 = false;
        return k10;
    }

    @Override // f2.j0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
