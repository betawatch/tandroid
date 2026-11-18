package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
