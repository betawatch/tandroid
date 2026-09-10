package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class on extends s4.d0 {
    public final /* synthetic */ gg.j0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(gg.j0 j0Var, Context context) {
        super(context);
        this.r = j0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        int i11;
        zn znVar = (zn) this.r.V;
        if (znVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (znVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!znVar.V0) {
            k10 = org.telegram.messenger.a2.z(7.0f, znVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (znVar.V0 && k10 == 0 && (i11 = znVar.W0) >= 0) {
            zn.K(znVar, i11);
            znVar.W0 = -1;
        }
        znVar.V0 = false;
        return k10;
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
