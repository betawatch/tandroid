package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class he0 implements u0.g, y4 {
    public final /* synthetic */ se0 a;

    public /* synthetic */ he0(se0 se0Var) {
        this.a = se0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        se0 se0Var = this.a;
        se0Var.H.a(se0Var.K, z4, i10, 0L);
        se0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.G(!r2.s);
    }
}
