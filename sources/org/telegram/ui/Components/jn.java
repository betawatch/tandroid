package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class jn extends s4.d0 {
    public final /* synthetic */ hg.g0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(hg.g0 g0Var, Context context) {
        super(context);
        this.r = g0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        int i11;
        vn vnVar = (vn) this.r.V;
        if (vnVar.V0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (vnVar.V0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!vnVar.V0) {
            k10 = org.telegram.messenger.f0.A(7.0f, vnVar.R0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (vnVar.V0 && k10 == 0 && (i11 = vnVar.W0) >= 0) {
            vn.K(vnVar, i11);
            vnVar.W0 = -1;
        }
        vnVar.V0 = false;
        return k10;
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
