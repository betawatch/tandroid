package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
