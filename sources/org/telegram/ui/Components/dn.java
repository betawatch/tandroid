package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dn extends f2.k0 {
    public final /* synthetic */ gj r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(gj gjVar, Context context) {
        super(context);
        this.r = gjVar;
    }

    @Override // f2.k0
    public final int k(int i10, View view) {
        int i11;
        on onVar = (on) this.r.V;
        if (onVar.R0) {
            i10 = -1;
        }
        int k9 = super.k(i10, view);
        if (onVar.R0) {
            k9 += AndroidUtilities.dp(160.0f);
        }
        if (!onVar.R0) {
            k9 = org.telegram.messenger.x3.z(7.0f, onVar.N0 - AndroidUtilities.statusBarHeight, k9);
        }
        if (onVar.R0 && k9 == 0 && (i11 = onVar.S0) >= 0) {
            on.J(onVar, i11);
            onVar.S0 = -1;
        }
        onVar.R0 = false;
        return k9;
    }

    @Override // f2.k0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
