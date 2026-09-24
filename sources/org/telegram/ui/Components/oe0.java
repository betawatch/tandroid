package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe0 implements u0.g, d5 {
    public final /* synthetic */ ze0 a;

    public /* synthetic */ oe0(ze0 ze0Var) {
        this.a = ze0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        ze0 ze0Var = this.a;
        ze0Var.K.a(ze0Var.N, z10, i10, 0L);
        ze0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.H(!r2.s);
    }
}
