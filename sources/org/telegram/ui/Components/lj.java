package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lj extends v4.c0 {
    public final /* synthetic */ kg.c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(kg.c0 c0Var, Context context) {
        super(context);
        this.r = c0Var;
    }

    @Override // v4.c0
    public final int k(int i7, View view) {
        return org.telegram.messenger.k5.B(56.0f, ((vj) this.r.V).r.getPaddingTop() - org.telegram.messenger.g0.m, super.k(i7, view));
    }

    @Override // v4.c0
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
