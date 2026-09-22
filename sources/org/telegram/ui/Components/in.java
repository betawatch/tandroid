package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class in extends s4.d0 {
    public final /* synthetic */ hg.g0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(hg.g0 g0Var, Context context) {
        super(context);
        this.r = g0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        int i11;
        un unVar = (un) this.r.V;
        if (unVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (unVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!unVar.V0) {
            k10 = org.telegram.messenger.y0.z(7.0f, unVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (unVar.V0 && k10 == 0 && (i11 = unVar.W0) >= 0) {
            un.K(unVar, i11);
            unVar.W0 = -1;
        }
        unVar.V0 = false;
        return k10;
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
