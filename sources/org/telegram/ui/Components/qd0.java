package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements u0.g, x4 {
    public final /* synthetic */ be0 a;

    public /* synthetic */ qd0(be0 be0Var) {
        this.a = be0Var;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        be0 be0Var = this.a;
        be0Var.G.b(be0Var.J, z10, i10, 0L);
        be0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.H(!r2.s);
    }
}
