package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ln0 extends xw0 {
    public final /* synthetic */ int K;
    public final /* synthetic */ org.telegram.ui.ey L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln0(org.telegram.ui.ey eyVar, Context context, t00 t00Var, int i10) {
        super(context, t00Var, 1, null);
        this.K = i10;
        this.L = eyVar;
    }

    @Override // org.telegram.ui.Components.xw0, android.view.View
    public final void setVisibility(int i10) {
        switch (this.K) {
            case 0:
                if (this.L.M0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (this.L.M0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (this.L.M0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (this.L.M0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
