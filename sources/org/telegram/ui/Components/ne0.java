package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne0 implements u0.g, d5 {
    public final /* synthetic */ ye0 a;

    public /* synthetic */ ne0(ye0 ye0Var) {
        this.a = ye0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        ye0 ye0Var = this.a;
        ye0Var.K.a(ye0Var.N, z10, i10, 0L);
        ye0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.H(!r2.s);
    }
}
