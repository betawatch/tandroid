package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wm extends f2.l0 {
    public final /* synthetic */ zi r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(zi ziVar, Context context) {
        super(context);
        this.r = ziVar;
    }

    @Override // f2.l0
    public final int k(int i10, View view) {
        int i11;
        in inVar = (in) this.r.V;
        if (inVar.R0) {
            i10 = -1;
        }
        int k10 = super.k(i10, view);
        if (inVar.R0) {
            k10 += AndroidUtilities.dp(160.0f);
        }
        if (!inVar.R0) {
            k10 = org.telegram.messenger.y1.A(7.0f, inVar.N0 - AndroidUtilities.statusBarHeight, k10);
        }
        if (inVar.R0 && k10 == 0 && (i11 = inVar.S0) >= 0) {
            in.K(inVar, i11);
            inVar.S0 = -1;
        }
        inVar.R0 = false;
        return k10;
    }

    @Override // f2.l0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
