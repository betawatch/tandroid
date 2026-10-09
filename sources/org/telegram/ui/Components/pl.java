package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pl extends s4.e0 {
    public final /* synthetic */ hg.f0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(hg.f0 f0Var, Context context) {
        super(context);
        this.r = f0Var;
    }

    @Override // s4.e0
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        xl xlVar = (xl) this.r.V;
        return k10 - (xlVar.P.getPaddingTop() - (xlVar.A0 - xlVar.z0));
    }

    @Override // s4.e0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
