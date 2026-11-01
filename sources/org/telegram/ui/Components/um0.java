package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class um0 extends ew0 {
    public final /* synthetic */ int K;
    public final /* synthetic */ org.telegram.ui.jx L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um0(org.telegram.ui.jx jxVar, Context context, zz zzVar, int i10) {
        super(context, zzVar, 1, null);
        this.K = i10;
        this.L = jxVar;
    }

    @Override // org.telegram.ui.Components.ew0, android.view.View
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
