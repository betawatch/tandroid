package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd0 implements u0.g, b5 {
    public final /* synthetic */ ke0 a;

    public /* synthetic */ zd0(ke0 ke0Var) {
        this.a = ke0Var;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        ke0 ke0Var = this.a;
        ke0Var.G.a(ke0Var.J, z10, i10, 0L);
        ke0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.G(!r2.s);
    }
}
