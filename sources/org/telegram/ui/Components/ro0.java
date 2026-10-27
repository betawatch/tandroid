package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ro0 extends fy0 {
    public final /* synthetic */ int K;
    public final /* synthetic */ org.telegram.ui.mx L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ro0(org.telegram.ui.mx mxVar, Context context, c10 c10Var, int i10) {
        super(context, c10Var, 1, null);
        this.K = i10;
        this.L = mxVar;
    }

    @Override // org.telegram.ui.Components.fy0, android.view.View
    public final void setVisibility(int i10) {
        switch (this.K) {
            case 0:
                if (this.L.O0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (this.L.O0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (this.L.O0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (this.L.O0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
