package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qm extends v4.c0 {
    public final /* synthetic */ kg.c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(kg.c0 c0Var, Context context) {
        super(context);
        this.r = c0Var;
    }

    @Override // v4.c0
    public final int k(int i7, View view) {
        int i10;
        an anVar = (an) this.r.V;
        if (anVar.V0) {
            i7 = -1;
        }
        int k10 = super.k(i7, view);
        if (anVar.V0) {
            k10 += org.telegram.messenger.g0.L(160.0f);
        }
        if (!anVar.V0) {
            k10 = org.telegram.messenger.k5.B(7.0f, anVar.R0 - org.telegram.messenger.g0.m, k10);
        }
        if (anVar.V0 && k10 == 0 && (i10 = anVar.W0) >= 0) {
            an.O(anVar, i10);
            anVar.W0 = -1;
        }
        anVar.V0 = false;
        return k10;
    }

    @Override // v4.c0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
