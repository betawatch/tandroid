package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe0 implements u0.g, d5 {
    public final /* synthetic */ bf0 a;

    public /* synthetic */ qe0(bf0 bf0Var) {
        this.a = bf0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        bf0 bf0Var = this.a;
        bf0Var.K.a(bf0Var.N, z10, i10, 0L);
        bf0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.F(!r2.s);
    }
}
