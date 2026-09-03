package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie0 implements u0.g, y4 {
    public final /* synthetic */ te0 a;

    public /* synthetic */ ie0(te0 te0Var) {
        this.a = te0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        te0 te0Var = this.a;
        te0Var.H.a(te0Var.K, z4, i10, 0L);
        te0Var.dismiss();
    }

    @Override // u0.g
    public void a(NestedScrollView nestedScrollView) {
        this.a.G(!r2.s);
    }
}
