package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ti extends s4.b0 {
    public final /* synthetic */ ag.d1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(ag.d1 d1Var, Context context) {
        super(context);
        this.r = d1Var;
    }

    @Override // s4.b0
    public final int k(int i10, View view) {
        return org.telegram.messenger.m5.B(8.0f, ((ej) this.r.V).s.getPaddingTop() - org.telegram.messenger.i0.m, super.k(i10, view));
    }

    @Override // s4.b0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
