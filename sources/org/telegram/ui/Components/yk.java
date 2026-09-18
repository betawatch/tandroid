package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class yk extends s4.d0 {
    public final /* synthetic */ hg.e0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(hg.e0 e0Var, Context context) {
        super(context);
        this.r = e0Var;
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
