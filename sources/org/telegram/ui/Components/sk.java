package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class sk extends v4.c0 {
    public final /* synthetic */ kg.c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(kg.c0 c0Var, Context context) {
        super(context);
        this.r = c0Var;
    }

    @Override // v4.c0
    public final int k(int i7, View view) {
        int k10 = super.k(i7, view);
        wk wkVar = (wk) this.r.V;
        return k10 - (wkVar.L.getPaddingTop() - (wkVar.q0 - wkVar.p0));
    }

    @Override // v4.c0
    public final int m(int i7) {
        return super.m(i7) * 4;
    }
}
