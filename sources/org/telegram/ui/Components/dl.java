package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dl extends s4.d0 {
    public final /* synthetic */ gg.j0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(gg.j0 j0Var, Context context) {
        super(context);
        this.r = j0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        ll llVar = (ll) this.r.V;
        return k10 - (llVar.P.getPaddingTop() - (llVar.A0 - llVar.z0));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
