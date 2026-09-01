package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tk extends f2.k0 {
    public final /* synthetic */ gj r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(gj gjVar, Context context) {
        super(context);
        this.r = gjVar;
    }

    @Override // f2.k0
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        cl clVar = (cl) this.r.V;
        return k10 - (clVar.M.getPaddingTop() - (clVar.x0 - clVar.w0));
    }

    @Override // f2.k0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
