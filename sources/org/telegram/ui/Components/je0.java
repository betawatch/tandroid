package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class je0 implements u0.g, y4 {
    public final /* synthetic */ ue0 a;

    public /* synthetic */ je0(ue0 ue0Var) {
        this.a = ue0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        ue0 ue0Var = this.a;
        ue0Var.H.a(ue0Var.K, z4, i10, 0L);
        ue0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.G(!r2.s);
    }
}
