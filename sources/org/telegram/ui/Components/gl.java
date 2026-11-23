package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gl extends v4.d0 {
    public final /* synthetic */ kg.d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(kg.d0 d0Var, Context context) {
        super(context);
        this.r = d0Var;
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
