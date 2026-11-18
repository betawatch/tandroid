package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class gl extends v4.d0 {
    public final /* synthetic */ kg.c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(kg.c0 c0Var, Context context) {
        super(context);
        this.r = c0Var;
    }

    @Override // v4.d0
    public final int k(int i7, View view) {
        int k10 = super.k(i7, view);
        kl klVar = (kl) this.r.V;
        return k10 - (klVar.M.getPaddingTop() - (klVar.r0 - klVar.q0));
    }

    @Override // v4.d0
    public final int m(int i7) {
        return super.m(i7) * 4;
    }
}
