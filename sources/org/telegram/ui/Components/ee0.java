package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements u0.g, d5 {
    public final /* synthetic */ pe0 a;

    public /* synthetic */ ee0(pe0 pe0Var) {
        this.a = pe0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        pe0 pe0Var = this.a;
        pe0Var.K.b(pe0Var.N, z10, i10, 0L);
        pe0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.H(!r2.s);
    }
}
