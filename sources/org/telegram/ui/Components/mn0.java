package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class mn0 extends zw0 {
    public final /* synthetic */ int K;
    public final /* synthetic */ org.telegram.ui.gy L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn0(org.telegram.ui.gy gyVar, Context context, t00 t00Var, int i10) {
        super(context, t00Var, 1, null);
        this.K = i10;
        this.L = gyVar;
    }

    @Override // org.telegram.ui.Components.zw0, android.view.View
    public final void setVisibility(int i10) {
        switch (this.K) {
            case 0:
                if (this.L.N0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (this.L.N0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (this.L.N0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (this.L.N0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
