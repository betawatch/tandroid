package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe0 implements u0.g, d5 {
    public final /* synthetic */ bf0 a;

    public /* synthetic */ qe0(bf0 bf0Var) {
        this.a = bf0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        bf0 bf0Var = this.a;
        bf0Var.K.a(bf0Var.N, z10, i10, 0L);
        bf0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.H(!r2.s);
    }
}
