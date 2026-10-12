package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ml extends s4.c0 {
    public final /* synthetic */ ig.e0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(ig.e0 e0Var, Context context) {
        super(context);
        this.r = e0Var;
    }

    @Override // s4.c0
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        ul ulVar = (ul) this.r.V;
        return k10 - (ulVar.P.getPaddingTop() - (ulVar.A0 - ulVar.z0));
    }

    @Override // s4.c0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
