package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe0 implements u0.g, c5 {
    public final /* synthetic */ af0 a;

    public /* synthetic */ pe0(af0 af0Var) {
        this.a = af0Var;
    }

    @Override // org.telegram.ui.Components.c5
    public void J(int i10, int i11, boolean z10) {
        af0 af0Var = this.a;
        af0Var.K.a(af0Var.N, z10, i10, 0L);
        af0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.G(!r2.s);
    }
}
