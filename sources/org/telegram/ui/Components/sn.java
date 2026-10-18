package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class sn extends s4.c0 {
    public final /* synthetic */ ig.e0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(ig.e0 e0Var, Context context) {
        super(context);
        this.r = e0Var;
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
            k10 = org.telegram.messenger.g0.A(7.0f, foVar.R0 - AndroidUtilities.statusBarHeight, k10);
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
