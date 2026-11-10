package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rk extends v4.c0 {
    public final /* synthetic */ kg.c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(kg.c0 c0Var, Context context) {
        super(context);
        this.r = c0Var;
    }

    @Override // v4.c0
    public final int k(int i7, View view) {
        int k10 = super.k(i7, view);
        vk vkVar = (vk) this.r.V;
        return k10 - (vkVar.L.getPaddingTop() - (vkVar.q0 - vkVar.p0));
    }

    @Override // v4.c0
    public final int m(int i7) {
        return super.m(i7) * 4;
    }
}
