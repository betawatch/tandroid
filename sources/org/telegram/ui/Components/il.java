package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class il extends v4.d0 {
    public final /* synthetic */ kg.d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(kg.d0 d0Var, Context context) {
        super(context);
        this.r = d0Var;
    }

    @Override // v4.d0
    public final int k(int i7, View view) {
        int k10 = super.k(i7, view);
        ml mlVar = (ml) this.r.V;
        return k10 - (mlVar.M.getPaddingTop() - (mlVar.r0 - mlVar.q0));
    }

    @Override // v4.d0
    public final int m(int i7) {
        return super.m(i7) * 4;
    }
}
