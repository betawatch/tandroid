package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld0 implements u0.g, x4 {
    public final /* synthetic */ wd0 a;

    public /* synthetic */ ld0(wd0 wd0Var) {
        this.a = wd0Var;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        wd0 wd0Var = this.a;
        wd0Var.G.b(wd0Var.J, z10, i9, 0L);
        wd0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.G(!r2.s);
    }
}
