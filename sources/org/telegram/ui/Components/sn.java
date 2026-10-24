package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class sn extends s4.c0 {
    public final /* synthetic */ ig.d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(ig.d0 d0Var, Context context) {
        super(context);
        this.r = d0Var;
    }

    @Override // s4.c0
    public final int k(int i10, View view) {
        int i11;
        fo foVar = (fo) this.r.V;
        if (foVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (foVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!foVar.V0) {
            k10 = org.telegram.messenger.v0.z(7.0f, foVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (foVar.V0 && k10 == 0 && (i11 = foVar.W0) >= 0) {
            fo.N(foVar, i11);
            foVar.W0 = -1;
        }
        foVar.V0 = false;
        return k10;
    }

    @Override // s4.c0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
