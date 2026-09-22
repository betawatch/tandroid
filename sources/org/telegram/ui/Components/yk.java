package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class yk extends s4.d0 {
    public final /* synthetic */ hg.g0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(hg.g0 g0Var, Context context) {
        super(context);
        this.r = g0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        gl glVar = (gl) this.r.V;
        return k10 - (glVar.P.getPaddingTop() - (glVar.A0 - glVar.z0));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
