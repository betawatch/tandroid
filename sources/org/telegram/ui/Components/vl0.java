package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vl0 extends zu0 {
    public final /* synthetic */ int L;
    public final /* synthetic */ org.telegram.ui.cw M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vl0(org.telegram.ui.cw cwVar, Context context, iz izVar, int i3) {
        super(context, izVar, 1, null);
        this.L = i3;
        this.M = cwVar;
    }

    @Override // org.telegram.ui.Components.zu0, android.view.View
    public final void setVisibility(int i3) {
        switch (this.L) {
            case 0:
                if (this.M.P0.getTag() == null) {
                    super.setVisibility(i3);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (this.M.P0.getTag() == null) {
                    super.setVisibility(i3);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (this.M.P0.getTag() == null) {
                    super.setVisibility(i3);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (this.M.P0.getTag() == null) {
                    super.setVisibility(i3);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
